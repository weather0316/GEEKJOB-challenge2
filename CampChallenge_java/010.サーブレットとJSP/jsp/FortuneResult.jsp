<%--  


 
   Document   : FortuneResult 


 
    Created on : 2018/02/19, 15:35:18 


 
    Author     : 赤城優 


 
--%> 


 
 


 
<%@page import="org.camp.servlet.Result" %> 


 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 


 
<!DOCTYPE html> 


 
<html> 


 
    <head> 


 
        <% 


 
            Result data = (Result)request.getAttribute("DATA"); 


 
            %> 


 
        <meta http-equiv="contentType" content="text/html: charset=UTF-8"> 


 
        <title>JSP Page</title> 


 
    </head> 


 
   <body> 


 
        <% 


 
            if(data !=null){ 


 
                out.print("<h1>あなたの"+data.getD()+"の運勢は"+data.getLuck()+"です！<h1>"); 


 
            } 


 
           %> 


     </body> 


 
</html> 