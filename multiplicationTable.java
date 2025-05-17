import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        for (int o=1;o<=10;o++){
            int soma = num + o;
            System.out.printf("%s + %s = %s \n",num , o , soma);

        }
        System.out.print("\n+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
        for (int a=1;a<=10;a++){
            int sub = num + a;
            System.out.printf("\n%s - %s = %s\n",sub, num, a);

        }
        System.out.print("+=+=" + 25);
        for (int i=1;i<=10;i++){
            int mult = num * i;
            System.out.printf("\n%s * %s = %s\n",num, i, mult);

        }
        System.out.print("\n+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
        for (int u=1;u<=10;u++){
            int div = num * u;
            System.out.printf("\n%s / %s = %s\n",div, num, u);

        }
        System.out.print("\n+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
    }


}