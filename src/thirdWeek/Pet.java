package thirdWeek;

public class Pet extends Animal {
    
    String name = "";

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String str = super.toString() + "<Name: " + this.name + ">";
        return str;
    }

    public Pet(int vertebrate, int warm_blooded, String diet, String name) {
        super(vertebrate, warm_blooded,diet);
        this.name = name;
    }
}
