<%-- 
    Document   : kadai3
    Created on : 2018/04/03, 12:44:18
    Author     : 赤城優
--%>

<%@ page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエリストリング課題2答え</title>
    </head>
    <body>
    <%
     
        request.setCharacterEncoding("UTF-8");
        
    ArrayList<Integer> data = new ArrayList<Integer>();
    ArrayList<String> data2 =new ArrayList<String>();
      
         int kazu=Integer.parseInt(request.getParameter("suji"));
         int suji=kazu;
         int i;
         int A;
         int B;
         int C;
         int D;
         
         for(i=0;(kazu%2)==0;i++){
           
             kazu=kazu/2;
             
             data.add(2);
         }
         
          for(A=0;(kazu%3)==0;A++){
           
             kazu=kazu/3;
             
             data.add(3);
         }
          
           for(B=0;(kazu%5)==0;B++){
           
             kazu=kazu/5;
             
             data.add(5);
         }
           
            for(C=0;(kazu%7)==0;C++){
           
             kazu=kazu/7;
             
             data.add(7);
         }
        

         // 表示用文字列
         String view = suji + " = ";
     for (D=0;D < data.size();D++) {
         // 一回目じゃなければ、*をつける
         if (D > 0) {
             view = view + " * ";
         }
         
         // 分解結果を１つずつ連結する
         view = view + data.get(D);
//        String E="*"+String.valueOf(D);
              
 //     data2.add(E);
      
   }
     
     // 余りがある場合は、あまりを連結
     if (kazu > 1) {
         view = view + " あまり " + kazu;
     }
     
    out.print(view);
   
       %>
    </body>
</html>
