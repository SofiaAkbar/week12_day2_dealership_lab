package Vehicle;

public abstract class Vehicle {

    private int price;
    private String colour;
    private Engine engine;
    private int damage;

    public Vehicle(int price, String colour, Engine engine) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

//    public int reportDamage(int damage){
//        return this.price -= this.damage;
//    }
}
