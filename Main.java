public class Main {


    public static void main(String[] args) {

        Investor investor1 = new Investor("Jeongho", 100, 0.05);
        Investor investor2 = new Investor("Jeonghoisthebest", 140,0.05);
        Investor investor3 = new Investor("Jeonghodideverything", 150,0.05);
        Investor investor4 = new Investor("Jeonghoheelo", 160, 0.05);



        Bond bond0 =  new Bond("bond0", "2017/11/11", "2022/11/11", 10, 100,1);
        Bond bond1 =  new Bond("bond1", "2017/11/11", "2022/11/11", 5, 103,1);
        Bond bond2 =  new Bond("bond2", "2017/11/11", "2027/11/11", 4, 95,1);
        Bond bond3 =  new Bond("bond3", "2017/11/11", "2037/11/11", 3, 92,1);
        Bond bond4 =  new Bond("bond4", "2017/11/11", "2032/11/11", 2, 120,1);



        investor1.purchasing(bond1, bond2 , bond3, bond4);

        investor1.portfolioReader();


        investor2.purchasing(bond1, bond2);

        investor2.portfolioReader();





    }


}
