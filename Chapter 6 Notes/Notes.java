import java.util.Scanner;


/**
 * Write a description of class Notes here.
 *
 * @author gcschmit
 * @version 24 October 2019
 */
public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop:
         * 
         *      evaluates a boolean expression
         *          if true, executes the body of the loop and then re-evaluates the condition
         *          if false, skips the body and continues
         */
        
        int count = 1;                          // initialization
        
        while(count <= 5)                       // condition
        {
            System.out.println(count);          // body
            
            count++;                            // update the loop variable
        }
        
        System.out.println("done");
    }
    
    public static void whileExample2()
    {
        /*
         * This is an example of an infinite loop!
         * 
         *  A better condition would be:
         *      while(count < 50)
         */
        int count = 1;                          // initialization
        
        while(count != 50)                      // condition
        {
            System.out.println(count);          // body
            
            count += 2;                         // update the loop variable
        }
        
        System.out.println("done");
    }
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *      Three parts of the for loop statement:
         *          1. initialization - executed once
         *          2. condition - boolean expression evaluated at the *start* of each iteration
         *          3. update the loop variable - executed at the *end* of each iteration *before*
         *                                          evaluating the condition again
         */
        for(int count = 1;                  // initialization
                count <= 5;                 // condition
                count++)                    // update the loop variable
        {
            System.out.println(count);      // body
        }
        
        System.out.println("done");
        
        /*
         * variables declared within the for statement are scoped to the for statement and its body
         */
        //System.out.println("final value of count: " + count);
    }
    
    public static void forExample2()
    {
        int count = 1;
        for(    ;                           // initialization
                count <= 5;                 // condition
                count++)                    // update the loop variable
        {
            System.out.println(count);      // body
        }
        
        System.out.println("done");
        
        System.out.println("final value of count: " + count);
    }
    
}






