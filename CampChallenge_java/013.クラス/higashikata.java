/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 赤城優
 */

 class jojo{
        public String name="";
        public String standname="";
        
         
        public void jinbutu(String n, String s) {
        this.name =n;
        this.standname = s;
        
        
        
    }
            
         void hyouji(){
             System.out.print(this.name+this.standname);
          }    
     
       
       
        
        
        }
 

 

public class higashikata{
    
    public static void main(String[]args){
        
jojo stands=new jojo();

stands.jinbutu("吉良吉影", "キラークイーン");

stands.hyouji();

}
   
}     
  
