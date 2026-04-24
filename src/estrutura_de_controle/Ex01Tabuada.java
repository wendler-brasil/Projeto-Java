package estrutura_de_controle;

import java.util.Scanner;

public class Ex01Tabuada {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);

        //numero
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        //repetição
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

        }
    }
}
