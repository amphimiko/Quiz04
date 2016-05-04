
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Chip’s Fast Food Emporium");     //welcome statement
        int c = 0;                                                      //calories
        System.out.println("Please choose a burger");                   //asks to choose burger
        int n = input.nextInt();                                        //recieves input
        if (n == 1) {                                                   //takes the choice and finds calories
            c = c + 461;
        }
        if (n == 2) {
            c = c + 431;
        }
        if (n == 3) {
            c = c + 420;
        }
        System.out.println("Please choose a drink");                //asks to choose drink
        n = input.nextInt();                                        //recieves input
        if (n == 1) {                                               //takes the choice and finds calories
            c = c + 100;
        }
        if (n == 2) {
            c = c + 57;
        }
        if (n == 3) {
            c = c + 70;
        }
        System.out.println("Please choose a side order");           //asks to choose side order
        n = input.nextInt();                                        //recieves input
        if (n == 1) {                                               //takes the choice and finds calories
            c = c + 130;
        }
        if (n == 2) {
            c = c + 160;
        }
        if (n == 3) {
            c = c + 118;
        }
        System.out.println("Please choose a dessert");              //asks to choose dessert
        n = input.nextInt();                                        //recieves input
        if (n == 1) {                                               //takes the choice and finds calories
            c = c + 167;
        }
        if (n == 2) {
            c = c + 266;
        }
        if (n == 3) {
            c = c + 75;
        }
        System.out.println("Your total calorie count is " + c);     //final calorie count statement
    }
}
