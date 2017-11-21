import java.util.ArrayList;

public class Investor {


    //<!-- variables-->


    private String name;

    private double money; //money

    private Portfolio portfolio;




    //<!-- variables-->


    //<!---constructor--->

    public Investor(String name, int money, double r) {
        this.name = name;
        this.money = money;
        portfolio = new Portfolio(r);
    }


    public Investor() {
    } //default constructor

    //<!---constructor--->


    //<!---getter--->


    public String getName() {
        return name;
    }


    public double getMoney() {
        return money;
    }


    //<!---getter--->


    //<!---setter--->

    public void setName(String name) {
        this.name = name;
    }


    public void setMoney(double money) {
        this.money = money;
    }


    //<!---setter--->



    
    public void purchasing(Bond... bonds){

        /*logic*/



        for (Bond bond: bonds) {
            portfolio.add(new InvestmentAnalysisSystem(this, bond));
        }


        //new InvestmentAnalysisSystem(this, bond );

    }


    public void portfolioReader() {

         portfolio.print();

    }
















}