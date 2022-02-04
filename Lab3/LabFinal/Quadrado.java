public class Quadrado implements FiguraGeometrica {
    private int lado;

    Quadrado(int lado)throws ValorInvalido{
        if(lado <=0){
            
                 
            throw new ValorInvalido();
        }else{
            this.lado = lado;
        }
        this.lado = lado;
    }

     @Override
    public  int calcularArea(){
        return this.lado * this.lado;
    }

    @Override
    public  int calcularPerimetro(){
        return this.lado * 4;
    }

    @Override
    public String toString(){
        return "O lado informado do quadrado foi: " + this.lado + 
        ", a sua área é: " + calcularArea() +
         " , o seu perímetro é: " + calcularPerimetro();
    }
}
