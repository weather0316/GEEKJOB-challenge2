package Blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 赤城優
 */
class Dealer extends Human {

protected ArrayList<Integer> cards = new ArrayList<Integer>();

    public Dealer() {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 13; j++) {

                if (j >= 11) {
                    cards.add(10);
                } else {
                    cards.add(j);
                }
            }
        }
  System.out.print(cards.size());
    }

  
    
    public ArrayList<Integer> deal() {

        ArrayList<Integer> K=new ArrayList();
        
        Random rand = new Random();

        Integer index = rand.nextInt(cards.size());
        Integer index2 = rand.nextInt(cards.size());
        
        cards.get(index);
        cards.get(index2);

        K.add(cards.get(index));
        K.add(cards.get(index2));
        
        return K;

    }

    public ArrayList<Integer> hit() {
        Random rand = new Random();
        
         ArrayList<Integer> M=new ArrayList();

        Integer A = rand.nextInt(cards.size());
        
        cards.get(A);
        
        M.add(cards.get(A));

        return M;
    }


    public int open() {
       int total = 0;

        for (int j = 0; j < myCard.size(); j++) {
            total = total + myCard.get(j);
        }

        return total;
    }


    public boolean checkSum() {
            

        if (open() <17) {
            
            return true;
            
        } else {
            
            return false;
        }

    }


    public void setCard(ArrayList<Integer> A) {
   
        for (int j = 0; j < A.size(); j++) {
            
            myCard.add(A.get(j));
        }


    }

}
