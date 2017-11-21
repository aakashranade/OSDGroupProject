import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bond {


    //<!-- variables-->

    private String name;

    private String purchaseDate; //date

    private String maturityDate;

    private double coupon;

    private double frequency;

    private double issuePrice;

    //<!-- variables-->




    //<!---constructor--->



    public Bond(String name, String purchaseDate, String maturityDate, double coupon, double issuePrice, double frequency) {

        this.name = name;
        this.purchaseDate = purchaseDate;
        this.maturityDate = maturityDate;
        this.coupon = coupon;
        this.issuePrice = issuePrice;
        this.frequency = frequency;

    }

    public Bond() {
    }// default constructor

    //<!---constructor--->


    //<!---getter--->

    public String getName() { return name; }

    public double getFrequency() {
        return frequency;
    }

    public double getIssuePrice() {
        return issuePrice;
    }

    public double getCoupon() {
        return coupon;
    } // bond must be stored in decimal (e.g. 50%  -> 0.5)

    public double getTerm() {

        /*logic*/

        // maturityDate-purchaseDate

        try {
            Date start;
            Date end;

            SimpleDateFormat dates = new SimpleDateFormat("yyyy/MM/dd");


            start = dates.parse(this.purchaseDate);
            end = dates.parse(this.maturityDate);

            double difference = Math.abs(start.getTime() - end.getTime());
            double differenceByYear = (difference / (24 * 60 * 60 * 1000)) / 365;

            DecimalFormat decf = new DecimalFormat("##.0");

            return Double.parseDouble(decf.format(differenceByYear));

        } catch (ParseException e) {

            return (double) e.getErrorOffset();
        }


    }

    //<!---getter--->

    //<!---setter--->


    public void setIssuePrice(double issuePrice) { this.issuePrice = issuePrice; }

    public void setCoupon(double coupon) { this.coupon = coupon; }

    public void setFrequency(double frequency) { this.frequency = frequency; }

    //<!---setter--->







}
