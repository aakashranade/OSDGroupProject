public class Main {


    public static void main(String[] args) {

        Investor client1 = new Investor("Jeongho" , 100);
        Investor client2 = new Investor("Jeongho" , 140);
        Investor client3 = new Investor("Jeongho" , 150);
        Investor client4 = new Investor("Jeongho" , 160);


        //String name, String purchaseDate, String expiryDate, , double coupon, double frequency, double price
        Bond a = new Bond("UK government bond",10, 5, );



        InvestmentAnalysisSystem m = new InvestmentAnalysisSystem();

        m.sumAtTermPlusFinalCouponPayment()



    }



}
