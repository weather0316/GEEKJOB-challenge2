/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 赤城優
 */
import java.sql.*;

public class kadai1 {
    public static void main(String args[]){
        Connection db_con = null;
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge","root","");
            
            db_con.close();
        }catch(SQLException e_sql){
                System.out.println("接続時にエラーが起きました:"+e_sql.toString());
        }catch(Exception e){
            System.out.println("接続時にエラーが起きました:"+e.toString());
        }finally {
            if(db_con != null){
               try{ db_con.close();
               }catch(Exception e_con){
                   System.out.println(e_con.getMessage());
               }
            }
                    
                    }
                    }
        }


