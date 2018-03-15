package Blackjack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 赤城優
 */

import java.util.ArrayList;


abstract class Human{

    
  protected ArrayList <Integer> myCard=new ArrayList<Integer>();

  abstract int open();
      
  abstract void setCard(ArrayList<Integer> S);
  
  abstract boolean checkSum();
 
  
}


