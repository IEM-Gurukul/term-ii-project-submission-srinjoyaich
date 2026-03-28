import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot(5);

        while (true) {
            System.out.println("\n===== SMART PARKING SYSTEM =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Available Slots");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle Type (car/bike/truck): ");
                    String type = sc.next();

                    System.out.print("Enter Vehicle Number: ");
                    String number = sc.next();

                    Vehicle vehicle;

                    if (type.equalsIgnoreCase("car")) {
                        vehicle = new Car(number);
                    } else if (type.equalsIgnoreCase("bike")) {
                        vehicle = new Bike(number);
                    } else {
                        vehicle = new Truck(number);
                    }

                    parkingLot.parkVehicle(vehicle);
                    break;

                case 2:
                    System.out.print("Enter Vehicle Number: ");
                    String num = sc.next();
                    parkingLot.exitVehicle(num);
                    break;

                case 3:
                    parkingLot.displayAvailableSlots();
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}