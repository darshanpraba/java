/*     Programmer: Darshan Prabaharan
       Date: Feburary 9th 2024
*/
import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many hours have you been parked?");
        int hours = keyboard.nextInt();
        double cost = 3.5 * hours;
        if(cost > 20) {
            cost= 20.0;
        }
        System.out.println("You owe $" + cost);
        
        
        // Ask how many hours were you parked
        
        // Compute cost - $3.50 per hour
        
        // If cost is over $20, set cost to $20
        
        // Display the final cost
        
    }
}
