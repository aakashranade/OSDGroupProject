import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TestCasesGenerator {


    //<!-- variables-->

    private String maturityDate;

    private String settlementDate;

    private double payout;

    private double coupon;

    private double price;

    private String name;

    //<!-- variables--->


    //<!---constructor---->

    public TestCasesGenerator(String name, String settlementDate, String maturityDate, double coupon, double price) {
        this.name = name;
        this.settlementDate = settlementDate;
        this.maturityDate = maturityDate;
        this.coupon = coupon;
        this.price = price;
    }

    //<!---constructor---->

    //<!---getter---->


    public double getTerm() {

        try {
            Date start;
            Date end;

            SimpleDateFormat dates = new SimpleDateFormat("yyyy/MM/dd");


            start = dates.parse(this.settlementDate);
            end = dates.parse(this.maturityDate);

            double difference = Math.abs(start.getTime() - end.getTime());
            double differenceByYear = (difference / (24 * 60 * 60 * 1000)) / 365;

            DecimalFormat d = new DecimalFormat("##.0");

            return Double.parseDouble(d.format(differenceByYear));

        } catch (ParseException e) {

            return 0;

        }

    }

    public double getCoupon() {
        return coupon;
    }

    public double getPrice() {
        return price;
    }

    //<!---getter---->


    //<!---setter---->


    public void setCoupon(double coupon) {
        this.coupon = coupon;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //<!---setter---->


    public double payout() {


        payout = getTerm() * this.coupon + 100;

        return payout;

    }


    public double value(double r) {

      double val = 0;



        for (int i = 1; i <= getTerm(); i++) {


            val += coupon / Math.pow((1 + r), i);
        }

        double actualVal =  100 / Math.pow((1 + r), getTerm());


        actualVal += val;



        return actualVal;

    }

    public double macaulayDuration(double r) {


        double val =0;

        for (int i = 1; i <= getTerm(); i++) {

         val +=  i * coupon / Math.pow((1 + r), i);

        }


        double val2 = getTerm() * 100/ Math.pow((1+r), getTerm());


        double val3 = val2 + val;

        double MacD = val3 / value(r);


        return MacD;




      /*  double val = 0;
        double MacD= 0;

        for (int i = 1; i <= getTerm(); i++) {
                if(i != getTerm()) {
                        val += this.coupon / Math.pow((1 + r), i);
                        MacD += this.coupon / Math.pow((1 + r), i) * i;
                }else{
                        val += (this.coupon + this.price) / Math.pow((1 + r), i);
                        MacD += (this.coupon + this.price) / Math.pow((1 + r), i) * i;
                }
        }


        MacD /= val;


        return MacD;*/


    }



    public double calculateIrr(){

        double r  = 0;



        for (; price != value(r) ;) {

            if(value(1+r) > price)          r+=1;
            else if( value(0.1 + r) >price) r+=0.1;
            else if( value(0.01 + r) >price) r+=0.01;
            else if( value(0.001 + r) >price) r+=0.001;
            else if( value(0.0001 + r) >price) r+=0.0001;
            else break;


        }


        return r;

    }


    public static void testGenerator(TestCasesGenerator test) {


        System.out.println("<!------ result: " + test.name + " ------>\n");
        System.out.println("term = "+test.getTerm()+", "+"coupon = "+test.getCoupon()+", "+"price = "+test.getPrice());
        System.out.println(

                "payout: " + test.payout() + "\n" +
                        "value(0.05): " + test.value(0.05) + "\n" +
                        "value(0.02): " + test.value(0.02) + "\n" +
                        "macaulayDuration(0.05): " + test.macaulayDuration(0.05) + "\n" +
                        "macaulayDuration(0.02): " + test.macaulayDuration(0.02) + "\n" +
                        "irr(): " + test.calculateIrr() + "\n"
        );


    }


    public static void main(String[] args) {

        ArrayList<TestCasesGenerator> test = new ArrayList<>();


        test.add(new TestCasesGenerator("basic", "2017/11/11", "2022/11/11", 10, 100));
        test.add(new TestCasesGenerator("test1", "2017/11/11", "2022/11/11", 5, 100));
        test.add(new TestCasesGenerator("test2", "2017/11/11", "2027/11/11", 4, 95));
        test.add(new TestCasesGenerator("test3", "2017/11/11", "2037/11/11", 3, 92));
        test.add(new TestCasesGenerator("test4", "2017/11/11", "2032/11/11", 2, 120));


        test.add(new TestCasesGenerator("test5", "2017/11/11", "2027/11/11", 5, 103));


        for (int i = 0; i < test.size(); i++) {

            testGenerator(test.get(i));

        }





    }
}
