package testproject;

public class Food {

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    int i1;
    int i2;

    public Food(int c, int x) {
        i1 = c;
        i2 = x;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//    public  void eat() {
//        System.out.println("I am the eat method in Food Class");
//    }
}
