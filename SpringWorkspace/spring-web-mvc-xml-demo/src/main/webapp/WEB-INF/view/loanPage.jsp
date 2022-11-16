<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />

<section style="padding:10px; min-height:400px">
	<h3>Loan Information</h3>
	
	<form method="post">
		<label>Principle:</label>
		<input type="number" name="principle" />
		<label>Time:</label>
		<input type="number" name="time" />
		<label>Rate:</label>
		<input type="number" name="rate" />
		<button>Compute Interest</button>
	</form>
	
	<c:if test="${loanModel ne null }">
		<p>
			The Interest on <strong>INR. ${loanModel.principle }</strong>
			@ <strong>${loanModel.rate }</strong>
			for a period of <strong>${loanModel.time } years</strong>
			is <strong><em>${loanModel.interest }</em></strong>
		</p>
	</c:if>
	

</section>
<jsp:include page="/footer" />


