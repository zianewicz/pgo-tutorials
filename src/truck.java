class truck extends Vechicle {
    private double milesDriven;
    private double fuelConsuming;
    private double cargoWeight; //
    public Truck(String make, String model, int year, double milesDriven, double fuelConsuming,double cargoWeight){
        super(make, model, year);
        this.milesDriven=milesDriven;
        this.fuelConsuming=fuelConsuming;
        this.cargoWeight=cargoWeight;
    }
    @Override
    public double calculateFuelEfficiency(){
        return milesDriven / (fuelConsumed + (cargoWeight * 0.5));
    }
}