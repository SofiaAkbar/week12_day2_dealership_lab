package Vehicle;

public abstract class Vehicle {

    private int price;
    private String colour;
    private Engine engine;

    public Vehicle(int price, String colour, Engine engine) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }
}
