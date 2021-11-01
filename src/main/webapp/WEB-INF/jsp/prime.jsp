<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">

<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="js/prime.js"></script>
<link rel="stylesheet"  href="/css/prime.css">


<meta charset="ISO-8859-1">
<title>Prime Application</title>
</head>
<body>
<div class="container centered bordered">


<fieldset>
        <legend>User Input</legend>
       
       <label for="input number">Enter Number:</label>
       <input  id="txtPrime2" name="txtPrime2" type="number" min="2" max="5000" onfocus="this.value=''" />
       
       
<input
       type="button" name="btnPrime2"
       value="Submit" id="btnPrime2"  />
       <button onclick="document.getElementById('btnRest').value = ''">Clear </button>
       </fieldset>
       
       <fieldset>
        <legend>Prime List</legend>
       
       <textarea id="txtAreaPrime" cols=50 rows=10></textarea>
       </fieldset>
       
       
       </div>
</body>
</html>