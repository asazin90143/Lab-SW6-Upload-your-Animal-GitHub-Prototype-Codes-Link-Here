public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Sheep(legs, sound, food, name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the sheep says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public String getDetails() {
        return String.format(
                "Type: %s, Name: %s, Legs: %d, Sound: %s, Food: %s",
                getType(), name, legs, sound, food);
    }

    public void setName(String name) {
        this.name = name;
    }
}
