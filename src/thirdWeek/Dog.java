package thirdWeek;

public class Dog extends Pet {

    String breed = "Stray";

    public Dog(String name, String breed) {
        super(1, 1, "Omnivore", name);
        this.breed = breed;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String str = super.toString() + "\nThis is "+ this.name + " and I am of " + this.breed + " breed!"; 
        return str;
    }
}
