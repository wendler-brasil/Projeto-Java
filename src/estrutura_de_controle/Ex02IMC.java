package estrutura_de_controle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02IMC {
    public static void main(String[] args) {
        //variables and scanner
        double weight;
        double height;
        double imc;
        Scanner scanner = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("---- IMC ----");
        //Questions
        System.out.println("Fala teu peso ai pae ");
        weight = scanner.nextDouble();
        System.out.println("Agora a altura ");
        height = scanner.nextDouble();

        System.out.println("\n");
        System.out.println("Processando...");
        System.out.println("\n");

        //Imc
        imc = weight / (height*height);

        //Imc list
        if (imc <= 18.5) {
            System.out.println("Seu imc é: " + imc + " (Abaixo do peso)");
        }
        else if (imc <= 24.9){
            System.out.println("Seu imc é: " + imc + " (Peso ideal)");
        }
        else if ( imc <= 29.9){
            System.out.println("Seu imc é: " + imc + " (Sobrepeso)");
        }
        else if (imc <=  34.9){
            System.out.println("Seu imc é: " + imc + " (Obesidade Grau I)");
        }
        else if (imc <= 39.9) {
            System.out.println("Seu imc é: " + imc + " (Obesidade Grau II)");
        }
        else if (imc > 40) {
            System.out.println("Seu imc é: " + imc + " (Obesidade Grau III (Grave))");
        }

        System.out.println(df.format(imc));
    }
}