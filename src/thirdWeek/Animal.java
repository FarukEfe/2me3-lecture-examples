package thirdWeek;

public class Animal {
    int vertebrate = 0;
    int warm_blooded = 0;
    String diet = "Carnivore";

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        // return super.toString();
        String info = "<vertabrate: " + ((this.vertebrate == 1) ? "true" : "false") + ", warm_blooded: " + ((this.warm_blooded == 1) ? "true" : "false") + ", diet: " + this.diet + ">";
        return info;
    }

    public Animal(int vertebrate, int warm_blooded, String diet) {
        this.vertebrate = vertebrate;
        this.warm_blooded = warm_blooded;
        this.diet = diet;
    }
}
