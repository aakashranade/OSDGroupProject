import java.util.Scanner;

public class InvestmentAnalysisSystem  {

/*
    Deadline: November 30th, 4pm.
*/


    private  Scanner src;

    private int coupon = 10; //paid to investor at regular intervals  --> should be in percentage.


    private int investedSum = 0;

    private int price = 0; //investor pays this with sum invested

    private int payout = 0;

    private static boolean inflation;


    public InvestmentAnalysisSystem() {

        src = new Scanner(System.in);

    }


    private double investorsReceiveBack;


    public double sumAtTermPlusFinalCouponPayment(boolean inflation, double invest, double coupon, double frequency) {


        double couponInPercent = coupon * 0.01;

        double  investorsReceiveBack = invest * (1+couponInPercent) * frequency;

       if (inflation) {

           double inflationRate = src.nextDouble();

           return sumOfDiscountedPaymentsWithInflationRateApplied(investorsReceiveBack, inflationRate, frequency);

       }

        return investorsReceiveBack;


    }


    public double macaulayDuration(Bond bond) {


        bond.getFrequency();

        return 0;
    }


    public static double sumOfDiscountedPaymentsWithInflationRateApplied(double value, double inflationRate, double years) {

        /*
        int x = 0;//value
        int r = 0;// inflation rate r
        int N = 0;// years
        */


        double discountedPaymets = (value / (1 + inflationRate)) ^ years;


        return discountedPaymets;


    }


}

