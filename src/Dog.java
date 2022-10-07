public class Dog extends Animal{
    public Dog(String damage, int age, String poroda) {
        super(damage, age);
        this.poroda = poroda;
    }

    public String getPoroda() {
        return poroda;
    }

    @Override
    public void print() {

        System.out.println(info() + " " + " " + getPoroda());

    }


    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    private String poroda;

}
