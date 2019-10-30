import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Average
     * reads a series of numbers (ends with a letter)
     * calculates the average of the numbers
     * @return the average of the numbers
     */
    public static double average()
    {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        double avg; 
        int i = 0;

        System.out.print("enter an integer (enter a letter to quit): ");
        while(s.hasNextInt() == true)
        {

            int value = s.nextInt();
            sum += value;

            i++;
            System.out.print("enter an integer (enter a letter to quit): ");
        }

        avg = sum / i;
        return avg;
    }

    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * @return the number of numbers that are greater than 100
     */
    public static int countMatches()
    {
        int count = 0;
        int number = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("enter a series of integers (enter a letter to quit): ");
        while (s.hasNextInt() == true) {
            number = s.nextInt();
            if (number > 100) {
                count++;
            }
        }
        return count;
    }

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * @return the number of words read before the match
     */
    public static int findFirstMatch()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter multiple words: ");
        int n; 
        int i = -1;

        do 
        {
            String word = in.next();
            n = word.length();
            i++;
        }
        while (n <= 5);
        return i;
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
        Scanner s = new Scanner (System.in);
        int userTries = 1;
        System.out.println("Enter a positive integer less than 100");
        while (true)
        {
            if (s.hasNextInt() == true)
            {
                int userInt = s.nextInt();
                if (userInt < 100)
                {
                    if (userInt > 0 )
                    {
                        return userInt;
                    }
                    else
                    {
                        System.out.println("Enter a positive number.");
                        userTries++;
                    }
                }
                else
                {
                    System.out.println("Enter a number less than 100.");
                    userTries++;
                }
            }
            else
            {
                System.out.println(s.next() + " is not an integer. Please try again.");
            }
        }
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Please type a integer value below.");

        int max = Integer.MIN_VALUE;

        if (s.hasNextInt() == false)
        {
            System.out.println("You inputted a letter as your first char, please try again.");
        }
        else
        {
            System.out.println("Please input any other integer values below. End the loop with a letter.");
            while (s.hasNextInt())
            {
                int num = s.nextInt();
                if (num > max)
                {
                    max = num;
                }

            }
        }

        return max;
    }

    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * @return the least number
     */
    public static int findMin()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Please type a integer value below.");

        int min = Integer.MAX_VALUE;

        if (s.hasNextInt() == false)
        {
            System.out.println("You inputted a letter as your first char, please try again.");
        }
        else
        {
            System.out.println("Please input any other integer values below. End the loop with a letter.");
            while (s.hasNextInt())
            {
                int num = s.nextInt();
                if (num < min)
                {
                    min = num;
                }

            }
        }

        return min;
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers until an adjacent duplicate
     * number is entered
     * @return the adjacent duplicate number that was entered
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int lastNum;
        int newNum = s.nextInt();

        do
        {
            System.out.print("Enter another number: ");
            lastNum = newNum;
            newNum = s.nextInt();
        }
        while (lastNum != newNum);

        return newNum;
    }
    
    /*
     * Loop Algorithm #7: Integer Deconstruction
     * Write an algorithm to identify the individual digits in an integer. 
     */
    public static void integerDeconstruction()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = s.nextInt();
        String valueStr = "" + value;
        
        for(int i = 0; i < valueStr.length(); i++)
        {
            System.out.println(value % 10);
            value /= 10;
        }
    }
        
}