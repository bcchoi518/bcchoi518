<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file = "../_include/inc_header.jsp" %>

<h2>상품등록</h2>

<form name="DirForm">
	<table border="1"> 
		<tr>
			<td>상품이름</td>
			<td><input type="text" name="productName" /></td>
		</tr>
		<tr>
			<td>상품가격</td>
			<td><input type="text" name="productPrice" /></td>
		</tr>
		<tr>
			<td>상품설명</td>
			<td><textarea name="productDescription" style="width:150px; height:80px;"></textarea></td>
		</tr>
		<tr>
			<td>제조사</td>
			<td>
				vendorNo: <input type="text" name="vendorNo" /><br>
				vendorName: <input type="text" name="vendorName" />
			</td>
		</tr>
		<tr>
			<td>첨부파일</td>
			<td><input type="text" name="attachInfo"  value="-"/></td>
		</tr>
		<tr align="center" height="50px">
			<td colspan="2">
				<button type="button" onclick="save()">확인</button>
			</td>
		</tr>
	</table>
</form>

<script>
	function save() {
		if (confirm('저장할까요?')) {
			document.DirForm.action = '${path }/product/chugaProc';
			document.DirForm.method = 'post';
			document.DirForm.submit();
		}//if
	}//save
</script>