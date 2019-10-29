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
        double avg;
        int total = 0;
        int count = 0;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.print("Please enter a int: ");
            boolean con = s.hasNextInt();
            if(con == false)
            {
                break;
            }

            int newNum = s.nextInt();
            total += newNum;
            count++;
        }

        avg = (double)total/count;
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
        Scanner s = new Scanner(System.in);
        int count = 0;

        boolean condition = true;

        while(condition == true)
        {
            System.out.print("Enter a number: (enter a letter to quit): ");
            if(s.hasNextInt() == true)
            {
                int value = s.nextInt();
                if (value > 100)
                {
                    count ++;
                }
            }
            else
            {
                condition = false;
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
        Scanner s = new Scanner(System.in);   //creates a new Scanner object
        System.out.println("Enter a series of words separated by whitespace");    //prompts user for input
        int n = 0;   //length
        int i = 0;    //number of words
        while(n <= 5)    //condition
        {
            String word = s.next();   //assigns word variable to next token in stream
            n = word.length();    //assigns n variable to length of word
            if(n <= 5)    //checks condition again for purpose of confirming length of first word
            {
                i++;   //increments number of words that are checked for length
            }
        }
        System.out.println("" + i);   //prints number of words checked before match
        return i;    //returns number of words
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
        Scanner s = new Scanner(System.in);
        int num = 0;

        do
        {
            System.out.println("enter in a integer less than 100");
            num = s.nextInt();
        }
        while(num >= 100);

        return num;
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax()
    {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int l = 0;
        System.out.print("Enter the numbers(enter a letter to end): ");
        l = Integer.MIN_VALUE;
        do
        {
            a = s.nextInt();
            if (a >= l)
            {
                l = a;
            }
            System.out.print("Enter the numbers(enter a letter to end): ");
        }
        while(s.hasNextInt());
        return l;
    }

    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * @return the least number
     */
    public static int findMin()
    {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int l = 0;
        System.out.print("Enter the numbers(enter a letter to end): ");
        l = Integer.MAX_VALUE;
        do
        {
            a = s.nextInt();
            if (a <= l)
            {
                l = a;
            }
            System.out.print("Enter the numbers(enter a letter to end): ");
        }
        while(s.hasNextInt());
        return l;
    }

    public static int askForInteger(Scanner s) {
        //System.out.print("Enter an integer: ");
        // if (s.hasNextInt())
        // int value = s.nextInt();

        //return s.nextInt();
        System.out.print("Enter an integer: ");
        while (s.hasNext()) {

            if (s.hasNextInt()) {
                return s.nextInt();
            }
            System.out.print(s.next() + " is not an integer. Enter an integer:");
        }
        return 0;
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers until an adjacent duplicate
     * number is entered
     * @return the adjacent duplicate number that was entered
     */
    public static int compareAdjacent() {
        Scanner s = new Scanner(System.in);
        int value = askForInteger(s);
        while (true) {
            int newValue = askForInteger(s);
            if (newValue == value) break;
            value = newValue;
        }
        return value;
    }

    /*
     * Extension. Group 1
     */
    public static void extension()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a series of numbers: ");
        String line = s.nextLine();

        for(int i =1; i< line.length()+1; i++)
        {
            System.out.println(line.substring(line.length()-i, line.length()-i+1));
        }
    }
}