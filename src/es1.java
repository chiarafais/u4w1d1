import java.lang.reflect.Array;
import java.util.Arrays;

public class es1 {
    public static void main(String[] args) {

        int result= multiplication(15,3);
        System.out.println(result);

        String concatResult= concat("try ", 18);
        System.out.println(concatResult);

//        String[] addString = new String[5];
//        addString = new String[]{"primo", "secondo", "terzo", "quarto", "quinto"};
//
//        System.out.println(Arrays.toString(addToArray(addString, "ciao")));
    }
    public static int multiplication(int x, int y){
        return x * y;
    }
    public static String concat(String a, int b){
        return a + b;
    }
//    public static String[] addToArray(String[] a, String b){
//        String[] arrayString = new String[5];
//        arrayString = a;
//        arrayString.add(2,b);
//        return arrayString;
//    }
}
