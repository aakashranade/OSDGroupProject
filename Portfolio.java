import java.util.ArrayList;

public class Portfolio extends ArrayList<InvestmentAnalysisSystem> {


    //investor wants to check the actual value of a bond under different inflation rate

    double r;

    public Portfolio(double r) {

        this.r = r;


    }



    public void print(int i) {


            System.out.println("<!-----------------------" + this.get(i).getInvestorName() + " " + this.get(i).getBondName() + " Analysis----------------------->\n");


            System.out.println(
                            "name: " + this.get(i).getInvestorName() + "\n" +
                            "current balance: " + this.get(i).getInvestorBalance() + "\n" +
                            "payout: " + this.get(i).payout() + "\n" +
                            "r: " + r + "\n" +
                            "value(" + r + "): " + this.get(i).value(r) + "\n" +
                            "macaulayDuration(" + r + "): " + this.get(i).macaulayDuration(r) + "\n"+
                            "irr: " + this.get(i).calculateIrr() + "\n"
            );

            System.out.println("# of bonds : "+this.get(i).getBondPurchasedNumber());

          /*  System.out.println(
                    "<!--Fixed value for r = 0.02 to check testcase--> " + "\n\n" +
                            "r: 0.02 \n" +
                            "value(0.02): " + this.get(i).value(0.02) + "\n" +
                            "macaulayDuration(0.02): " + this.get(i).macaulayDuration(0.02) + "\n" +
                            "irr: " + this.get(i).calculateIrr() + "\n\n"+
                    "<!--Fixed value for r = 0.02 to check testcase-->\n "

            );
*/




    }
}
