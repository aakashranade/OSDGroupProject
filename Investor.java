import java.util.ArrayList;

public class Investor extends Portfolio {




    private String name;

    private int investment; //money

    private ArrayList<Bond> portfolio;



    public Investor(String name, int investment) {
        this.name = name;
        this.investment = investment;
        portfolio = new ArrayList<>();
    }

    //<!----------------------Getter functions---------------------------!>

    public void setName(String name) { this.name = name; }

    public void isBuying(Bond bond) { bond.setPrice(investment); }

    public void payout(Bond bond){

        bond.setPrice(investment);

        InvestmentAnalysisSystem ias = new InvestmentAnalysisSystem();

        double sum = ias.sumOfPaymentWithTermPlusFinalCouponPayment(bond, 0.0);

        System.out.println("Investor will benefit: " + sum);

    }

    public void setInvestment(int investment) { this.investment = investment; }

    public void setPortfolio(ArrayList<Bond> portfolio) { this.portfolio = portfolio; }

    //<!----------------------Setter functions---------------------------!>





}