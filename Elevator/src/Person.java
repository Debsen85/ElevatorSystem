public class Person {
    
    Integer weight;
    Integer currentFloor;
    Integer destinationFloor;

    public Person (Integer weight, Integer currentFloor, Integer destinationFloor) {
        this.weight = weight;
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
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
}
