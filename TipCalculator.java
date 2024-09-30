// imports
import java.text.DecimalFormat;

public class TipCalculator
{
    DecimalFormat formatter = new DecimalFormat("0.00"); // money format
    // variables
    private double totalTip;
    private double totalBillTip;
    private double tipPerson;
    private double totalPerson;

    // calculations
    public TipCalculator(double totalBill, int tipPercent, int numPeople)
    {
        this.totalTip = tipPercent / 100.0 * totalBill;
        this.totalBillTip = totalTip + totalBill;
        this.tipPerson = totalTip/numPeople;
        this.totalPerson = totalBillTip/numPeople;
    }
    
    // string formatting instances 
    public String toString()
    {
        String s = ("""
            -----------------------------------
            | Total Tip Amount: $""" + (formatter.format(totalTip)) + "        |" + """
            
            -----------------------------------
            | Total Bill Cost: $""" + (formatter.format(totalBillTip)) + "        |" + """
            
            -----------------------------------
            | Tip Per Person: $""" + (formatter.format(tipPerson)) + "          |" + """
            
            -----------------------------------
            | Total Bill Per Person: $""" + (formatter.format(totalPerson)) + "   |" + """
            
            -----------------------------------""");
        return s;
    }
}

