<%-- 
    Document   : Challenge1-4
    Created on : 2018/02/06, 15:01:44
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
        int num=1;
        
       if(num==1){
           
           out.print("1です！");
           
       }else if(num==2){
           
           out.print("プログラミングキャンプ！");
           
       }else{
           
           out.print("その他です！");
           
       }
            
            %>
    </body>
</html>
