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

public class kadai2 {
  public static void main(String args[]){
       Connection db_con = null;
       PreparedStatement db_st = null;
       
       
       try{
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jojo0920","YU0316","poland0722");
           
           db_st=db_con.prepareStatement("INSERT INTO profiles(profilesID,name,tel,age,birthday)VALUES(?,?,?,?,?)");
           db_st.setInt(1,6);
           db_st.setString(2,"竜宮レナ"); 
           db_st.setString(3,"080-7859-3508");
           db_st.setInt(4,17);
           db_st.setString(5,"1979-07-15");
           
           
           
               db_st.close();
               db_con.close();
           
       }catch(SQLException e_sql){
           System.out.println("接続時にエラーが発生しました:"+e_sql.toString());
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