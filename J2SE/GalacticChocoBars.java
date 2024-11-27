public class GalacticChocoBars {
    public static void main(String[] args) {
        int credits = 15;
        int chocoCost = 1;
        int wrapperExchangeRate = 3;

        int chocoBars = credits / chocoCost;
        int wrappers = chocoBars;

        while (wrappers >= wrapperExchangeRate) {
            int extraBars = wrappers / wrapperExchangeRate;
            chocoBars += extraBars;
            wrappers = wrappers % wrapperExchangeRate + extraBars;
        }

        System.out.println("Total ChocoBars consumed: " + chocoBars);
    }
}