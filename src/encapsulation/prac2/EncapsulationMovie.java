package encapsulation.prac2;

public class EncapsulationMovie {
    public static int REGULAR = 0;
    public static int NEW_RELEASE = 1;
    private int priceCode;

    public int getPriceCode() {
        return priceCode;
    }

//    public boolean isNewRelease() {
//    }

    // 데이터를 들고 있는 쪽에 기능을 추가하는 방법
    public int getFrequentRenterPoints(int daysRented) {
        if (priceCode == NEW_RELEASE && daysRented > 1)
            return 2;
        else return 1;
    }
}
