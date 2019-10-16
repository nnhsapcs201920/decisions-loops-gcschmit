import java.util.Scanner;

/**
 * Write a description of class Notes here.
 *
 * @author gcschmit
 * @version 14 October 2019
 */
public class Notes
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int)(Math.random() * 2);
        
        /*
         * if statement
         *      Statements are executed if the conditional expression is true.
         *  
         *  Conditional expressions evalue to either true of false.
         *      The conditional expression must go inside of parentheses.
         *  Statements are grouped by blocks (i.e., { }), not by indentation like in Python.
         *  There is no colon after the conditional expression, unlike Python.
         */
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        
        /*
         * { } are not required for a single-line statement.
         *      However, they are always a good idea.
         *      Leaving them out can lead to bugs like this:
         */
        if(coinFlip == 0)
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time...");
        
        /*
         * if-else statement
         *      The else block is executed if the condition evaluates to false.
         */
        if(coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        else
        {
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time...");
        }
        
        // model the roll of a four-sided die [1-4]
        int dieRoll = (int)(Math.random() * 4) + 1;
        
        /*
         * if-else if-else statement
         *      In Java "else if" is used instead of "elif" like Python.
         */
        if(dieRoll == 1)
        {
            System.out.println("rolled a one");
        }
        else if(dieRoll == 2)
        {
            System.out.println("rolled a two");
        }
        else if(dieRoll == 3)
        {
            System.out.println("rolled a three");
        }
        else
        {
            System.out.println("rolled a four");
        }
    }
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
        /*
         * If we use the equality operator (==) for doubles, it will only return  true if all
         *      binary digits match.
         *  For "equal" numbers, this is probably not the case due to floating-point rounding and,
         *      therefore, not what we want.
         *  We will check if they are "close enough" (i.e., epsilon value).
         */
        final double EPSILON = 1e-14;
        
        if(Math.abs(num1 - num2) < EPSILON)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        // don't have to use an if statement
        // return (Math.abs(num1 - num2) < EPSILON);
        
    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the two variables (e.g., str1 and str2) contain
         *      the same value. For variables of a class type, including Strings, this means they
         *      contain the same reference. That is, they refer to the same object in memory, not
         *      that two Strings have the same sequence of characters.
         */
        if(str1 == str2)
        {
            System.out.println("string references are equal");
        }
        else
        {
            System.out.println("string references are not equal");
        }
        
        /*
         * The equals method returns true if the two objects referenced by the variables are "equal".
         *      What equals means is defined by the class. For Strings, it means that the two objects
         *      have the same sequence of characters.
         */
        if(str1.equals(str2))
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("strings are not equal");
        }
        
        /*
         * We will determine which string comes first lexicographically using the compareTo
         *      method of the String class.
         *      
         *  compareTo returns an int:
         *      0:      if the strings are equal (same sequence of characters)
         *      < 0:    if str1 < str2 lexicographically
         *      > 0:    if str1 > str2 lexicographically
         */                    
        int result = str1.compareTo(str2);
        
        String firstStr = null;
        
        if(result < 0)
        {
            firstStr = str1;
        }
        else if(result > 0)
        {
            firstStr = str2;
        }
        
        if(firstStr != null)
        {
            System.out.println("The first string is: " + firstStr);
            System.out.println("Its length is: " + firstStr.length());
        }
        else
        {
             System.out.println("strings are equal");
        }
    }
}






