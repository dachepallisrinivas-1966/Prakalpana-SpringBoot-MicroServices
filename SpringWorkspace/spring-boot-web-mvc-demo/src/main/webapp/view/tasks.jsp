<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<jsp:include page="/header" />

<section style="padding:10px; min-height:400px">
	<h2>Task List</h2>
	
	<form>
		<label>Task Name:
			<input type="text" name="task"  required />
		</label>
				
		<button formaction="addTask">Add Task</button>
		<button formaction="delTask">Delete Task</button>
		<button formaction="tasks" formnovalidate>Refresh</button>
	</form>
	
	<h3>Tasks</h3>
	<ol>
		<c:forEach var="t" items="${tasks}">
			<li><strong>${t}</strong></li>
		</c:forEach>
	</ol>
	
</section>

<jsp:include page="/footer" />
