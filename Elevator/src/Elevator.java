public class Elevator {

    Integer maximumWeight;
    Integer currentFloor;
    Integer destinationFloor;
    String status;

    public Elevator(Integer maximumWeight, Integer currentFloor, Integer destinationFloor, String status) {
        this.maximumWeight = maximumWeight;
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.status = status;
    }

    public Integer getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(Integer maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Integer getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(Integer destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
