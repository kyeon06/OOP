package encapsulation.prac2;

public class EncapsulationRental {
    private EncapsulationMovie movie;
    private int daysRented;

    public int getFrequentRenterPoints() {
        // 방법 1
//        if (movie.isNewRelease() && daysRented > 1)
//            return 2;
//        else return 1;

        // 방법 2 : 좀 더 적극적인 방법으로 캡슐화 하기
        return movie.getFrequentRenterPoints(daysRented);
    }
}
