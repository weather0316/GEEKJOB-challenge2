/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 赤城優
 */
import java.applet.*;
import java.awt.*;
import java.io.*;

public class practice3 extends Applet{
     Image img;
    public static void main(String[]args){
        try{
            File f=new File("applen.txt");
            FileWriter fw=new FileWriter(f);
            
            fw.write("画像の保存と表示");
            
        }catch(IOException e){
            
            e.printStackTrace();
            
          
        }
        
        try{
            File f=new File("applen.txt");
            FileWriter fw=new FileWriter(f,true);
            
            fw.write("2018-3-28 14:25  開始");
            
            fw.close();
            
        }catch(IOException e){
            
            e.printStackTrace();
        }
        
        try{
            File f=new File("applen.txt");
            FileWriter fw=new FileWriter(f,true);
            
            fw.write("2018-3-28 14:27　終了");
            
            fw.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
   public void paint(Graphics g) {
    img=getImage(getDocumentBase(),"gazou/green.jpg");
    g.drawImage(img, 20, 10, this);
    
    Color bg = new Color(0.8F, 0.9F, 0.8F);
    g.drawImage(img, 140, 10, bg, this);

    
    g.drawImage(img, 20,70, 150,40, this);
    g.drawImage(img, 180,70, 60,100, bg, this);

    g.drawImage(img, 20,70, 150,40, this);
    g.drawImage(img, 180,70, 60,100, bg, this);


}
    
}
