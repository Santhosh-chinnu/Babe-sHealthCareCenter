<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<h2 style="color:green ; text-align: center">Babes Details</a></h2>
<c:choose>
<c:when test="${! empty cdata}">
<table class="table table-hover" border="1"  align="center"> 
<tr>
<th>BabeId</th>
<th>Name </th>
<th>Address</th>
<th>Years</th>
</tr>
<c:forEach  var="babes"  items="${cdata}">
<tr class="table-success">
<td>${babes.bid}</td>
<td>${babes.name}</td>
<td>${babes.address}</td>
<td>${babes.years}</td>
</tr>
</c:forEach>
</table>
</c:when>
</c:choose>