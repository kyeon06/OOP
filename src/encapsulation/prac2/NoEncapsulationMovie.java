package encapsulation.prac2;

public class NoEncapsulationMovie {
    public static int REGULAR = 0;
    public static int NEW_RELEASE = 1;
    private int priceCode;

    public int getPriceCode() {
        return priceCode;
    }
}
