public class Animal implements Printabl {
    public String damage;
    public int age;

    public String getDamage() {
        return damage;
    }


    public Animal(String damage, int age) {
        this.damage = damage;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String info() {
        return getDamage()+getAge();
    }
    @Override
    public void print() {

    }
}
