<%-- 
    Document   : Challenge1-8-4
    Created on : 2018/02/09, 14:27:57
    Author     : 赤城優
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           int key=10000;
           
           int count=0;
           
           while(key>=100){
               
          key=key/2;
               
          count++;
          
          out.print(key);
           }

            %>
    </body>
</html>
