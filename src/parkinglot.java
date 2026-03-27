import java.util.*;

class ParkingLot {
    private List<ParkingSlot> slots;
    private Map<String, Ticket> activeTickets;

    public ParkingLot(int capacity) {
        slots = new ArrayList<>();
        activeTickets = new HashMap<>();

        for (int i = 1; i <= capacity; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    public void parkVehicle(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied()) {
                slot.parkVehicle(vehicle);

                Ticket ticket = new Ticket(vehicle, slot.getSlotNumber());
                activeTickets.put(vehicle.getNumber(), ticket);

                System.out.println("Vehicle parked at Slot: " + slot.getSlotNumber());
                return;
            }
        }
        System.out.println("Parking Full!");
    }

}