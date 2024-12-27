<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<link rel="stylesheet"
           href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
           
<div class="container">

<h2 style="color:green ; text-align: center">Babes Details</a></h2>
<c:choose>
<c:when test="${! empty cdata.getContent()}">
<table class="table table-hover" border="1"  align="center"> 
<tr>
<th>BabeId</th>
<th>Name </th>
<th>Address</th>
<th>Years</th>
<th>Operations</th>

</tr>
<c:forEach  var="babes"  items="${cdata.getContent()}">
<tr class="table-success">
<td>${babes.bid}</td>
<td>${babes.name}</td>
<td>${babes.address}</td>
<td>${babes.years}</td>
<td><a href="edit?no=${babes.bid}">edit</a>
 <a href="delete?no=${babes.bid}" onclick="return confirm ('Are you Sure')">delete</a></td> 
</tr>
</c:forEach>
</table>
<p style="text-align: center">
<c:if test="${!cdata.hasPrevious()}">
<a href="report?page=${cdata.getPageable().getPageNumber()-1}">Prev</a>&nbsp;&nbsp;
</c:if>
<c:if test="${!cdata.isFirst()}">
<a href="report?page=0">Frist</a>
</c:if>
<c:forEach var="i" begin="1" end="${cdata.getTotalPages()}" step="1">
[<a href="report?page=${i-1}">${i}</a>]&nbsp;&nbsp;
</c:forEach>

<c:if test="${!cdata.isLast()}">
<a href="report?page=${cdata.getTotalPages()-1}">Last</a>&nbsp;&nbsp;
</c:if>
<c:if test="${!cdata.hasNext()}">
<a href="report?page=${cdata.getPageable().getPageNumber()+1}">Next</a>&nbsp;&nbsp;
</c:if>
</p>
</c:when>
</c:choose> 
 <h4 style="color:red"; text-align: center">${resultMsg}</a></h4>
  <center>
         <h4 style="color:DodgerBlue"; text-align: center"><a  href="register">Registration</a></h4>
         <h4 style="color: blue; text-align: center"><a  href="./">Home</a></h4>
    </center>      
 </div>       