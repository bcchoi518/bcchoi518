<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script>
	function search() {
		document.searchForm.action = 'main.jsp?menuGubun=boardBasic_listSearch';
		document.searchForm.method = 'post';
		document.searchForm.submit();
	}//search
	
	function goPage(value1, value2, value3, value4, value5) {
		let linkAddr = 'main.jsp?menuGubun=' + value1;
		if (value2 != undefined) {
			linkAddr += '&pageNumber=' + value2;
		}//if
		if (value3 != undefined) {
			linkAddr += '&searchGubun=' + value3;
		}//if
		if (value4 != undefined) {
			linkAddr += '&searchData=' + value4;
		}//if
		if (value5 != undefined) {
			linkAddr += '&no=' + value5;
		}//if
		location.href = linkAddr;
	}//goPage
</script>