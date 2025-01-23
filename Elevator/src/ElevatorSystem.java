import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevatorSystem {

    public static void elevatorService(Integer number, Person person, List<Elevator> elevators) {

        System.out.println();
        System.out.println("Requesting elevator service for person : " + number);
        System.out.println();

        Elevator selectedElevator = null;
        Integer minimumDistance = Integer.MAX_VALUE;

        for (Elevator elevator: elevators) {
            if (elevator.getCurrentFloor() - person.getCurrentFloor() < minimumDistance) {
                selectedElevator = elevator;
                minimumDistance = elevator.getCurrentFloor() - person.getCurrentFloor();
            }
        }

        System.out.println();
        System.out.println("Elevator arrived at floor : " + person.getCurrentFloor() + " for person : " + number + " from " + selectedElevator.getCurrentFloor() + "th floor.");
        System.out.println();
        
        if (person.getWeight() > selectedElevator.getMaximumWeight()) {
            System.out.println();
            System.out.println("Please take the stairs and do some cardio, person : " + number);
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Welcome aboard on the elevator");
            System.out.println();
            System.out.println("...Elevator Music...");
            System.out.println();
            System.out.println("Reached the destination floor!");
            System.out.println();
            System.out.println("Thank you for using our services!");
            System.out.println();
            System.out.println();
            System.out.println();
            selectedElevator.setCurrentFloor(person.getDestinationFloor());
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();
        List<Elevator> elevators = new ArrayList<>();

        int weight, currentFloor, destinationFloor;
        int maximumWeight, elevatorCurrentFloor, elevatorDestinationFloor;
        int number = 1;
        String status;

        Building building = new Building(5, 2);

        for (int elevator = 1; elevator <= building.elevators; elevator ++) {

            System.out.println();
            System.out.println("<----- Please enter the number of elevator and it's associated contraints! ----->");
            System.out.println();

            maximumWeight = scanner.nextInt();
            elevatorCurrentFloor = scanner.nextInt();
            elevatorDestinationFloor = scanner.nextInt();
            status = scanner.nextLine();

            elevators.add(new Elevator(maximumWeight, elevatorCurrentFloor, elevatorDestinationFloor, status));
        }


        for (int requests = 1; requests <= 10; requests ++) {

            System.out.println();
            System.out.println("<----- Please press to call the elevator service! ----->");
            System.out.println();

            weight = scanner.nextInt();
            currentFloor = scanner.nextInt();
            destinationFloor = scanner.nextInt();

            persons.add(new Person(weight, currentFloor, destinationFloor));
        }

        for (Person person: persons) {
            elevatorService(number, person, elevators);
            number ++;
        }

        scanner.close();
    }
}