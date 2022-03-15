import java.rmi.server.ExportException;
import java.lang.Math;
public class Triangulo {
    private static Triangulo trianguloIsosceles;
    private static Triangulo trianguloEquilatero;
    private static Triangulo trianguloRetangulo;
    private double lado1;
    private double lado2;
    private double lado3;

    //Fazer Exeption para os tipos de triangulo(ex: Expetion se Isoceles tiver mais de 2 lados diferentes)
    private Triangulo(double valor1, double valor2, double valor3)throws Exception{
        if(valor1  <= 0 || valor2 <= 0 || valor3<=0  ){
            throw new Exception();
        }

        lado1 = valor1;
        lado2 = valor2;
        lado3 = valor3;
    }

    public static Triangulo getIstanceIsosceles(double lado1, double lado2, double lado3)throws Exception{
        if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            if (trianguloIsosceles == null) {
                trianguloIsosceles = new Triangulo(lado1, lado2, lado3);
            }
            return trianguloIsosceles;
        }
        else throw new Exception("Triangulo Não Isosceles");

    }

    public double calcularAreaIsosceles()throws Exception{
      double base = 0;
      double h = 0;
        if(this.lado1 == this.lado2){
             base = lado3;
             h = Math.sqrt(Math.pow(lado1,2)-(Math.pow(base,2))/4);
        }
        if(this.lado2 == this.lado3){
             base = lado1;
             h = Math.sqrt(Math.pow(lado2,2)-(Math.pow(base,2))/4);
        }
        if(this.lado3 == this.lado1) {
             base = lado2;
             h = Math.sqrt(Math.pow(lado1,2)-(Math.pow(base,2))/4);
        }
        return (base*h)/2;
    }

    public double calcularAreaRetangulo()throws Exception{

        return lado1+lado2/2;
    }

    public double calcularAreaEquilatero()throws Exception{
        Triangulo aux = getIstanceEquilatero(1, 1, 1);
        return (Math.pow(lado1,2)*Math.sqrt(3))/4;
    }

    public static Triangulo getIstanceEquilatero(double lado1, double lado2, double lado3)throws Exception{

        if(lado1 == lado2 && lado2 == lado3){
             if(trianguloEquilatero == null){
                trianguloEquilatero = new Triangulo(lado1, lado2, lado3);
            }
            return trianguloEquilatero;
        }
        else
            throw new Exception("Triangulo não Equilatero");
    }

    public static Triangulo getIstanceRetangulo(double lado1, double lado2, double lado3)throws Exception{
        if(trianguloRetangulo == null){
            trianguloRetangulo = new Triangulo(lado1, lado2, lado3);
        }

        return trianguloRetangulo;
    }
}
