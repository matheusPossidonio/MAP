

public class Retangulo implements ElementoConcretoIF{

    private double base;
    private double altura;

    public Retangulo(double base, double altura ) throws Exception{
        if(base <= 0 || altura <= 0 || base == altura){
            throw new Exception();
        }
        this.altura = altura;
        this.base = base;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        System.out.println(v.visitaRetangulo(this));
    }

}
