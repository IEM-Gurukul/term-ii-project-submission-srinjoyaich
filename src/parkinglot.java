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

}