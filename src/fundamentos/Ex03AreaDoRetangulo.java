package fundamentos;

import java.util.Scanner;

public class Ex03AreaDoRetangulo {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner (System.in);

        //Lados do retângulo
        System.out.println("Digite a altura: ");
        double altura = scan.nextDouble();

        System.out.println("digite a largura: ");
        double largura = scan.nextDouble();

        //Calculo da area
        double resultado = altura * largura;

        //Imprimir resultado
        System.out.println("A área do retângulo é: " + resultado);

    }
}
