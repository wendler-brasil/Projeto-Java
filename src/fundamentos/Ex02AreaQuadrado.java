package fundamentos;

import java.util.Scanner;

public class Ex02AreaQuadrado {
public static void main(String[] args) {

    //Scanner
    Scanner scan = new Scanner (System.in);

    //Lado
    System.out.print("Digite o lado do quadrado: ");
    double lado = scan.nextDouble();

    //Calculo da area
    double resultado = Math.pow(lado, 2);

    //Imprimir resultado
    System.out.println("O lado do quadrado é: " + resultado);

    }
}
