package Src;

public class Circulo implements FiguraGeometrica{
    private int raio;
    private final double pi = 3.14;

    public Circulo(int raio)throws ValorInvalido{
        if(raio <=0){
            throw new ValorInvalido();
        }else{
            this.raio = raio;
        }
        this.raio = raio;
    }

     @Override
    public  int calcularArea(){
        double area = 2 * pi * this.raio;
        return (int)area;
    }

    @Override
    public  int calcularPerimetro(){
        double perimetro = pi *(this.raio * this.raio);
        return (int)perimetro;
    }

    @Override
    public String toString(){
        return "O raio informado do circulo foi: " + this.raio + 
        ", a sua área é: " + calcularArea() +
         " , o seu perímetro é: " + calcularPerimetro();
    }
}
