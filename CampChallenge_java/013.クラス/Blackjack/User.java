package Blackjack;

import Blackjack.Human;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 赤城優
 */
class User extends Human {


    public int open() {
        int total = 0;

        for (int j = 0; j < myCard.size(); j++) {
            total = total + myCard.get(j);
        }

        return total;
    }


    public void setCard(ArrayList<Integer> A) {
        for (int j = 0; j < A.size(); j++) {

            myCard.add(A.get(j));
        }

    }

 
    public boolean checkSum() {
         
        if (open() <17) {
            return true;
        } else {
            return false;
        }
    }

}
