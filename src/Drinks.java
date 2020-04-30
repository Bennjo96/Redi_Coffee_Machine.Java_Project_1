public class Drinks {
    float coffee;
    float milk;
    float water;
    String name;

    public Drinks(float Coffee, float milk, float water, String name) {
        this.coffee = Coffee;
        this.milk = milk;
        this.water = water;
        this.name = name;
    }

    public static Drinks makeEspresso() {
        return new Drinks(1, 0, 1, "Espresso");
    }

    public static Drinks makeLatte() {
        return new Drinks(1, 1, 1, "Latte");
    }

    public static Drinks makeDrip() {
        return new Drinks(1, 0, 1, "Drip");
    }
}
