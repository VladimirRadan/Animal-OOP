public abstract class Animal {

    protected String animalSpecies;
    protected int age;
    protected String gender;
    protected double weight;

    public Animal(String animalSpecies, int age, String gender, double weight) {
        this.animalSpecies = animalSpecies;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    abstract void move();

    void eat(){
        System.out.println("Eating....");
    }




}
