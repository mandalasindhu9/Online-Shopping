<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Details</title>
</head>
<body>
<script>
function validate(){
var cardType=document.form.user.value; 
var cardNumber=document.form.user.value;
var expiryDate=document.form.user.value;
var cvv=document.form.user.value;
var name=document.form.user.value;
var zipcode=document.form.user.value;
if(cardType==""){
	alert("Select Card Type!");
	return false;	
}
if(cardNumber==""){
	alert("Enter Card Number!");
	return false;	
}
if(expiryDate==""){
	alert("Enter Expiry Date!");
	return false;	
}
if(cvv==""){
 alert("Enter CVV!");
  return false;
}
if(name==""){
 alert("Enter Name!");
  return false;
}
if(zipcode==""){
 alert("Enter Zip Code!");
 return false;
}
return true;
}
</script>
<form method="POST" action="Results.jsp" onsubmit="javascript:return validate();">
<center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Card Type</td>
                        <td>
                        <input type="radio" name="cardtype" value="Visa">
						<input type="radio" name="dish" value="MasterCard">
						<input type="radio" name="dish" value="AmericanExpress">
						<input type="radio" name="dish" value="Discover">
                        </td>
                    </tr>
                    <tr>
                        <td>Card Number</td>
                        <td><input type="text" name="cnumber" value="" /></td>
                    </tr>
                    <tr>
                        <td>Expiry Date</td>
                        <td>
                        <input type="text" name="expirydate" value="" />
                        <input type="text" name="expirydate" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>CVV</td>
                        <td><input type="text" name="cvv" value="" /></td>
                    </tr>
                    <tr>
                        <td>Name on the card</td>
                        <td><input type="text" name="cname" value="" /></td>
                    </tr>
                    <tr>
                        <td>ZipCode</td>
                        <td><input type="text" name="zipcode" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
</body>
</html>