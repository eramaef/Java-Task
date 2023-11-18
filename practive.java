import static java.lang.Math.*;

public class StaticImportConflict {
    static void greetMe(String name){
        System.out.println("Good Day, "+name+" have a nice day.");
    }

    static int add(int a, int b){

        return addExact(a,b);
    }
    public static void main(String[] args) {
        System.out.println(sqrt(16));
        System.out.println(add(9,9));
        
    }
}