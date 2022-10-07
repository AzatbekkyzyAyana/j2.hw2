import java.awt.print.Printable;

public class Main {
    public static void main(String[] args) {

        Printabl print[] = {className("oneObject"),className("twoObject"),className("treeObject")};
        for (Printabl printabl: print){
            printabl.print();
        }
    }
    public static  Printabl className(String className){
        switch (className){
            case "oneObject":
                Dog dog = new Dog("",5,"dog");
                return dog;
            case "twoObject":
                Cat cat = new Cat("crvtbry",4,"Cat","Ret");
                return cat;
            case "treeObject":
                Lion lion = new Lion("kill",9,"lion","","women");
                return lion;
        }
        return null;
    }
}