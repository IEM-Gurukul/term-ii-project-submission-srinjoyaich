class Car extends Vehicle {
    public Car(String number) {
        super(number, "Car");
    }

    @Override
    public double calculateFee(long hours) {
        return hours * 20;
    }
}