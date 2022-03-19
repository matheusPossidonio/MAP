

public class Triangulo implements ElementoConcretoIF{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura,double lado1,double lado2, double lado3 ) throws Exception{
        if(base <= 0 || altura <= 0 || lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ){
            throw new Exception();
        }
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1(){
        return this.lado1;
    }

    public double getLado2(){
        return this.lado2;
    }

    public double getLado3(){
        return this.lado3;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        System.out.println(v.visitatriangulo(this)) ;
        
    }

}
