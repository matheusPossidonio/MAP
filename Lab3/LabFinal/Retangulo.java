public class Retangulo implements FiguraGeometrica{
    private int altura;
    private int largura;

    Retangulo(int altura, int largura)throws ValorInvalido{
        if(altura <=0 || largura <=0){
            
                 
            throw new ValorInvalido();
        }else{
            this.altura = altura;
        }
        this.largura = largura;
    }

     @Override
    public  int calcularArea(){
        return this.altura * this.largura;
    }

    @Override
    public  int calcularPerimetro(){
        return (this.altura * 2) + (this.largura * 2);
    }

    @Override
    public String toString(){
        return "\nA altura e largura do retangulo informados foi: "
         + this.largura + ", " + this.altura + 
        ", a sua área é: " + calcularArea() +
         " , o seu perímetro é: " + calcularPerimetro();
    }
}