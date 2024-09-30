// imports
import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        // to make imports usable in code
        Scanner s = new Scanner(System.in);

        // print statements + gathering input into variables
        System.out.println("""
                -----------------------------------------------------------------
                | Note! Do not use any symbols when inputting data (no $ or %)! |
                | Also, submit whole numbers for tip percentages.               |
                -----------------------------------------------------------------
                Enter your Bill($):""");
        String first = s.nextLine();
        double totalBill = Double.parseDouble(first);
        System.out.println("Tip Percent:");
        String second = s.nextLine();
        int tipPercent = Integer.parseInt(second);
        System.out.println("Number of People:");
        String third = s.nextLine();
        int numPeople = Integer.parseInt(third);

        // calculating from inputs 
        TipCalculator Tip = new TipCalculator(totalBill,tipPercent,numPeople);

        // printing results
        System.out.println(Tip);
    
        s.close(); // good practice :)
    }
}