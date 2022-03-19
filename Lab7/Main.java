
public class Main{
     public static void main(String[] args) throws Exception {
        VisitorIF calculaArea = new VisitorCalcularArea();
        VisitorIF desenhista = new VisitorDesenharFigura();
        VisitorIF calculaPerimetro = new VisitorCalcularPerimetro();
        VisitorIF maximizador = new VisitorMaximizarFigura();

        Circulo circulo = new Circulo(3);
        Trapezio trapezio = new Trapezio(12, 15, 20, 15, 15);
        Triangulo triangulo = new Triangulo(10, 15, 20, 30, 20);
        Retangulo retangulo = new Retangulo(10,20);

        System.out.println("------------------------------------------------------");
        System.out.println("Area do triangulo: ");
        triangulo.aceitaVisita(calculaArea);
        System.out.println("Area do retangulo: ");
        retangulo.aceitaVisita(calculaArea);
        System.out.println("Area do circulo:  ");
        trapezio.aceitaVisita(calculaArea);
        System.out.println("Area do circulo: ");
        circulo.aceitaVisita(calculaArea);

        System.out.println("------------------------------------------------------");
        System.out.println("Perimetro do triangulo: ");
        triangulo.aceitaVisita(calculaPerimetro);
        System.out.println("Perimetro do retangulo: ");
        retangulo.aceitaVisita(calculaPerimetro);
        System.out.println("Perimetro do circulo:  ");
        trapezio.aceitaVisita(calculaPerimetro);
        System.out.println("Perimetro do circulo: ");
        circulo.aceitaVisita(calculaPerimetro);

        System.out.println("------------------------------------------------------");
        triangulo.aceitaVisita(desenhista);
        retangulo.aceitaVisita(desenhista);
        trapezio.aceitaVisita(desenhista);
        circulo.aceitaVisita(desenhista);

        System.out.println("------------------------------------------------------");
        triangulo.aceitaVisita(maximizador);
        retangulo.aceitaVisita(maximizador);
        trapezio.aceitaVisita(maximizador);
        circulo.aceitaVisita(maximizador);

    }

}