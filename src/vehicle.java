abstract class Vechicle {
    protected String make;
    protected String model;
    protected int year;
    public Vechicle( String make, String model, int year) {
        this.make= make;
        this.model=model;
        this.year=year;
    }
    public abstract double calculateFuelEfficiency();
}