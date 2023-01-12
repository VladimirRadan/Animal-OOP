public class Bird extends Animal{


    public Bird(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }

    @Override
    void move() {
        System.out.println("Flapping wings...");
    }


}
