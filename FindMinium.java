/* Programmer: Darshan Prabaharan
   Date: Feburary 14 2024
*/


import java.util.Scanner;

public class FindMinimum 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int num1 = input.nextInt();
        System.out.println("Enter the second integer:");
        int num2 = input.nextInt();
        System.out.println("Enter the third integer:");
        int num3 = input.nextInt();
        if (num1 <= num2 && num1 <= num3)
        {
            System.out.println("The minimum is " + num1);
        }
        else if (num2 <= num1 && num2 <= num3)
        {
            System.out.println("The minimum is " + num2);
        }
        else if (num3 <= num1 && num3 <= num2)
        {
            System.out.println("The minimum is " + num3);
        }
        
        // Ask the user for three ints and 
        // print out the minimum.
        
    }
}
