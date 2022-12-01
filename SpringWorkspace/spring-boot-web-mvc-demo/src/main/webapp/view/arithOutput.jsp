<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<jsp:include page="/header" />

<section style="padding:10px; min-height:400px">
	<c:if test="${arith ne null}">
		<table>
			<tr><th>Operand1</th><td>${arith.operand1}</td></tr>
			<tr><th>Operand2</th><td>${arith.operand2}</td></tr>
			<c:forEach var="result" items="${arith.results}">
				<tr><th>${result.key}</th><td>${result.value}</td></tr>
			</c:forEach>
		</table>
	</c:if>
	
</section>

<jsp:include page="/footer" />
