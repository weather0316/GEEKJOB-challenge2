<%-- 
    Document   : kadai
    Created on : 2018/03/28, 16:22:41
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
            request.setCharacterEncoding("UTF-8");
            out.print("名前:");
            out.print(request.getParameter("name"));
            out.print("<br>性別:");
            out.print(request.getParameter("gendar"));
            out.print("<br>趣味:");
            out.print(request.getParameter("hobby"));
           
            %>
    </body>
</html>
