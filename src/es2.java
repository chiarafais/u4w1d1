import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il tuo nome");
        String name = sc.nextLine();
        System.out.println("inserisci il tuo cognome");
        String surname = sc.nextLine();
        System.out.println("inserisci la città");
        String city = sc.nextLine();
        System.out.println("il tuoi dati sono: " + name + surname + city );
        System.out.println("il tuoi dati (al contrario) sono: " + city  + surname + name );
    sc.close();
    }
}
