public class Investor {




    String name;

    int invest; //money

    ArrayList<Bond> portfolio;



/*
    investor is buying bonds
*/



    public Investor(String name, int invest) {
        this.name = name;
        this.invest = invest;
        portfolio = new ArrayList<>();
    }





    public int getInvest() {
        return invest;
    }


    public void setInvest(int invest) {
        this.invest = invest;
    }


}
