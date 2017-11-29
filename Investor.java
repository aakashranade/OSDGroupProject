import java.util.ArrayList;

public class Investor {


    //<!-- variables-->


    private String name;

    private double balance; //balance

    private Portfolio portfolio;

    private int numberOfBonds;


    //<!-- variables-->


    //<!---constructor--->

    public Investor(String name, int balance, double r) {
        this.name = name;
        this.balance = balance;
        portfolio = new Portfolio(r);
    }


    public Investor() {
    } //default constructor

    //<!---constructor--->


    //<!---getter--->


    public int getNumberOfBonds() {
        return numberOfBonds;
    }

    public String getName() {
        return name;
    }


    public double getBalance() {
        return balance;
    }


    //<!---getter--->


    //<!---setter--->


    public void setName(String name) {
        this.name = name;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    //<!---setter--->


    //<!---functions--->

    public void purchasing(Bond... bonds) {

        /*logic*/


        for (Bond bond : bonds) {

            numberOfBonds++;

            if(balance > bond.getIssuePrice()) {

                balance -= bond.getIssuePrice();

                portfolio.add(new InvestmentAnalysisSystem(this, bond));

                portfolio.print(numberOfBonds-1);



            }else{



                System.out.println("+------------------------------------------------------------------------+ ");
                System.out.println("| "+bond.getName()+" cannot be purchased of your account balance is too low           | ");
                System.out.println("+------------------------------------------------------------------------+ ");

            }


        }
    }






    //new InvestmentAnalysisSystem(this, bond );

    public void analysePortfolio(){




    }


    //<!---setter--->


}
