import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args)throws InterruptedException {

        Scanner scan = new Scanner (System.in);

        double num1, num2, resultado, novoNum, novoResul;
        int opcao;
        int subOpcao = -1;

        String texto = "Calculadora Interativa";

        for(char letra : texto.toCharArray()) {

            System.out.print(letra);

            Thread.sleep(150);

        }
        System.out.println();
        do {

            System.out.println ();
            System.out.println ("1 - Soma");
            System.out.println ("2 - Subtração");
            System.out.println ("3 - Multiplicação");
            System.out.println ("4 - Divisão");
            System.out.println ("5 - Potência");
            System.out.println ("6 - Raiz quadrada");
            System.out.println ("0 - Para sair");
            Thread.sleep(100);
            System.out.println("Selecione uma opção: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println ();
                    System.out.print ("Digite o primeiro número: ");
                    num1 = scan.nextDouble ();
                    System.out.print ("Digite o segundo número; ");
                    num2 = scan.nextDouble();
                    resultado = num1 + num2;
                    System.out.println (num1 + " + " + num2 + " = " + resultado);



                    while (subOpcao != 2) {

                        System.out.println ();
                        System.out.println ("Digite 1 para informar mais um número a soma");
                        System.out.println ("Digite 2 para voltar ao menu principal");
                        subOpcao = scan.nextInt();

                /* uso do if e break para quebrar a condição do while
                caso o usuário escolher 2 */

                        if (subOpcao == 2){
                            break;
                        }
                        System.out.println ();

                        System.out.print ("Informe mais um número: ");
                        novoNum = scan.nextInt();
                        novoResul = resultado;
                        resultado += novoNum;
                        System.out.println (novoResul + " + " + novoNum + " = " + resultado);
                    }

                    break;
                case 2:
                    System.out.print ("Digite o primeiro número: ");
                    num1 = scan.nextDouble ();
                    System.out.print ("Digite o segundo número; ");
                    num2 = scan.nextDouble();
                    resultado = num1 - num2;
                    System.out.println (num1 + " - " + num2 + " = " + resultado);




                    while (subOpcao != 2) {

                        System.out.println ();
                        System.out.println ("Digite 1 para informar mais um número a subtração");
                        System.out.println ("Digite 2 para voltar ao menu principal");
                        subOpcao = scan.nextInt();
                        if (subOpcao == 2){
                            break;
                        }
                        System.out.println ();

                        System.out.print ("Informe mais um número: ");
                        novoNum = scan.nextDouble();
                        novoResul = resultado;
                        resultado -= novoNum;
                        System.out.println (novoResul + " - " + novoNum + " = " + resultado);
                    }
                    break;
                case 3:
                    System.out.println ();
                    System.out.print ("Digite o primeiro número: ");
                    num1 = scan.nextDouble ();
                    System.out.print ("Digite o segundo número; ");
                    num2 = scan.nextDouble();
                    resultado = num1 * num2;
                    System.out.println (num1 + " x " + num2 + " = " + resultado);

                    break;
                case 4:
                    System.out.println ();
                    System.out.print ("Digite o primeiro número: ");
                    num1 = scan.nextDouble ();
                    System.out.print ("Digite o segundo número; ");
                    num2 = scan.nextDouble();
                    resultado = num1 / num2;
                    double resto = num1 % num2;
                    System.out.println (num1 + " / " + num2 + " = " + resultado);
                    System.out.println ("resto: " + resto);

                    break;
                case 5:
                    System.out.println ();
                    System.out.print ("Digite a base: ");
                    num1 = scan.nextDouble ();
                    System.out.print ("Digite o expoente; ");
                    num2 = scan.nextDouble();
                    resultado = Math.pow (num1, num2);
                    System.out.println (num1 + " ^ " + num2 + " = " + resultado);

                    break;
                case 6:
                    System.out.println ();
                    System.out.print ("Digite o valor: ");
                    num1 = scan.nextDouble ();
                    resultado = Math.sqrt (num1);
                    System.out.println ("√" + num1 + " = " + resultado);
                    break;
                default:
                    System.out.println ("Não tem isso na opção, bobão");
            }

        }
        while (opcao != 0);
        scan.close();

    }
}