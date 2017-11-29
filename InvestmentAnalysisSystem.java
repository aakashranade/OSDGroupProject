import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class InvestmentAnalysisSystem {

/*
    Deadline: November 30th, 4pm.
*/
    //<!-- variables--->

    private Bond bond;

    private Investor investor;

    private Portfolio portfolio;

    //<!-- variables--->



    public InvestmentAnalysisSystem(Investor investor, Bond bond) {/*default constructor*/

        this.investor = investor;
        this.bond = bond;


    }


    public String getInvestorName() {

        return investor.getName();

    }

    public String getBondName() {

        return bond.getName();
    }

    public int getBondPurchasedNumber() {

        return investor.getNumberOfBonds();
    }

    public double getBondIssuePrice(){

        return bond.getIssuePrice();
    }


    //<!---functions--->

    public double getInvestorBalance(){



        return investor.getBalance();


    }


    public double payout() {


        double payout = bond.getTerm() * bond.getCoupon() + (100 * bond.getFrequency());

        return payout;

    }


    public double value(double r) {


        double val = 0;


        for (int i = 0; i <= bond.getTerm(); i++) {


            val += bond.getCoupon() / Math.pow((1 + r), i);

        }

        double actualVal = 100 / Math.pow((1 + r), bond.getTerm());

        val += actualVal;


        return val;


    }

    public double macaulayDuration(double r) {


        double val1 = 0;

        double val2 = 0;

        for (int i = 1; i <= bond.getTerm(); i++) {

            val1 += i * bond.getCoupon() / Math.pow((1 + r), i);

        }


        val2 = bond.getTerm() * 100 / Math.pow((1 + r), bond.getTerm());


        double val3 = val1 + val2;

        double MacD = val3 / value(r);


        return MacD;



     /*   double val = 0;
        double MacD = 0;

        for (int i = 1; i <= bond.getTerm(); i++) {
                if (i != bond.getTerm()) {

                        val += bond.getCoupon() / Math.pow((1 + r), i);
                        MacD += bond.getCoupon() / Math.pow((1 + r), i) * i;

                } else {

                        val += (bond.getCoupon() + investor.getMoney()) / Math.pow((1 + r), i);
                        MacD += (bond.getCoupon() + investor.getMoney()) / Math.pow((1 + r), i) * i;

                }
        }


        MacD /= val;


        return MacD;
    */

    }


    public double calculateIrr() {

        double r = 0;




        for( ;bond.getIssuePrice() != value(r); )
        {

            if (value(1 + r) > bond.getIssuePrice()) r += 1;
            else if (value(0.1 + r) > bond.getIssuePrice()) r += 0.1;
            else if (value(0.01 + r) > bond.getIssuePrice()) r += 0.01;
            else if (value(0.001 + r) > bond.getIssuePrice()) r += 0.001;
            else if (value(0.0001 + r) > bond.getIssuePrice()) r += 0.0001;
            else break;


        }


        return r;

    }


}


//<!---functions--->


