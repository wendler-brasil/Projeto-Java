package fundamentos;

import java.util.Scanner;

public class Ex04DiferencaDeIdades {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner (System.in);

        //Primeira pessoa
        System.out.print("Digite seu nome: ");
        String nome = scan.next();

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        //segunda pessoa
        System.out.print("Digite seu nome: ");
        String nomeSeg = scan.next();

        System.out.print("Digite sua idade: ");
        int idadeSeg = scan.nextInt();

        //Calculo
        int resultado = Math.abs(idade - idadeSeg);

        System.out.println("A diferença de idade de " + nome + " e " + nomeSeg + " é: " + resultado);
    }
}
