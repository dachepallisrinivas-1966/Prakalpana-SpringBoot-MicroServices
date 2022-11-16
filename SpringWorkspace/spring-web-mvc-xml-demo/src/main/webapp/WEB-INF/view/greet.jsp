<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />
<section style="padding:10px; min-height:400px">
	<h3>Greet</h3>
	
	<form>
		<label>Name: </label>
		<input type="text" name="userName" />
		<button>Greet Me</button>
	</form>
	
	<c:if test="${greeting ne null}">
		<p><strong>${greeting}</strong></p>
	</c:if>
	
</section>
<jsp:include page="/footer" />