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

public class kadai5 {
    public static void main(String args[]){
       Connection db_con = null;
       PreparedStatement db_st = null;
       ResultSet db_data = null;
       
       try{
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jojo0920_db","YU0316","poland0722");
           
           db_st=db_con.prepareStatement("SELECT profilesID,name,tel,age,birthday FROM profiles WHERE name LIKE '%茂%' ");
        
           
           db_data=db_st.executeQuery();
           
           while(db_data.next()){
               System.out.println("profilesID:"+db_data.getString("profilesID")+"<br>"+"名前:"+db_data.getString("name")+"<br>"+"電話番号:"+db_data.getString("tel")+"<br>"+"年齢:"+db_data.getInt("age")+"<br>"
               +"誕生日:"+db_data.getDate("birthday"));
           }
           
               db_data.close();
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
