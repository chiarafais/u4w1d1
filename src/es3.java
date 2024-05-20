import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        prima parte
        System.out.println("inserisci altezza rettangolo");
        double h = sc.nextDouble();
        System.out.println("inserisci base rettangolo");
        double b = sc.nextDouble();
        System.out.println("il perimetro è : "+ sum(h,b)  );

//        seconda parte

        System.out.println("inserisci un numero");
        int num = sc.nextInt();
        System.out.println("se 0=pari e 1=dispari, il tuo numero è : "+ pariDispari(num)  );


//        terza parte
        System.out.println("primo lato");
        double latA = sc.nextDouble();
        System.out.println("secondo lato");
        double latB = sc.nextDouble();
        System.out.println("terzo lato");
        double latC = sc.nextDouble();
        System.out.println("l'area è : "+ areaTriangolo(latA,latB,latC)  );


    }
    public static double sum(double h, double b){
        return (h+b)* 2;
    }
    public static int pariDispari(int number) {
        if ((number % 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static double areaTriangolo(double latA, double latB, double latC){
        double semiperimetro=  (latA+latB+ latC) / 2;
        return Math.sqrt(semiperimetro*(semiperimetro- latA)*(semiperimetro- latB)*(semiperimetro- latC));
    }
}
