<%@include file="header.html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="style.css" type="text/css" media="screen">
<style>
img{
width:100%;
height:500px;
}

.logo{
width:130px;
height:90px;
}
body { 
  margin: 0;
  font-family: Arial;
}
input[type="text"], input[type="password"], input[type="submit"],select
{
    border: none;
    background:silver;
    height: 50px;
    font-size: 16px;
	margin-left:35%;
	padding:15px;
	width:33%;	
	border-radius: 25px;
}

#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 55%;
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

.button {
  border-radius: 4px;
  background-color: black;
  border: solid;
  color: #FFFFFF;
  text-align: center;
  font-size: 23px;
  padding: 5px;
  width: 120px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}
</style>
</head>
<body>
<div class="container">
<br>
<center><p font color="red" size="5">${NOTIFICATION}</p></center>
  <form action="manage" method="post">
  <div class="form-group"></div>
  <center><h2>Select Blood Group</h2></center>
  <select name="bloodgroup">
  <option value="A+">A+</option>
    <option value="A-">A-</option>
   <option value="B+">B+</option>
     <option value="B-">B-</option>
       <option value="AB+">AB+</option>
         <option value="AB-">AB-</option>
           <option value="O+">O+</option>
           <option value="O-">O-</option>
  </select>
  
  <center><h2>Select INCREASE/DECREASE</h2></center>
  <select name="incdec">
    <option value="inc">INCREASE</option>
    <option value="dec">DECREASE</option>
  </select>
  <center><h2> Units</h2></center>
  <input type="text" placeholder="Entre units" name="units">
  <center><button type="submit" class="button">Save</button></center>
  
  </form>
 </div>
</table>
</center>
<br>
<br>
<br>
<br>

</body>
</html>