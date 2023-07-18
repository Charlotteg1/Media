import java.time.LocalDate;

public class Film extends Media{
    private String director;
    private boolean shownInCinema;
    private int minutesLong;
    private double productionCost;
    private double revenue;
    public Film(String title, String language, LocalDate releaseDate, String director, boolean shownInCinema, int minutesLong, double productionCost, double revenue) {
        super(title,language,releaseDate);
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
    public void updateRevenue(double extraRevenue){
        this.revenue =this.revenue +extraRevenue;
    }
    public double calculateProfit(){ // this would also show if the film created a loss.

        return this.revenue - this.productionCost;
    }
    public String stateMediaType(){
        return "Broadcasting";
    }

}
