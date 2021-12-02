import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RespostaHoraDoDia.main();

        System.out.println("Escolha um das opções abaixo para calcular a área :");
        System.out.println("1 - Área do Quadrado");
        System.out.println("2 - Área do Retângulo");
        System.out.println("3 - Área do Trapézio");
        System.out.println("4 - Área do Triângulo");
        System.out.println("5 - Área do Círculo");

        Scanner input = new Scanner(System.in);
        int opcaoUsuario = input.nextInt();


        switch (opcaoUsuario) {
            case 1: {
                System.out.println("Informe o comprimento do lado do quadrado: ");
                double lado = Double.parseDouble(input.next());
                Quadrilatero.area(lado);
                break;
            }

            case 2: {
                System.out.println("Informe o comprimento dos lados do retângulo: ");
                double lado1 = Double.parseDouble(input.next());
                double lado2 = Double.parseDouble(input.next());
                Quadrilatero.area(lado1, lado2);
                break;
            }

            case 3: {
                System.out.println("Informe o comprimento dos lados e altura do trapézio: ");
                double baseMaior = Double.parseDouble(input.next());
                double baseMenor = Double.parseDouble(input.next());
                double altura = Double.parseDouble(input.next());
                Quadrilatero.area(baseMaior, baseMenor, altura);
                break;
            }

            case 4: {
                System.out.println("Informe o comprimento da base e altura do triângulo: ");
                double base = Double.parseDouble(input.next());
                double altura = Double.parseDouble(input.next());
                Triangulo.area(base, altura);
                break;
            }

            case 5: {
                System.out.println("Informe o comprimento do raio do círculo: ");
                double raio = Double.parseDouble(input.next());
                Circunferencia.area(raio);
                break;
            }

            default: {
                input.close();
                System.out.println("Valor informado incorreto. Programa finalizado.");
                break;
            }
        }
    }
}
