import java.util.ArrayList;

public class Portfolio extends ArrayList<InvestmentAnalysisSystem>{


    //investor wants to check the actual value of a bond under different inflation rate

    double inflationRate;

    public Portfolio(double r) {

        inflationRate = r;


    }



    public void print(){

        for (int i = 0; i < this.size(); i++) {
            System.out.println("<!------- Bond:"+this.get(i).getBondName()+"-------->");

            System.out.println(
                    "payout: " + this.get(i).payout() + "\n" +
                            "value(0.05): " +this.get(i).value(inflationRate) + "\n" +
                            "value(0.02): " + this.get(i).value(0.02) + "\n" +
                            "macaulayDuration(0.05): " + this.get(i).macaulayDuration(0.05) + "\n" +
                            "macaulayDuration(0.02): " + this.get(i).macaulayDuration(0.02)
            );

            System.out.println(this.get(i).getInvestorName()+" holds "+this.size()+" bonds");
        }





    }
}
