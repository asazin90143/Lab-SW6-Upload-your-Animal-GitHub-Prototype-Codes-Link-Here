public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Dolly");
        Animal sheep2 = registry.createSheep("Molly");
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        sheep1.makeSound();
        sheep2.makeSound();
        cow.makeSound();
        horse.makeSound();

        System.out.println("Type: " + sheep1.getType());
        System.out.println("Type: " + cow.getType());
        System.out.println("Type: " + horse.getType());
    }
}