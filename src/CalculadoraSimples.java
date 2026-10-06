import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        int repetir = 1;

        double numero1;
        double numero2;
        double resultado;

        while (repetir == 1) {

            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            System.out.print("Qual operação deseja fazer? ");
            opcao = scanner.nextInt();

            System.out.print("Digite o primeiro número: ");
            numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            numero2 = scanner.nextDouble();

            switch (opcao) {

                case 1:

                    resultado = numero1 + numero2;

                    System.out.println(
                            "A soma dos números " +
                                    numero1 + " + " +
                                    numero2 + " = " +
                                    resultado
                    );

                    break;

                case 2:

                    resultado = numero1 - numero2;

                    System.out.println(
                            "A subtração dos números " +
                                    numero1 + " - " +
                                    numero2 + " = " +
                                    resultado
                    );

                    break;

                case 3:

                    resultado = numero1 * numero2;

                    System.out.println(
                            "A multiplicação dos números " +
                                    numero1 + " * " +
                                    numero2 + " = " +
                                    resultado
                    );

                    break;

                case 4:

                    if (numero2 == 0) {

                        System.out.println(
                                "Atenção: não é possível realizar uma divisão por zero."
                        );

                    } else {

                        resultado = numero1 / numero2;

                        System.out.println(
                                "A divisão dos números " +
                                        numero1 + " / " +
                                        numero2 + " = " +
                                        resultado
                        );
                    }

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

            System.out.println("\nDeseja repetir?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.print("Digite: ");

            repetir = scanner.nextInt();
        }

        System.out.println("Calculadora encerrada.");

        scanner.close();
    }
}

