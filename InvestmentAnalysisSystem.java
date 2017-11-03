public class InvestmentAnalysisSystem {

/*
    Deadline: November 30th, 4pm.
*/


    private Scanner src

    private int coupon = 10; //paid to investor at regular intervals  --> should be in percentage.


    private int investedSum = 0;

    private int price = 0; //investor pays this with sum invested

    private int payout = 0;

    private boolean inflation = true;


    public InvestmentAnalysisSystem() {

        src = new Scanner(System.in);

    }


    private double investorsReceiveBack;


    public static double sumAtTermPlusFinalCouponPayment(double invest, double coupon, double frequency) {


        double couponInPercent = coupon * 1 / 100;

        double investorsReceiveBack = invest * couponInPercent * frequency;

        if (inflation) {

            sumAtTermPlusFinalCouponPayment(investorsReceiveBack, r , frequency)
        }
        return investorsReceiveBack;


    }


    public double macaulayDuration(double coupon, double value) {

    }


    public double sumOfDiscountedPaymentsWithInflationRateApplied(double value, double r, double N) {

        /*
        int x = 0;//value
        int r = 0;// inflation rate r
        int N = 0;// years
        */

        double discountedPaymets = 0.0; //result

        discountedPaymets = sum / (1 + r) ^ N;


        return discountedPaymets;


    }


}

