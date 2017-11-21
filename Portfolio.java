import java.util.ArrayList;

public class Portfolio extends ArrayList<InvestmentAnalysisSystem>{


    //investor wants to check the actual value of a bond under different inflation rate

    double r;

    public Portfolio(double r) {

        this.r =r;


    }



    public void print(){



        for (int i = 0; i < this.size(); i++) {

            System.out.println("<!-----------------------"+this.get(i).getInvestorName()+" "+this.get(i).getBondName()+" Analysis----------------------->\n");


            System.out.println(
                            "investor: "+this.get(i).getInvestorName()+ "\n"+
                            "payout: " + this.get(i).payout() + "\n" +
                            "r: " +r+ "\n" +
                            "value("+r+"): " +this.get(i).value(r) + "\n" +
                            "macaulayDuration("+r+"): " + this.get(i).macaulayDuration(r) + "\n"
            );

            System.out.println(
                            "<!--Delete me before submission fixed values for r to check for testcase--> "+"\n\n"+
                            "r: 0.02 \n" +
                            "value(0.02): " +this.get(i).value(0.02) + "\n" +
                            "macaulayDuration(0.02): " + this.get(i).macaulayDuration(0.02) + "\n\n"+
                             "<!--Delete me before submission fixed values for r to check for testcase-->\n "

            );
            System.out.println("<!-----------------------"+this.get(i).getInvestorName()+" "+this.get(i).getBondName()+" Analysis----------------------->\n");



        }






    }
}
