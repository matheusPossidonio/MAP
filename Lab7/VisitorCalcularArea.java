public class VisitorCalcularArea implements VisitorIF{

    @Override
    public double visitaRetangulo(Retangulo r) {
        return r.getAltura() * r.getBase();
    }

    @Override
    public double visitaCirculo(Circulo c) {
        return 2 * 3.14 * c.getRaio();
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        return ((t.getbaseMaior() + t.getbaseMenor())*t.getAltura())/2;
    }

    @Override
    public double visitatriangulo(Triangulo t) {
        return (t.getAltura() * t.getBase())/2;
    }
    
}
