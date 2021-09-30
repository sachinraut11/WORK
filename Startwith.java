<html>
<body>

<h2>JavaScript Strings</h2>

<p>The startsWith() method returns true if a string begins with a specified string.</p>

<p id="demo"></p>

<p>The startsWith() method is not supported in IE 11 (and earlier versions).</p>

<script>
let str = "Hello world, welcome to the universe.";
document.getElementById("demo").innerHTML = str.startsWith("Hello");
</script>

</body>
</html>
