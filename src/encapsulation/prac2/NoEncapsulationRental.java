package encapsulation.prac2;

public class NoEncapsulationRental {
    private NoEncapsulationMovie movie;
    private int daysRented;

    public int getFrequentRenterPoints() {
        if (movie.getPriceCode() == NoEncapsulationMovie.NEW_RELEASE && daysRented > 1)
            return 2;
        else return 1;
    }
}
