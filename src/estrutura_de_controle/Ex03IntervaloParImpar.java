package estrutura_de_controle;

import java.util.Scanner;

public class Ex03IntervaloParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // y>x
        int numerox, numeroy, usuario, x;


        //entrada do primeiro número
        System.out.println("Escolha um número: ");
        numerox = scanner.nextInt();

        //entrada do segundo (numeroy > numerox)
        System.out.println("Escolha um número maior que o primeiro: ");
        numeroy = scanner.nextInt();

        // Ímpar ou par?
        System.out.println("Para Par (1) \n" +
                "para Ímpar (2)");
        usuario = scanner.nextInt();


        switch (usuario) {
            case 1:
                for (x = numeroy; x >= numerox; x--) {

                    if (x % 2 == 0) {
                        System.out.println(x + " é par");
                    }

                }
                break;
            case 2:
                for (x = numeroy; x >= numerox; x--) {

                    if (x % 2 == 1) {
                        System.out.println(x + " é ímpar");
                    }
                }
        }

    }
}