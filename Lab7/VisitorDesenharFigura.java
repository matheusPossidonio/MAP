public class VisitorDesenharFigura implements VisitorIF {

    @Override
    public double visitaRetangulo(Retangulo r) {
        System.out.println("Desenhando um retangulo");
        return 0;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        System.out.println("Desenhando um circulo");
        return 0;
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        System.out.println("Desenhando um trapezio");
        return 0;
    }

    @Override
    public double visitatriangulo(Triangulo t) {
        System.out.println("Desenhando um triangulo");
        return 0;
    }
    
}
