public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Dolly");
        Animal sheep2 = registry.createSheep("Molly");
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        sheep1.makeSound();
        System.out.println(sheep1.getDetails());

        sheep2.makeSound();
        System.out.println(sheep2.getDetails());

        cow.makeSound();
        System.out.println(cow.getDetails());

        horse.makeSound();
        System.out.println(horse.getDetails());
    }
}