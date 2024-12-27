<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
body {

    text-align:center;
    align-content:center;
    padding: 10px;
    color:black;
    border-radius: 10px;
    border: 2px solid black;
 
}
</style>
</head>
<body>
 <h2 style="color: blue; text-align: center">Login Form</h2>
 <frm:form modelAttribute="babe">
 <table align="center" bgcolor="gray">
 <tr>
 <dt>Babe Id</dt>
 <dd><frm:input path="bid"/></dd>
 </tr><br>
 <dt><input type="submit" value="Login"/>&nbsp &nbsp<input type="reset" value="cancel"/></dt>
 </table>
 </frm:form>
 <center>
 <h4 style="color: blue; text-align: center"><a  href="./">Home</a></h4>
 </center>
 </body>
 </html>