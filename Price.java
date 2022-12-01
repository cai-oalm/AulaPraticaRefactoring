public abstract class Price {
   public abstract int getPriceCode();

  public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented){
          // add bonus for a two day new release rental
      return 1;
}
}

