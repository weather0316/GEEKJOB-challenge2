/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 赤城優
 */
import java.io.*;

public class introduce {
    public static void main(String[]args){
        try{
            File f=new File("introduce.text");
            
            FileWriter fw=new FileWriter(f);
            fw.write("私の名前は赤城優です。20歳です");
            
            fw.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
