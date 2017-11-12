public class Main {


    public static void main(String[] args) {

        Investor client1 = new Investor("Jeongho" , 100);
        Investor client2 = new Investor("Jeongho" , 140);
        Investor client3 = new Investor("Jeongho" , 150);
        Investor client4 = new Investor("Jeongho" , 160);


        //String name, String purchaseDate, String expiryDate, , double coupon, double frequency, double price


        Bond bond1 = new Bond("UK government bond", "2017/1/1", "2018/1/1", 0.1, 1.0);
        Bond bond2 = new Bond();
        Bond bond3 = new Bond();
        Bond bond4 = new Bond();


        InvestmentAnalysisSystem ias = new InvestmentAnalysisSystem();


        client1.isBuying(bond1);
        ias.sumOfPaymentWithTermPlusFinalCouponPayment(bond1, 0.0); //0.0 indicates inflation rate.


        System.out.println("returns: "+ias.sumOfPaymentWithTermPlusFinalCouponPayment(bond1, 0.0) );//0.0 indicates inflation rate.

        //exclude original price!




    }



}
