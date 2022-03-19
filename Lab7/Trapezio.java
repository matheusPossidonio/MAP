

public class Trapezio implements ElementoConcretoIF{
    private double baseMenor;
    private double baseMaior;
    private double altura;
    private double lado1;
    private double lado2;


    public Trapezio(double baseMenor, double altura, double baseMaior, double lado1,double lado2) throws Exception{
        if(baseMenor <= 0 || altura <= 0 || lado1 <= 0 || lado2 <= 0 || baseMaior <= 0 ){
            throw new Exception();
        }
        this.altura = altura;
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1(){
        return this.lado1;
    }

    public double getLado2(){
        return this.lado2;
    }
    public double getbaseMenor(){
        return this.baseMenor;
    }

    public double getbaseMaior(){
        return this.baseMaior;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        System.out.println(v.visitaTrapezio(this));
    }

}
