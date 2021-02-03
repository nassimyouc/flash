<%@include file="header.html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 95%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>
<br>
<center>
<table id="customers">
<thead>
   <tr>
       <th>ID</th>
        <th>Name</th>
       <th>Father Name</th>
       <th>Mother Name</th>
       <th>Mobile number</th>
       <th>Gender</th>
       <th>Email</th>
       <th>Blood Group</th>
       <th>Address</th>
       <th>Action</th>
      

   </tr>
</thead>
 <tbody>
	<c:forEach var="user" items="${listBlood}">

						<tr>
							<td><c:out value="${user.id}" /></td>
							<td><c:out value="${user.name}" /></td>
							<td><c:out value="${user.father}" /></td>
							<td><c:out value="${user.mother}" /></td>
							<td><c:out value="${user.mobilenumber}" /></td>
							 <td><c:out value="${user.gender}" /></td>
							  <td><c:out value="${user.email}" /></td>
							   <td><c:out value="${user.bloodgroup}" /></td>
							    <td><c:out value="${user.address}" /></td>
							<td><a href="<%=request.getContextPath()%>/showupdate?id=<c:out value='${user.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
						<!--  <td><button (click)="updateBlood(user.id)" class="btn btn-success">Update</button>
          							<button (click)="deleteBlood(user.id)" class="btn btn-warning">Delete</button></td> -->		
								
						</tr>
					</c:forEach>
				
 </tbody>
</table>
</center>
<br>
<br>
<br>
<br>

</body>
</html>