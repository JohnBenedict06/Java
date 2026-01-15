import java.util.Scanner;

public class LlegirReals {
    public static void main(String[] args) {
        LlegirReals programa = new LlegirReals();
        programa.inici();
    }

    public void inici() {
        double a;
        a = llegirReal();
        System.out.println("El valor introduït és: " + a);
    }

    public double llegirReal() {
        Scanner teclat = new Scanner(System.in);
        double num;

        System.out.print("Introdueix un nombre real: ");
        num = teclat.nextDouble();
        teclat.close();
        return num;
    }
}
