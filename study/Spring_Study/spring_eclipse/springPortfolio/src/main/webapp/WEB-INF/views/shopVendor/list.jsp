<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file = "../_include/inc_header.jsp" %>

<h2>제조사 관리</h2>

<%-- 제조사 입력 Start --%>
<form name="DirForm">
	<input type="hidden" name="searchGubun" value="${requestScope.searchGubun }" />
	<input type="hidden" name="searchData" value="${requestScope.searchData }" />
	<input type="hidden" name="procGubun" value="chugaProc" />
	<input type="hidden" name="vendorCode" />
	<table border="0">
		<tr>
			<td style="width:90px; text-align:right;">제조사이름</td>
			<td style="width:200px;"><input type="text" name="vendorName" style="width: 95%;"/></td>
			<td>
				<button type="button" id="btnSave" onclick="save()">등록</button>
			</td>
			<td>
				<button type="button" id="btnReset" onclick="resetForm()">초기화</button>
			</td>
		</tr>
	</table>
</form>
<%-- 제조사 입력 End --%>
<div style="border: 0px solid red; width: 80%; margin-top:10px;" align="left">
	<c:choose>
		<c:when test="${fn:length(requestScope.searchGubun) > 0 }">
			* 검색어 "<span style="color:red; font-weight:bold;">${requestScope.searchData }</span>"으/로 검색된 목록 : ${requestScope.totalRecord }건
		</c:when>
		<c:otherwise>
			* 전체목록: ${requestScope.totalRecord }건
		</c:otherwise>
	</c:choose>
	<c:set var="totalPage" value="${requestScope.pagerMap.totalPage == 0 ? 1 : requestScope.pagerMap.totalPage }" />
	(${requestScope.pageNumber }/${totalPage })
</div>
<%-- 제조사 목록 Start --%>
<table border="1" style="width:80%;">
	<tr>
		<th>순번</th>
		<th>제조사코드</th>
		<th>제조사이름</th>
		<th>등록일</th>
		<th>비고</th>
	</tr>
	<c:if test="${fn:length(requestScope.list) == 0 }">
		<c:choose>
			<c:when test="${fn:length(requestScope.searchGubun) > 0 }">
				<tr>
					<td colspan="7" height="200px" style="text-align:center;">검색된 결과가 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="7" height="200px" style="text-align:center;">등록된 내용이 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</c:if>
	<c:set var="cntDisplay" value="${requestScope.pagerMap.cntDisplay }" />
	<c:forEach var="dto" items="${requestScope.list }">
		<tr>
			<td>${cntDisplay }</td>
			<td>
				${dto.vendorCode }
				<input type="hidden" id="vendorCode_${dto.vendorCode }" value="${dto.vendorCode }" />
			</td>
			<td>
				${dto.vendorName }
				<input type="hidden" id="vendorName_${dto.vendorCode }" value="${dto.vendorName }" />
			</td>
			<td>${dto.regiDate }</td>
			<td>
			<a href="#" onclick="suntaek('sujungProc', '${dto.vendorCode }')">수정</a>
			/
			<a href="#" onclick="suntaek('sakjeProc', '${dto.vendorCode }')">삭제</a>
			</td>
		</tr>
		<c:set var="cntDisplay" value="${cntDisplay - 1 }" />
	</c:forEach>
</table>
<%-- 제조사 목록 End --%>

<%-- search Start --%>
<div style="width:80%; text-align:center; margin-top:20px;">
	<form name="searchForm">
		<select name="searchGubun">
			<option value="" selected>-- 선택 --</option>
			<option value="vendorCode" <c:if test="${requestScope.searchGubun == 'vendorCode' }">selected</c:if>>제조사코드</option>
			<option value="vendorName" <c:if test="${requestScope.searchGubun == 'vendorName' }">selected</c:if>>제조사이름</option>
			<option value="vendorCode_vendorName" <c:if test="${requestScope.searchGubun == 'vendorCode_vendorName' }">selected</c:if>>제조사코드+제조사이름</option>
		</select>
		&nbsp;
		<input type="text" name="searchData" value="${requestScope.searchData }"/>
		&nbsp;
		<button type="button" onclick="search()">검색</button>
		<button type="button" onclick="location.href='${path }/shopVendor/list'">초기화</button>
	</form>
</div>
<%-- search End --%>

<%-- pagerStart --%>
<c:if test="${requestScope.totalRecord > 0 }">
	<div style="border: 0px solid red; width: 80%; margin-top:30px;" align="center">
		<a href="#" onclick="goPage('1')">[첫페이지]</a>
		&nbsp;
		<c:if test="${requestScope.pagerMap.startPage > requestScope.pagerMap.blockSize }">
			<a href="#" onclick="goPage(${requestScope.pagerMap.startPage - requestScope.pagerMap.blockSize })">[이전10개]</a>
		</c:if>
		<c:if test="${requestScope.pagerMap.startPage <= requestScope.pagerMap.blockSize }">
			[이전10개]
		</c:if>
		&nbsp;
		
		<c:forEach var="i" begin="${requestScope.pagerMap.startPage }" end="${requestScope.pagerMap.lastPage }" step="1" >
			<c:if test="${i == requestScope.pageNumber }" >
				[${i }]
			</c:if>
			<c:if test="${i != requestScope.pageNumber }" >
				<a href="#" onclick="goPage(${i })">[${i }]</a>
			</c:if>
			&nbsp;
		</c:forEach>
		
		<c:if test="${requestScope.pagerMap.lastPage < requestScope.pagerMap.totalPage }">
			<a href="#" onclick="goPage(${requestScope.pagerMap.startpage + requestScope.pagerMap.blockSize})">[다음10개]</a>
		</c:if>
		<c:if test="${requestScope.pagerMap.lastPage >= requestScope.pagerMap.totalPage }">
			[다음10개]
		</c:if>
		&nbsp;
		<a href="#" onclick="goPage('${requestScope.pagerMap.totalPage }')">[끝페이지]</a>
	</div>
</c:if>
<%-- pagerEnd --%>

<script>
	const frm = document.DirForm;
	
	function save() {
		const linkAddr = frm.procGubun.value;
		if (confirm('OK?')) {
			frm.action = '${path }/shopVendor/'+ linkAddr;
			frm.method = 'post';
	 		frm.submit();
		}//if
	}//save
	
	function suntaek(value1, value2) {
		frm.procGubun.value = value1;
		frm.vendorCode.value = value2;
		
		if (value1 == 'sujungProc') {
			frm.vendorCode.value = document.querySelector('#vendorCode_' + value2).value
			frm.vendorName.value = document.querySelector('#vendorName_' + value2).value
			document.querySelector('#btnSave').innerText = '수정';
		} else if (value1 == 'sakjeProc') {
			document.querySelector('#btnSave').innerText = '삭제';
			save();
		}//if
	}//suntaek
	
	function resetForm() {
		frm.vendorName.value = '';
		frm.procGubun.value = 'chugaProc';
		document.querySelector('#btnSave').innerText = '등록';
	}//formReset
	
	function search() {
		if (confirm('searchOK?')) {
			document.searchForm.action = '${path }/shopVendor/search';
			document.searchForm.method = 'post';
			document.searchForm.submit();
		}//if
	}//search
	
	function goPage(value1) {
		location.href = '${path }/shopVendor/list?pageNumber='+ value1 +'&searchGubun=${requestScope.searchGubun }&searchData=${requestScope.searchData }';
	}//goPage
</script>