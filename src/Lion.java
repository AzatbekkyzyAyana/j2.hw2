public class Lion extends  Cat {
    public Lion(String damage, int age, String poroda, String color, String pol) {
        super(damage, age, poroda, color);
        this.pol = pol;
    }

    public String getPol() {

        return pol;
    }

    @Override
    public void print() {

        System.out.println(info() + " " + " " + getPol());

    }


    @Override
    public String info() {
        return getPol();

    }

    private String pol;


}
