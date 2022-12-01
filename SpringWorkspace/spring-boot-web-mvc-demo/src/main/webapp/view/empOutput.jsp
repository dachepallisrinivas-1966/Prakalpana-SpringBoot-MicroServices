<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:include page="/header" />

<section style="padding:10px; min-height:400px">
	<h2>Employee Details</h2>
	
	<c:choose>
		<c:when test="emp eq null">
			<p><strong>No Employees Found</strong>
		</c:when>
		<c:otherwise>
			<table>
				<tr><td><em>Employee Id</em></td><td><strong>${emp.empId}</strong></td></tr>
				<tr><td><em>Name</em></td><td><strong>${emp.name}</strong></td></tr>
				<tr><td><em>Designation</em></td><td><strong>${emp.designation}</strong></td></tr>
				<tr><td><em>Basic Pay</em></td><td><strong>${emp.basic}</strong></td></tr>
				<tr><td><em>HRA</em></td><td><strong>${emp.hra}</strong></td></tr>
				<tr><td><em>TA</em></td><td><strong>${emp.ta}</strong></td></tr>
			</table>
		</c:otherwise>
	</c:choose>	
</section>

<jsp:include page="/footer" />
