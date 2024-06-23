//Q.Write a program demonstrating multiple catch statements and finally block.
//Algorithm:
//1.Initialize Variables:
//2.try Block:
//Attempt to assign a value to an out-of-bounds index of the array to trigger an ArrayIndexOutOfBoundsException.
//Attempt to divide a by b to trigger an ArithmeticException.
//Attempt to convert a non-numeric string to an integer to trigger a NumberFormatException
//3.Multiple catch Blocks:
//Catch and handle ArrayIndexOutOfBoundsException and print an appropriate message.
//Catch and handle ArithmeticException and print an appropriate message.
//Catch and handle NumberFormatException and print an appropriate message.
//4.finally Block:
//Print a message indicating that the finally block is executed.

class MultipleCatchDemo 
{ 
    public static void main(String[] args) 
    { 
        // Step 1: Initialize Variables
        int a = 10, b = 0, c; 
        int[] d = new int[3]; 
        String str = "abc"; 
        
        // Step 2: try Block
        try 
        { 
            // Attempt to assign value to an out-of-bounds index of the array
            d[3] = 55; // This will cause an ArrayIndexOutOfBoundsException
            
            // Attempt to divide by zero
            c = a / b; // This will cause an ArithmeticException
            
            // Attempt to convert a non-numeric string to an integer
            c = Integer.parseInt(str); // This will cause a NumberFormatException
        } 
        // Step 3: Multiple catch Blocks
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
        catch(NumberFormatException e) 
        { 
            // Handle NumberFormatException
            System.out.println("Number Format Exception is caught: " + e.getMessage()); 
        } 
        // Step 4: finally Block
        finally 
        { 
            // Finally block executed regardless of exception
            System.out.println("Finally block executed."); 
        } 
    } 
}