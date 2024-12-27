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
 <h2 style="color: blue; text-align: center">Edit Babe Details</h2>
 <frm:form modelAttribute="babe">
 <table align="center" bgcolor="gray">
 <tr>
 <dt>Babe Id</dt>
 <dd><frm:input path="bid"/></dd>
 </tr>
 <tr>
 <dt>Babe Name</dt>
 <dd><frm:input path="name"/></dd>
 </tr>
 <tr>
 <dt>Babe Address</dt>
 <dd><frm:input path="address"/></dd>
 </tr>
 <tr>
 <dt>Years</dt>
 <dd><frm:input path="years"/></dd>
 <tr><br>
 <dd><input type="submit" value="Edit"/>&nbsp &nbsp <input type="reset" value="cancel"/></dd>
 </tr> 
 </table>
 </frm:form>
 <p>
<a href="?lang=te_IN" >Telugu </a> &nbsp; &nbsp; &nbsp;
<a href="?lang=hi_IN">Hindhi</a>&nbsp;&nbsp;&nbsp;
<a href="?lang=en_US">English</a>
</p>
 <center>
  <h4 style="color: blue; text-align: center"><a  href="report">Show Report</a></h4>
 <h4 style="color: blue; text-align: center"><a  href="./">Home</a></h4>
 </center>
 </body>
 </html>