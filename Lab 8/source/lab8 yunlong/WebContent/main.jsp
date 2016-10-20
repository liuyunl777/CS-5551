<!DOCTYPE html>
<html>
<style>
.input_name{
palceholder:type in your name;
}
</style>
<body>

	<form action = 'labservlet' method = 'get'>
		type in your nationality, get the description of your country!<br>
		tell me your name: 
		<input type = 'text' name = 'input_name'>
		tell me you came from:
		<input type = 'text' name = 'input_luck'>
		<button type = 'submit'>Submit</button>
	<!-- </form> -->
	<!-- <form action="labservlet" method="get"> -->
	<br>now select food you like the most:<br>
	<input type="checkbox" name="c1">pizza<br>
	<input type="checkbox" name="c2">burger<br>
	<input type="checkbox" name="c3">noodles<br>
	</form>

</body>
</html>