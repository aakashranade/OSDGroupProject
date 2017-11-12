import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bond {


    private String name; // names of bonds e.g. UK government bond

    private String purchaseDate; //date

    private String expiryDate;

    private double coupon;  //percentage of investment, paid to investor at regular intervals.

    private double frequency; //year

    private double price;


    public Bond() {
    }// default constructor


    public Bond(String name, String purchaseDate, String expiryDate, double coupon, double frequency) {

        this.name = name;
        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
        this.coupon = coupon;
        this.frequency = frequency;


    }

    public Bond(String purchaseDate, String expiryDate) {

        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
    }


    //<!----------------------Getter functions---------------------------!>

    public String getName() { return name; }

    public double getFrequency() {
        return frequency;
    }

    public double getPrice() {
        return price;
    }

    public double getCoupon() {
        return coupon;
    } // bond must be stored in decimal (e.g. 50%  -> 0.5)

    public double getTerm() {

        /*logic*/

        // expiryDate-purchaseDate

        try {
            Date start;
            Date end;

            SimpleDateFormat dates = new SimpleDateFormat("yyyy/MM/dd");


            start = dates.parse(this.purchaseDate);
            end = dates.parse(this.expiryDate);

            double difference = Math.abs(start.getTime() - end.getTime());
            double differenceByYear = (difference / (24 * 60 * 60 * 1000)) / 365;

            return differenceByYear;

        } catch (ParseException e) {

            return (double) e.getErrorOffset();
        }


    }
    //<!----------------------Getter functions---------------------------!>


    //<!----------------------Setter functions---------------------------!>

    public void setPrice(double price) { this.price = price; }

    public void setCoupon(double coupon) { this.coupon = coupon; }

    public void setFrequency(double frequency) { this.frequency = frequency; }

    //<!----------------------Setter functions---------------------------!>







}
