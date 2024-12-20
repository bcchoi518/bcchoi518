<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file = "../_include/inc_header.jsp" %>
<%@ include file = "_inc_top.jsp" %>

<h2>방명록 수정</h2>

<form name="DirForm">
	<input type="hidden" name="searchGubun" id="searchGubun" value="${requestScope.searchGubun }" />
	<input type="hidden" name="searchData" id="searchData" value="${requestScope.searchData }" />
	<input type="hidden" name="pageNumber" id="pageNumber" value="${requestScope.pageNumber }" />
	<input type="hidden" name="no" id="no" value="${requestScope.dto.no }" />
	<table border="1" align="center" width="80%">
		<tr>
			<td style="width:10%;">이름(*)</td>
			<td><input type="text" name="name" id="name" value="${requestScope.dto.name }" /></td>
		</tr>
		<tr>
			<td>비밀번호(*)</td>
			<td><input type="password" name="passwd" id="passwd" value="" /></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>
				<c:set var="emailArray" value="${fn:split(requestScope.dto.email, '@') }" />
				<input type="text" name="email1" style="width:100px" value="${emailArray[0] }"/>
				@
				<input type="text" name="email2" id="email2" style="width:100px" value="${emailArray[1] }" readOnly/>
				<select name="emailSelector" id="emailSelector" onchange="changeEmail2()">
					<option value="">-- 직접입력 --</option>
					<option value="google.com" <c:if test="${emailArray[1] == 'google.com' }">selected</c:if>>google.com</option>
					<option value="naver.com" <c:if test="${emailArray[1] == 'naver.com' }">selected</c:if>>naver.com</option>
					<option value="daum.net" <c:if test="${emailArray[1] == 'daum.net' }">selected</c:if>>daum.net</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content" style="width:99%; height:200px;">${requestScope.dto.content }</textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center" style="height:50px">
				<button type="button" onclick="save()">수정하기</button>
				<button type="button" onclick="move('list')">목록으로</button>
			</td>
		</tr>
	</table>
</form>

<script>
	function changeEmail2() {
		const emailSelector = document.querySelector('#emailSelector');
		const email2 = document.querySelector('#email2');
		const selectedValue = emailSelector.options[emailSelector.selectedIndex].value;
		
		email2.value = selectedValue;
		
		if (selectedValue == '') {
			email2.readOnly = false;
		} else {
			email2.readOnly = true;
		}//if
	}//changeEmail2
	
	function save() {
		if (confirm('OK?')) {
			document.DirForm.action = '${path }/guestBook/sujungProc';
			document.DirForm.method = 'post';
			document.DirForm.submit();
		}//if
	}//save
	
	function move(value1, value2) {
		let linkAddr = '${path }/guestBook/'+ value1 +'?pageNumber=${requestScope.pageNumber }';
		if (value2 != undefined) {
			linkAddr += '&no=' + value2;
		}//if
		linkAddr += '&searchGubun=${requestScope.searchGubun }&searchData=${requestScope.searchData }';
		location.href = linkAddr;
	}//move
</script>