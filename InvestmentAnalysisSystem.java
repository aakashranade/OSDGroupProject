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

    //<!-- variables--->



    public InvestmentAnalysisSystem(Investor investor, Bond bond) {/*default constructor*/

        this.investor = investor;
        this.bond = bond;

    }

    public String getInvestorName(){

        return investor.getName();

    }

    public String getBondName(){

        return bond.getName();
    }



    public double payout() {


        double payout = bond.getTerm() * bond.getCoupon() + investor.getMoney() *bond.getFrequency();

        return payout;

    }



    public double value(double r) {


        double val = 0;
        double rep = 100 / Math.pow((1+r) , bond.getTerm());


        for (int i = 0; i < bond.getTerm(); i++) {


            val += bond.getCoupon() /Math.pow((1+r), i);

        }

        val += rep;


        return val;

    }

    public double macaulayDuration(double r) {


        double val = 0;
        double MacD = 0;

        for (int i = 1; i <= bond.getTerm(); i++) {
                if (i != bond.getTerm()) {

                        val += bond.getCoupon() / Math.pow((1 + r), i);
                        MacD += bond.getCoupon() / Math.pow((1 + r), i) * i;

                } else {

                        val += (bond.getCoupon() + bond.getIssuePrice()) / Math.pow((1 + r), i);
                        MacD += (bond.getCoupon() + bond.getIssuePrice()) / Math.pow((1 + r), i) * i;

                }
        }


        MacD /= val;


        return MacD;


    }









    }


    //<!---------------------- functions---------------------------!>




