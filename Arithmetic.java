public class Arithmetic {
    public static void main(String[] args) {
        // addition is with the '+' operator
        
        System.out.println("Two plus two is equal to " + (2 + 2));
        System.out.println("362 plus 781 is equal to " + (363 + 781));
        System.out.println("999,999,999 + 1 is equal to " + (999_999_999 + 1)); // <-- Notice again it's perfectly
                                                                       // allowed to have underscores in our integer
                                                                       // literals to make them more readable.
        
        // subtraction is with the '-' operator
        
        System.out.println("Two minus two is equal to " + (2 - 2));
        System.out.println("121 minus 459 is equal to " + (121 - 459));
        System.out.println("1 - 999,999,999 is equal to " + (1 - 999999999));
        
        // multiplication is with the '*' operator
        System.out.println("Two times two is equal to " + (2 * 2));
        System.out.println("7 times by 7 times by 7 is " + (7 * 7 * 7));
        System.out.println("1,000 x by 0 is equal to " + (1000 * 0));
        
        // division is with the '/' operator
        System.out.println("1 divided by 1 is equal to " + (1 / 1));
        System.out.println("1 divided by 2 is equal to " + (1 / 2));
        System.out.println("5 / 6 is " + (5 / 6));
        System.out.println("6 / 5 is " + (6 / 5));
        
        
        // Pay close attention to these next expressions.
        
        
        
        int num1 = 6;
        int num2 = 12;
        
        num2 = num1 * num2;
        System.out.println("num1: " + num1 + " num2: " + num2);
        
        num1 = 6;
        // Did I have to reset the value of num1 to 6? 
        num2 = 12;
        num2 *= num1;
        //   ^^ This is called an "assignment operator". What do you think it does?
        System.out.println("num1: " + num1 + " num2: " + num2);
        
        num2 = 12;
        num2 += num2;
        // You can reference a variable twice in the same expression?!?
        System.out.println("num1: " + num1 + " num2: " + num2);
        
        num2 = 12;
        num2 -= num1;
        System.out.println("num1: " + num1 + " num2: " + num2);
        
        num2 = 12;
        num2 /= num1;
        System.out.println("num1: " + num1 + " num2: " + num2);
        
        
        
        int newNum = 5;
        
        newNum++;
        System.out.println("newNum: " + newNum);
        newNum++;  
        System.out.println("newNum: " + newNum);
        newNum++;   // These are called increment operators, and are equivalent to
                    // the expression "num += 1;". Also, yeah, in-line comments are a thing :)            
        System.out.println("newNum: " + newNum);
        
        newNum--;
        System.out.println("newNum: " + newNum);
        newNum--;   // These are called decrement operators, and are equivalent to
                    // the expression "num -= 1;".
        System.out.println("newNum: " + newNum);
    }
}