public class InvestmentAnalysisSystem {

/*
    Deadline: November 30th, 4pm.
*/





    int coupon = 10; //paid to investor at regular intervals  --> should be in percentage.



    int investedSum = 0;

    int price = 0; //investor pays this with sum invested

    int payout = 0;


    private double investorsReceiveBack;





    public static double sumAtTermPlusFinalCouponPayment (double invest, double coupon, double frequency){



        double couponInPercent = coupon * 1/100;

        double investorsReceiveBack  = invest * couponInPercent * frequency;

        return investorsReceiveBack;





    }





    public double sumOfDiscountedPaymentsWithInflationRateApplied(double sum, double x, double r, double N) {

        /*
        int x = 0;//value
        int r = 0;// inflation rate r
        int N = 0;// years
        */

        double discountedPaymets = 0.0; //result


        discountedPaymets = sum / (1+r)^N;




/*
        result = x * 1/(1+r)^N;
*/



        return discountedPaymets;


    }











}

