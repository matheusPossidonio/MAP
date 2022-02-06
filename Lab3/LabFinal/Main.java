import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws ValorInvalido, IOException {
        boolean verificacao = true;
        Scanner entrada = new Scanner(System.in);

        while(verificacao){
            try {

                int caso;

                System.out.println(" Informe oq deseja utilizar");
                System.out.println("1- caso deseje o perímetro e area do quadrado. ");
                System.out.println("2- caso deseje o perímetro e area do retangulo. ");
                System.out.println("3- caso deseje o perímetro e area do circulo. ");
                System.out.println("4- caso deseje encerrar o programa. ");
                caso = entrada.nextInt();

                switch (caso) {
                    case 1:
                        System.out.println("Informe o valor do lado do quadrado:");
                        int lado  = entrada.nextInt();
                        Quadrado quadrado = new Quadrado(lado);
                        System.out.println(quadrado.toString());
                        break;
                    case 2:
                        System.out.println("Informe o valor da altura do retangulo:");
                        int altura = entrada.nextInt();
                        System.out.println("Informe o valor da largura do retangulo:");
                        int largura = entrada.nextInt();
                        Retangulo retangulo = new Retangulo(altura, largura);
                        System.out.println(retangulo.toString());
                        break;
                    case 3:
                        System.out.println("Informe o valor do raio do circulo:");
                        int raio = entrada.nextInt();
                        Circulo circulo = new Circulo(raio);
                        System.out.println(circulo.toString());
                        break;
                    case 4:
                        verificacao = false;
                        entrada.close();
                        break;
                    default:
                        System.out.println("opção nao encontrada, informe uma opção valida");
                }

                } catch (ValorInvalido e) {
                    System.out.println(new ValorInvalido().getMessage());
                }catch(InputMismatchException e){
                    System.out.println("voce informou um tipo invalido.");
                    break;
                }

        }
    }
}
