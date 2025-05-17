public class numerosParImpar {

    public static void main(String[] args) {
        System.out.println("Números de 1 a 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Números pares de 1 a 50:\n");
        int numero = 1;
        while (numero <= 50) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");

            }
            numero++;
        }
        System.out.println("Números pares de 1 a 50:\n");
        int impar = 1;
        while (impar <= 50) {
            if (impar % 2 != 0) {
                System.out.print(impar + " ");
            }
            impar++;
        }
    }
}