import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int med = 0;
        if(a<=b && b<=c)
        {
            med = b;
        }
        if(c<=b && b<=a)
        {
            med = b;
        }
        if(a<=c && c<=b)
        {
            med = c;
        }
        if(b<=b && c<=a)
        {
            med = c;
        }
        if(c<=a && a<=b)
        {
            med = a;
        }
        if(b<=a && a<=c)
        {
            med = a;
        }
        return med;

    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int mag = 0;
        int magA = Math.abs(a);
        int magB = Math.abs(b);
        if(magA > magB)
        {
            mag = a;
        }
        else
        {
            mag = b;
        }
        return mag;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String ans = scan.next();
        if(ans.equals("median"))
        {
            System.out.println("What is the first number?");
            int a = scan.nextInt();
            System.out.println("What is the second number?");
            int b = scan.nextInt();
            System.out.println("What is the third number?");
            int c = scan.nextInt();
            System.out.println(median(a, b, c));
        }
        else if(ans.equals("magnitude"))
        {
            System.out.println("What is the first number?");
            int a = scan.nextInt();
            System.out.println("What is the second number?");
            int b = scan.nextInt();
            System.out.println(magnitude(a, b));
        }
        else if(ans.equals("pythagoras"))
        {
            System.out.println("What is the first number?");
            int a = scan.nextInt();
            System.out.println("What is the second number?");
            int b = scan.nextInt();
            System.out.println(pythagoras(a, b));
        }

    }
}
