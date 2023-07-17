public class Film {
    private String director;
    private boolean shownInCinema;
    private int minutesLong;
    private double productionCost;
    private double revenue;
    public Film(String director, boolean shownInCinema, int minutesLong, double productionCost, double revenue) {
        this.director = director;
        this.shownInCinema = shownInCinema;
        this.minutesLong = minutesLong;
        this.productionCost = productionCost;
        this.revenue = revenue;
    }
    public String getDirector() {
        return this.director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public boolean isShownInCinema() {
        return this.shownInCinema;
    }
    public void setShownInCinema(boolean shownInCinema) {
        this.shownInCinema = shownInCinema;
    }
    public int getMinutesLong() {
        return this.minutesLong;
    }
    public void setMinutesLong(int minutesLong) {
        this.minutesLong = minutesLong;
    }
    public double getProductionCost() {
        return this.productionCost;
    }
    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }
    public double getRevenue() {
        return this.revenue;
    }
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }


}
