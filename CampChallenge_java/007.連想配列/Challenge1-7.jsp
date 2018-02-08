<%-- 
    Document   : Challenge1-7
    Created on : 2018/02/08, 14:48:48
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
       <%@ page import="java.util.*" %>
       
       <%
       HashMap<String,String> data1=new HashMap<String,String>();
       HashMap<String,String> data2=new HashMap<String,String>(); 
       HashMap<String,String> data3=new HashMap<String,String>();
       HashMap<String,String> data4=new HashMap<String,String>();
            
            
            data1.put("1","AAA");
            data2.put("hello","world");
            data3.put("soeda","33");
            data4.put("20","20");
            
            ArrayList<HashMap> data = new ArrayList<HashMap>();
                    
           data.add(data1);
           data.add(data2);
           data.add(data3);
           data.add(data4);
            %>
    </body>
</html>
