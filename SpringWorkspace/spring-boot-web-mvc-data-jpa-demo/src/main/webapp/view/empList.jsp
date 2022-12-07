<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:include page="/header" />

<section class="container-fluid p-4">
	<h3>Employee List</h3>
	<c:choose>
		<c:when test="${emps eq null}">
			<p class="alert alert-warning">
				Unable to fetch employees
			</p>
		</c:when>
		<c:when test="${emps.size() == 0}">
			<p class="alert alert-warning">
				No Employees Found
			</p>
		</c:when>
		<c:otherwise>
			<table class="table table-bordered table-striped table-hovered">
				<thead>
					<tr>
						<th>Employee#</th>
						<th>Full Name</th>
						<th>Mobile</th>
						<th>Mail</th>
						<th>Actions</th>
				</thead>
				<tbody>
					<c:forEach var="emp" items="${emps}">
						<tr>
							<td class="text-right">${emp.empId}</td>
							<td>${emp.firstName} ${emp.lastName}</td>
							<td>${emp.mobileNumber}</td>
							<td>${emp.email}</td>
							<td>
								<a href="details" class="btn btn-sm btn-info">View Details</a>
							</td>
						</tr>
					</c:forEach>
				
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
	

</section>

<jsp:include page="/footer" />


