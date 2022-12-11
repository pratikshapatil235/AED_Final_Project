package model.taskbuffer;

public class AngelInvestFundRequest extends TaskRequest {

    private String location;
    
    private double requestAmount;

    public AngelInvestFundRequest(String location, double requestAmount) {
        this.location = location;
        
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

   

    public double getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(double requestAmount) {
        this.requestAmount = requestAmount;
    }

}
