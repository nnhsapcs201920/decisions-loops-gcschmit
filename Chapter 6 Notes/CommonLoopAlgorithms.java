import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Average
     * reads a series of numbers (ends with a letter)
     * calculates the average of the numbers
     * @return the average of the numbers
     */
    public static double newAverage()
    {
        Scanner s = new Scanner(System.in);
        double sum = 0.0;
        double value = 0.0;
        double number = 0.0;
        boolean isDone = false;
        while(!isDone)
        {
            System.out.print("Enter number: ");
            if(s.hasNextDouble() == false)
            {
                isDone = true;
            }
            else
            {
                value = s.nextDouble();
                sum += value;
                number ++;
            }
        }

        double average = sum / number;
        return average;
    }

    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * @return the number of numbers that are greater than 100
     */
    public static int countMatches()
    {
        Scanner s = new Scanner(System.in);
        int counter = 0;
        while(true)
        {
            System.out.print("Enter a number (Enter anything else to end): ");
            if(s.hasNextInt() == false)
            {
                break;
            }
            if(s.nextInt() > 100)
            {
                counter++;
            }
        }
        return counter;
    }

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * @return the number of words read before the match
     */
    public static int findFirstMatch()
    {
        Scanner s = new Scanner(System.in);
        int count = 0;
        String input;
        do 
        {
            System.out.print("enter a series of strings: ");
            input = s.next();
            if (input.length() > 5)
            {
                break;
            }
            else
            {
                count++;
                continue;
            }
        }
        while (count >= 0);
        return count;
    }

    /*
     * Loop Algorithm #4: Prompting until a Match Is Found
     * prompts the user to enter a positive integer less than 100
     * reads the number
     * continues to prompt the user until the number matches the criteria
     * @return the number that matched the criteria
     */
    public static int promptUntilMatch()
    {
        int answer = 27;
        int guess = 0;
        Scanner s = new Scanner(System.in);
        while (guess != answer)
        {
            System.out.print("Enter your guess(num should be less than 100): ");
            guess = s.nextInt();
            if (guess != answer)
            {
                System.out.println("Try again!");
            }
        }
        System.out.print("Congrats! you got it!");
        return guess;
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax()
    {
        Scanner s = new Scanner(System.in);
        int a = Integer.MIN_VALUE;
        while (s.hasNextInt () == true)
        {
            System.out.print("enter any number (enter a letter to quit): ");

            if(s.hasNextInt() == false)
            {
                break;
            }

            int value = s.nextInt();

            if (value >= a)
            {
                a = value;
            }

        }
        return a;
    }

    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * @return the least number
     */
    public static int findMin()
    {
        return 0;
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers until an adjacent duplicate
     * number is entered
     * @return the adjacent duplicate number that was entered
     */
    public static int compareAdjacent()
    {
        int val1 = 0;
        int val2 = -1;
        boolean adjacent = false;
        Scanner s = new Scanner(System.in);
        System.out.print("Input a string of numbers:");
        while(adjacent == false)
        {
            val1 = s.nextInt();
            if(val1 - val2 == 0)
            {
                System.out.println("An adjacent duplicate number was detected");
                adjacent = true;
            }
            else
            {
                val2 = val1;
            }
        }
        return val1;
    }

    /*
     * Loop Algoritm #7 (Extension): Write an algorithm to identify the individual digits in an integer. 
     */
    public static void printNum()
    {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        String list = "" + number;
        for (int i = 0 ; i < list.length(); i++)
        {
            System.out.println(list.substring(list.length()-i-1,list.length()-i));
        }
    }

    public static void printDigits()
    {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        String num = "" + s.nextInt();
        int counter = 0;
        for(; counter < num.length(); counter++)
        {
            System.out.println(num.substring(num.length() - counter - 1, num.length() - counter));
        }
    }

}