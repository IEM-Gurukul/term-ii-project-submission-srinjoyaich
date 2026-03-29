class Bike extends Vehicle {
    public Bike(String number) {
        super(number, "Bike");
    }

    @Override
    public double calculateFee(long hours) {
        return hours * 10;
    }
}