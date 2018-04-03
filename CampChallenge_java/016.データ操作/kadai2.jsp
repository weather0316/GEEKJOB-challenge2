<%-- 
    Document   : kadai2
    Created on : 2018/03/29, 17:17:12
    Author     : 赤城優
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <%
           request.setCharacterEncoding("UTF-8");
           
         int A=150;
         String something = request.getParameter("type");
         double count=Double.parseDouble(request.getParameter("count"));
         double total=count*A;
           
          if(something.equals("1")){
              out.print("これは雑貨です。");
          }else if(something.equals("2")){
              out.print("これは生鮮食品です。");
          }else{
              out.print("これはその他です。");
          }
              
           out.print("この商品は1個"+A+"円です。");
           
          
           if(total<3000){
           
               out.print("今回のポイントは0ポイントです");
               
           }else if(total<5000&&total>=3000){
               
               total=total*0.04;
               
               int C=(int) total;
               
               out.print("今回のポイントは"+C+"ポイントです");
               
           }else if(total>=5000){
               
            total=total*0.05;
              
               int B=(int) total;
            
               out.print("今回のポイントは"+B+"ポイントです");
           }
           %>
           
               
               
    
</html>
