import java.util.Scanner;

public class InvestmentAnalysisSystem {

/*
    Deadline: November 30th, 4pm.
*/


    public InvestmentAnalysisSystem() {/*default constructor*/}


    //<!----------------------General functions---------------------------!>


    public double sumOfPaymentWithTermPlusFinalCouponPayment(Bond bond, double inflationRate) {

        double investorsReceiveBack = bond.getPrice() * bond.getCoupon() * bond.getFrequency() * bond.getTerm();

        if (inflationRate > 0.0) {

            return investorsReceiveBack / Math.pow((1 + inflationRate), bond.getTerm());
        }

        return investorsReceiveBack;


    }


    public double macaulayDuration(Bond bond) {

        bond.getFrequency();

        return 0;
    }



    //<!----------------------General functions---------------------------!>


}

