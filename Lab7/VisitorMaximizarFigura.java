public class VisitorMaximizarFigura implements VisitorIF{

    @Override
    public double visitaRetangulo(Retangulo r) {
        System.out.println("Retangulo maximizado, os valores ficaram: " +
                            "\n Base = " + r.getBase() +
                            "\n Altura = " + r.getAltura()
                            );
        return 0;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        System.out.println("Circulo maximizado, os valores ficaram: " +
                            "\n Base = " + c.getRaio()
                            );
        return 0;
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        System.out.println("Trapezio maximizado, os valores ficaram: " +
                            "\n Base maior = " + t.getbaseMaior() +
                            "\n Base menor = " + t.getbaseMenor() +
                            "\n Lado1 = " + t.getLado1() +
                            "\n Lado2 = " + t.getLado2() +
                            "\n Altura = " + t.getAltura()
                            );
        return 0;
    }

    @Override
    public double visitatriangulo(Triangulo t) {
        System.out.println("Trapezio maximizado, os valores ficaram: " +
                            "\n Base  = " + t.getBase() +
                            "\n Lado1 = " + t.getLado1() +
                            "\n Lado2 = " + t.getLado2() +
                            "\n Altura = " + t.getAltura()
                            );
        return 0;
    }
    
}
