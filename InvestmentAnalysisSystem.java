import java.util.Scanner;

public class InvestmentAnalysisSystem {

/*
    Deadline: November 30th, 4pm.
*/


    public InvestmentAnalysisSystem() {/*default constructor*/}


    //<!----------------------General functions---------------------------!>


    public double sumOfPaymentWithTermPlusFinalCouponPayment(Bond bond, double inflationRate) {

        double investorsReceiveBack = 0.0;

        if (inflationRate == 0.0) {

            investorsReceiveBack = bond.getPrice() * bond.getCoupon() * bond.getFrequency() * bond.getTerm();

            return investorsReceiveBack;
        }

        return investorsReceiveBack / Math.pow((1 + inflationRate), bond.getTerm());

    }


    public double macaulayDuration(Bond bond) {

        bond.getFrequency();

        return 0;
    }



    //<!----------------------General functions---------------------------!>


}

