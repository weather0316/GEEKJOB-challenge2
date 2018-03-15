/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 赤城優
 */
public class Blackjack extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Dealer hito = new Dealer();
            User kyaku = new User();

            //User Set
            ArrayList<Integer> c = hito.deal();

            kyaku.setCard(c);

            int k = kyaku.open();

            out.print("ユーザーのカードの合計は" + k + "です。<br>");
            
            //Dealer Set
            ArrayList<Integer> d = hito.deal();

            hito.setCard(d);

            int h = hito.open();

            out.print("ディーラーのカードの合計は" + h + "です。<br>");
           
            while(hito.checkSum()){
                
                out.print("ディーラーのカードの合計は" + h + "です。<br>");
            
                 out.print("もう一枚引きます<br>");
   
                ArrayList<Integer> M = hito.hit();
                
                hito.setCard(M);
                
                h = hito.open();
                  
                 out.print("ディーラーのカードの合計は" + h + "です。<br>");
                  
                out.print("ディーラーはもう一枚引きますか？<br>");
            
                
            }
            
             while(kyaku.checkSum()){
                 
                out.print("ユーザーのカードの合計は" + k + "です。<br>");
          
                 out.print("もう一枚引きます<br>");
   
                ArrayList<Integer> N = hito.hit();
                
                kyaku.setCard(N);
                
                  k = kyaku.open();
                  
                 out.print("ユーザーのカードの合計は" + k + "です。<br>");
                
                out.print("ユーザーはもう一枚引きますか？<br>");
             
                
            }
             out.print("ユーザーの手札は" + k + "です。<br>");
             
              out.print("ディーラーのカードの合計は" + h + "です。<br>");
            
            if (k > h) {
                
                out.print("ユーザーの勝利です。<br>");
                
            } else {
                
                out.print("ディーラーの勝利です。<br>");

            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}