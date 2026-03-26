class Truck extends Vehicle {
    public Truck(String number) {
        super(number, "Truck");
    }

    @Override
    public double calculateFee(long hours) {
        return hours * 50;
    }
}