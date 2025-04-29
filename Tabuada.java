import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite um número para ver a sua tabuada: ");
        int nmr1 = teclado.nextInt();
        System.out.printf("Agora, digite o comprimento da tabuada: ");
        int nmr2 = teclado.nextInt();
        for (int c=1; c<=nmr2; c++){
            System.out.printf("\n%s x %s = %s", c, nmr1, c*nmr1);
        }
        System.out.print("\nFIM");
    }
}
