package model.taskbuffer;

public class RescueRequest extends TaskRequest {
    private String location;
    
    public RescueRequest(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public String toString() {
        return location;
    }
}
