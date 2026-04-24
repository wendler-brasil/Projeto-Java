package fundamentos;

import java.util.Scanner;

public class Ex01Idade {
    public static void main(String[] args) {

        //scanner
        Scanner scan = new Scanner(System.in);

        //Idade
        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        //Ano de nascimento
        System.out.println("Ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        //Ano atual
        System.out.println("Digite o ano atual: ");
        int ano = scan.nextInt();

        //Calculo idade
        int idade = ano - anoNascimento;

        //Imprimir nome e idade
        System.out.println("Olá " + nome + ", sua idade é " + idade);
    }
}
