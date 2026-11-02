import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Numerator");
            int n = sc.nextInt();
            
            System.out.println("Enter Denominator");
            int d = sc.nextInt();

            int res = n / d;
            System.out.println("Result : " + res);
            
            sc.close(); // Good practice to close the scanner
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
