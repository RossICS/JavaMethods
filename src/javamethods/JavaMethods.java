/*
 * Create a House application
    To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javamethods;
import java.util.Scanner;

/**
 * 
 * @author rkaune
 */
public class JavaMethods {

    /**
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int select=0;
        Scanner input = new Scanner (System.in);
        System.out.println("Please select from the following: ");
        System.out.println("1. Select 1 to draw a roof.");
        // 2. Select 2 to draw a base.
        // 3. Select 3 to draw a walk.
        select = input.nextInt();
        if (select==1){
            addRoof(5);
        }
        else if (select==2){
            addBase();
        }
        else{
            addWalk();
        }
        input.close();
        }
    
    
    /**
     * What the method does
     * Preconditions-
     * Postconditions-
     * 
    */
    public static void addRoof(int style){
        //return("Roof");
    }
    /**
     * What the method does
     * Preconditions-
     * Postconditions-
     * 
    */
    public static void addBase(){
    }
     
    /**
     * What the method does
     * Preconditions-
     * Postconditions-
     * 
    */
    public static void addWalk(){
    }
    
    
}
