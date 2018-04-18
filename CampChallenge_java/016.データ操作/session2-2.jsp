<%-- 
    Document   : session2-2
    Created on : 2018/04/14, 19:33:45
    Author     : 赤城優
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            
        HttpSession hs=request.getSession();

    hs.setAttribute("Name",request.getParameter("名前"));
    hs.setAttribute("gender",request.getParameter("性別"));
    hs.setAttribute("syumi",request.getParameter("趣味"));

    String n=(String)hs.getAttribute("Name");
    String s=(String)hs.getAttribute("gender");
    String s2=(String)hs.getAttribute("syumi");

    out.println(n);
    out.println(s);
    out.println(s2);
            %>
    </body>
</html>
