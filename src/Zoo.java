public class Zoo {



    public static void main(String[] args) {

        Cat cat = new Cat("Lion", 15, "M", 100.00);

        Animal bird = new Bird("Hawk", 15, "M", 50);

        Tiger tiger = new Tiger("Bengal", 15, "M", 200);

        //moveAnimals(bird);

        Flyable flyingBird = new Bird("Pigeon", 15, "M", 20);
        flyingBird.fly();

        Animal[] animals = {cat, bird, tiger};

//        cat.move();
//        bird.move();
//        tiger.move();

        moveAnimals(animals);


    }


    public static void moveAnimals(Animal[] animals){
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
    }

    



}