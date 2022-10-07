public class Cat extends Dog{
    public Cat(String damage, int age, String poroda, String color) {
        super(damage, age, poroda);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    private String color;

    @Override
    public void print() {

        System.out.println(info() + " " + " " + getColor());

    }


}
