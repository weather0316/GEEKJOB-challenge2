<%-- 
    Document   : Challenge1-5-2
    Created on : 2018/02/06, 16:53:12
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
            char Lun='あ';
           
          switch(Lun){
              case 'A':
                  out.print("英語");
                  break;
                
              case 'あ':
                  out.print("日本語");
                  break;
                  
              default:
          
          }

            %>
    </body>
</html>
