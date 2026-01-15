public class ImprimirCaracters {
    public static void main(String[] args) {
        ImprimirCaracters programa = new ImprimirCaracters();
        programa.inici();
    }

    public void inici() {
        imprimirLinia('*', 10);
        imprimirLinia('-', 20);
        imprimirLinia('#', 5);
        imprimirLinia('A', 15);
    }

    public void imprimirLinia(char caracter, int vegades) {
        for (int i = 0; i < vegades; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}
