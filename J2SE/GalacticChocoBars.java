public class GalacticChocoBars {
    public static void main(String[] args) {
        int credits = 15;
        int wrapperExchangeRate = 3;

        int totalChocoBars = credits;
        int wrappers = credits;

        while (wrappers >= wrapperExchangeRate) {
            totalChocoBars += wrappers / wrapperExchangeRate;
            wrappers = wrappers / wrapperExchangeRate + wrappers % wrapperExchangeRate;
        }

        System.out.println("Total ChocoBars consumed: " + totalChocoBars);
    }
}