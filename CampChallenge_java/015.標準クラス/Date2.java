/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 赤城優
 */
    import java.util.Calendar;
      
public class Date2 {
    public static void main(String[] args){
       Calendar c = Calendar.getInstance();
        
        c.set(2018, 3, 22, 13, 50, 26);
         
         System.out.print(c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日"+
                 c.get(Calendar.HOUR_OF_DAY)+"時"+c.get(Calendar.MINUTE)+"分"+c.get(Calendar.SECOND)+"秒");
    }
   
    
    
}
