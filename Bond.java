public class Bond {




    private String name; // names of bonds e.g. UK government bond

    private String purchaseDate; //date

    private String expiryDate;

    private double coupon;  //percentage of investment, paid to investor at regular intervals.

    private double frequency; //year

    private double price;

    public Bond() {
    }// default constructor


    public Bond(String name, String purchaseDate, String expiryDate, double coupon, double frequency, double price) {

        this.name = name;
        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
        this.coupon = coupon;
        this.frequency = frequency;
        this.price = price;
    }




}
