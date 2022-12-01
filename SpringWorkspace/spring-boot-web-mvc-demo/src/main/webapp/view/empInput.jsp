<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<jsp:include page="/header" />

<section style="padding:10px; min-height:400px">
	<h2>Employee Form</h2>
	
	<form:form method="post" modelAttribute="emp">
		<div>
			<form:label path="empId">Employee Id:</form:label>
			<form:input path="empId" type="number" />
		</div>
		<div>
			<form:label path="name">Employee Name:</form:label>
			<form:input path="name"  />
		</div>
		<div>
			<form:label path="designation">Designation:</form:label>
			<form:select path="designation">
				<form:option value="">[Select]</form:option>
				<form:options items="${designations}" />
			</form:select>
		</div>
		<div>
			<form:label path="basic">Basic Pay:</form:label>
			<form:input path="basic" type="double" />
		</div>
		<button>Done</button>
	</form:form>

</section>

<jsp:include page="/footer" />
