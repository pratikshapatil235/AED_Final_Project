package model.taskbuffer;

public class AngelInvestFundRequest extends TaskRequest {

    private String location;
    private int population;
    private double requestAmount;

    public AngelInvestFundRequest(String location, int population, double requestAmount) {
        this.location = location;
        this.population = population;
        this.requestAmount = requestAmount;

    }

    @Override
    public String toString() {
        return location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(double requestAmount) {
        this.requestAmount = requestAmount;
    }

}
