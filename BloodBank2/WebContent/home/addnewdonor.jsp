<%@include file="header.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
input[type="text"], input[type="password"], input[type="email"], select,input[type="number"]
{
    border: none;
    background:silver;
    height: 50px;
    font-size: 16px;
	padding:15px;
	width:60%;	
	border-radius: 25px;
	margin-left:20%;
}
h2,h1
{	
	margin-left:20%;
}
hr
{
width:60%;	
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
 


 </div>
 
 <div class="container">
  <form action="insert" method="post">
  
  <input type="hidden" name="id" value="<% out.println();%>">
  <h2>Name</h2>
  <input type="text" placeholder="Entrer Name" name="name">
  <hr>
  <h2>Father Name</h2>
  <input type="text" placeholder="Entrer Name of Father" name="father">
  <hr>
  <h2>Mother Name</h2>
  <input type="text" placeholder="Entrer Name of Mother" name="mother">
  <hr>
  <h2>Mobil Number</h2>
  <input type="number" placeholder="Entrer MobilNumber" name="mobilenumber">
  <hr>
  <h2>Gender</h2>
  <select name="gender">
  <option value="Male">Male</option>
    <option value="Female">Female</option>
    <option value="Others">Others</option>
  </select>
  <hr>
  <h2>Email</h2>
   <input type="email" placeholder="Entrer Email" name="email">
   <hr>
   <h2>Blood Group</h2>
   <select name="bloodgroup">
   <option value="A+">A+</option>
   <option value="A-">A-</option>
   <option value="B+">B+</option>
   <option value="B-">B-</option>
   <option value="O+">O+</option>
   <option value="O-">O-</option>
      <option value="AB+">AB+</option>
   <option value="AB-">AB-</option>
   </select>
   <hr>
   <h2>Address</h2>
   <input type="text" placeholder="Entrer Address" name="address">
   <br>
   <center><button type="submit" class="button">Save</button></center>
  
  
  
  
  
  
 
 
 </form>
 </div>



</body>
</html>