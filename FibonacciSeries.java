/**
 * The FibonacciSeries class in Java prints the Fibonacci series up to a given count.
 */
/**
 * The FibonacciSeries class is used to print a series of Fibonacci numbers.
 */
class FibonacciSeries{  
    static int n1=0,n2=1,n3=0;    
    static void printFibonacci(int count){    
       if(count>0){    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            printFibonacci(count-1);    
        }    
    }    
    // The `public static void main(String args[])` method is the entry point of the Java program. It
    // is the method that is executed when the program is run.
    public static void main(String args[]){    
     int count=10;    
     System.out.print(n1+" "+n2);//printing 0 and 1    
     printFibonacci(count-2);//n-2 because 2 numbers are already printed   
    }  
   }  
