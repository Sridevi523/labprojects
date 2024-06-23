//Q.Write a program using exception handling to handle array index out of bounds, Arithmetic exception.
//Algorithm:1.Initialize Variables 
//2.First try-catch Block:
//Attempt to assign a value to an out-of-bounds index of the array to trigger an ArrayIndexOutOfBoundsException.
//Attempt to divide a by b to trigger an ArithmeticException (this will not execute if the previous statement throws an exception).
//Catch and handle ArrayIndexOutOfBoundsException and print an appropriate message.
//Catch and handle ArithmeticException and print an appropriate message.
//Execute the finally block to print a message indicating it was executed.
//3.Second try-catch Block:
//Attempt to divide a by b to trigger an ArithmeticException.
//Catch and handle ArithmeticException and print an appropriate message.
//Execute the finally block to print a message indicating it was executed.

class ExceptionHandlingDemo 
{ 
    public static void main(String[] args) 
    { 
        // Step 1: Initialize Variables
        int a = 10, b = 0, c; 
        int[] d = new int[3]; 
        
        // Step 2: First try-catch Block
        try 
        { 
            // Attempt to assign value to an out-of-bounds index of the array
            d[3] = 55; // This will cause an ArrayIndexOutOfBoundsException
            
            // Attempt to divide by zero
            c = a / b; // This will cause an ArithmeticException (if the above line is commented out)
        } 
        catch(ArrayIndexOutOfBoundsException e) 
        { 
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Array Index Out Of Bounds Exception is caught: " + e.getMessage()); 
        } 
        catch(ArithmeticException e) 
        { 
            // Handle ArithmeticException
            System.out.println("Arithmetic Exception is caught: " + e.getMessage()); 
        } 
        finally 
        { 
            // Finally block executed regardless of exception
            System.out.println("Finally block executed."); 
        } 
        
        // Step 3: Second try-catch Block
        try 
        { 
            // Attempt to divide by zero
            c = a / b; // This will cause an ArithmeticException
        } 
        catch(ArithmeticException e) 
        { 
            // Handle ArithmeticException
            System.out.println("Arithmetic Exception is caught: " + e.getMessage()); 
        } 
        finally 
        { 
            // Finally block executed regardless of exception
            System.out.println("Finally block executed."); 
        }
    } 
}