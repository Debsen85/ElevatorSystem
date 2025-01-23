public class Building {

    Integer floors;
    Integer elevators;

    public Building(Integer floors, Integer elevators) {
        this.floors = floors;
        this.elevators = elevators;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getElevators() {
        return elevators;
    }

    public void setElevators(Integer elevators) {
        this.elevators = elevators;
    }  
}
