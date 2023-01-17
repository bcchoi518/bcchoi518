<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file = "../_include/inc_header.jsp" %>
	
<h2>상품목록</h2>

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

<table border="1" width="80%" style="text-align: center;">
	<tr>
		<th>상품번호</th>
		<th>상품이미지</th>
		<th>상품이름</th>
		<th>상품가격</th>
		<th>제조사</th>
		<th>첨부파일</th>
		<th>등록일</th>
	</tr>
	
	<c:if test="${requestScope.totalRecord == 0 }">
		<c:choose>
			<c:when test="${fn:length(requestScope.searchGubun) > 0 }">
				<tr>
					<td colspan="7" height="200px" style="text-align:center;">검색된 결과가 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="7" height="200px" style="text-align:center;">등록된 상품이 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</c:if>
	
	<c:forEach var="dto" items="${requestScope.list }">
		<tr>
			<td>${dto.productNo }</td>
			<td>
				<c:choose>
					<c:when test="${dto.attachInfo == '-' }">
						&nbsp;
					</c:when>
					<c:otherwise>
						<c:set var="fileName" value="${fn:split(dto.attachInfo, ',')[1] }" />
						<c:set var="fileOriginName" value="${fn:split(dto.attachInfo, ',')[0] }" />
						<img alt="${fileOriginName }" title="${fileOriginName }" src="${path }/attach${path }/product/${fileName }" style="width:80px; height:80px;"/>
					</c:otherwise>
				</c:choose>
			</td>
			<td><a href="#" onclick="move('view', '${dto.productNo }')">${dto.productName }</a></td>
			<td>${dto.productPrice }</td>
			<td>${dto.vendorName } (${dto.vendorNo })</td>
			<td>
				<c:choose>
					<c:when test="${dto.attachInfo == '-' }">
						X
					</c:when>
					<c:otherwise>
						O
					</c:otherwise>
				</c:choose>
			</td>
			<td>
				${dto.regiDate }<br>
				<fmt:formatDate value="${dto.regiDate }" pattern="yyyy-MM-dd HH:mm:ss" />
			</td>
		</tr>
	</c:forEach>
</table>

<div style="border: 0px solid red; padding-top:20px; width:80%; text-align:right;">
|
<a href="${path }/product/list">전체목록</a>
|
<a href="#" onclick="move('list')">목록</a>
|
<a href="#" onclick="move('chuga')">등록</a>
|
<a href="#" onclick="move('chugaAttach')">등록(attach)</a>
|
</div>

<%-- searchStart --%>
<div style="border: 0px solid red; width: 80%; margin-top:10px;" align="center">
	<form name="searchForm">
		<select name="searchGubun" id="searchGubun">
			<option value="" selected>-- 선택 --</option>
			<option value="productName" <c:if test="${requestScope.searchGubun == 'productName' }">selected</c:if>>상품이름</option>
			<option value="vendorName" <c:if test="${requestScope.searchGubun == 'vendorName' }">selected</c:if>>제조사이름</option>
			<option value="productName_vendorName" <c:if test="${requestScope.searchGubun == 'productName_vendorName' }">selected</c:if>>상품이름+제조사이름</option>
		</select>
		&nbsp;
		<input type="text" name="searchData" id="searchData" value="${requestScope.searchData }" style="width:150px;"/>
		&nbsp;
		<button type="button" onclick="search()">검색</button>
	</form>
</div>
<%-- searchEnd --%>

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
	function move(value1, value2) {
		let linkAddr = '${path }/product/' + value1;
		if (value2 != undefined) {
			linkAddr += '?productNo='+ value2;
		}//if
		location.href = linkAddr;
	}//move
</script>