package estrutura_de_controle;

import java.util.Scanner;

public class Ex04DivisaoControlada {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner (System.in);

        //variables
        int divisor;
        int dividendo;
        int resultado;
        int divisao;
        System.out.println("------Divisão controlada------ \n");
        System.out.println(
                """
                        Aviso ⚠️: 1. Números maiores que o primeiro serão ignorados.\s
                                   2. Caso o resto da divisão dê 0, o programa será finalizado.\s
                        """);

        //while
        do {
            System.out.println("Digite o número divisor: ");
            divisor = scanner.nextInt();

            System.out.println("Digite o número dividendo");
            dividendo = scanner.nextInt();
            resultado = (dividendo % divisor);
            divisao =  (dividendo / divisor);

            if (resultado != 0 && divisor < dividendo) {
                System.out.println(dividendo + " ÷ " + divisor + " = " + divisao + "\n" +
                        "o resto é: "  + resultado);
            }

            else {
                System.out.println("Ignorado");
            }
        }
        while (resultado != 0);
        System.out.println("Paro");
    }
}