/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 赤城優
 */
public class Challenge15 extends HttpServlet {

    String[] profile(String ID) {

        String[] data1 = {"83726519", "1972年6月5日<br>", "アメリカ<br>"};
        String[] data2 = {"61205537", "1920年5月13日<br>", "イタリア<br>"};
        String[] data3 = {"83528475", "1985年4月16日<br>", null};

        if (ID == "83726519") {

            return data1;

        } else if (ID == "61205537") {

            return data2;

        } else {

            return data3;
        }

    }

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

            String ID = "83726519";
            
           

            
            int limit = 2;

            for (int i = 1; i <=limit; i++) {

                 String[] a = profile(ID);

                for (int e = 1; e < 3; e++) {

                    if(a[i]==null){ 


 
                     continue; }
                    
                    out.print(a[e]);

                    
                }
                if(ID=="83726519"){
                     ID = "61205537";
                }else if(ID=="61205537")
                {
                        ID = "83528475";
                }
               
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
