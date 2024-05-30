import java.util.Scanner;
/*				Programmer: Darshan Prabaharan
				Date:       May 4, 2024
				Project:    Lab 4.2 PigLatin
				File Name:  PigLatin.java
				Description:     This program will translate any word 
				from english to pig latin
*/

public class MyProgram 
{

    public static void main(String[] args)
    {    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a word");
        String word = keyboard.nextLine();
        System.out.println(ChangeWord(word));
    }
    
    public static String ChangeWord(String word)
    {
        char x = word.charAt(0);
        if (Vowel(x))
        {
            return word + "yay";
        }
        else
        {
            int y = Vowel(word);
            String first = word.substring(0, y);
            String last = word.substring(y);
            return last + first + "ay";
        }
    }
    
    public static boolean Vowel(char letter)
    {
        return letter =='a' || letter =='e'|| letter =='i' || letter =='o' || letter =='u';  
    }
    
    public static int Vowel(String word)
    {
        for(int i = 0; i < word.length(); i++)
        {
            char y = word.charAt(i);
            if(y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u')
            {
            return i;
            }
    }
        return 7;
    }
}
