public class VisitorCalcularPerimetro implements VisitorIF{

    @Override
    public double visitaRetangulo(Retangulo r) {
        return (r.getAltura() + r.getBase())*2;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        return 2 * 3.14 * c.getRaio();
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        return t.getbaseMaior() + t.getbaseMenor() + t.getLado1() + t.getLado2();
    }

    @Override
    public double visitatriangulo(Triangulo t) {
        return t.getLado1() + t.getLado2() + t.getLado3();
    }

}