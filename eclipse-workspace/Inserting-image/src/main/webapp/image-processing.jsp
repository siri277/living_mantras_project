<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.sun.xml.internal.bind.CycleRecoverable.Context"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert an Image into MySQL Database</title>
    </head>
    <body>
         <%
Connection conn=null;
PreparedStatement pstmt = null;
ResultSet rs=null;
String url="jdbc:mysql://localhost:3306/project";
FileInputStream fis=null;
out.print(request.getParameter("productname"));
//String fname=request.getParameter("fname");
//String lname=request.getParameter("lname");
//String email=request.getParameter("email");
//String myloc=request.getParameter("myimg");
String category="Fruits";
String description="Strawberries are a good source of vitamin C, manganese and potassium. They contain small amounts of several other vitamins and minerals. Strawberries may decrease your risk of heart disease and cancer, as well as help regulate blood sugar.";
String myloc="F:\\strawberry.jpg";
String price="Rs 50";
String productname="Strawberry";
String quantity="100 g";
//out.print("First Name :"+fname+"myloc="+myloc);
try{
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
conn=DriverManager.getConnection(url, "root", "siri1703");
System.out.println(conn);
File image= new File(myloc);
System.out.println("Working file");
pstmt = conn.prepareStatement("insert into products(category,description,image,price,productname,quantity) " + "values(?,?,?,?,?,?)");
pstmt.setString(1, category);
pstmt.setString(2, description);
pstmt.setString(4, price);
pstmt.setString(5, productname);
pstmt.setString(6, quantity);
fis=new FileInputStream(image);
System.out.println("Working fileinput");
pstmt.setBinaryStream(3, (InputStream) fis, (int) (image.length())); // this will works da... you can use this line... for insert into db.
int count = pstmt.executeUpdate();
if(count>0)
{
out.println("insert successfully");
}
else
{
out.println("not successfully");
}
}
catch(Exception ex)
{
ex.printStackTrace();
}
finally{
try{
if(rs!=null){
rs.close();
rs= null;
}
if(pstmt !=null)
{
pstmt.close();
pstmt=null;
}
if(conn!=null)
{
conn.close();
conn=null;
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
%>
    </body>
</html>