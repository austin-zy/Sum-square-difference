/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.square.difference;

/**
 *
 * @author Austin
 */
public class SumSquareDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sumofsquare = 0;
        int sumofnum = 0;
        for (int i=1;i<101;i++){
            int square = i*i;
            sumofsquare = sumofsquare+ square;
            sumofnum = sumofnum + i;
        }

        int squareofsum = sumofnum*sumofnum;
        int difference = squareofsum - sumofsquare;
        
        System.out.println(difference);
        
    }
    
}
