public class Triangulo {
    private static Triangulo trianguloIsosceles;
    private static Triangulo trianguloEquilatero;
    private static Triangulo trianguloRetangulo;
    private double lado1;
    private double lado2;
    private double lado3;


    private Triangulo(double valor1, double valor2, double valor3)throws Exception{
        if(valor1  <= 0 || valor2 <= 0 || valor3<=0  ){
            throw new Exception();
        }

        lado1 = valor1;
        lado2 = valor2;
        lado3 = valor3;
    }

    public static Triangulo getIstanceIsosceles(double lado1, double lado2, double lado3)throws Exception{
        if(trianguloIsosceles == null){
            trianguloIsosceles = new Triangulo(lado1, lado2, lado3);
        }

        return trianguloIsosceles;
    }

    public double calcularAreaIsosceles()throws Exception{
        Triangulo aux =getIstanceIsosceles(1, 1, 1);
        return aux.lado1 + aux.lado2 +aux.lado3;
    }

    public double calcularAreaRetangulo()throws Exception{
        Triangulo aux =getIstanceRetangulo(1, 1, 1);
        return aux.lado1 + aux.lado2 + aux.lado3;
    }

    public double calcularAreaEquilatero()throws Exception{
        Triangulo aux = getIstanceEquilatero(1, 1, 1);
        return aux.lado1 + aux.lado2 + aux.lado3;
    }

    public static Triangulo getIstanceEquilatero(double lado1, double lado2, double lado3)throws Exception{
        if(trianguloEquilatero == null){
            trianguloEquilatero = new Triangulo(lado1, lado2, lado3);
        }

        return trianguloEquilatero;
    }

    public static Triangulo getIstanceRetangulo(double lado1, double lado2, double lado3)throws Exception{
        if(trianguloRetangulo == null){
            trianguloRetangulo = new Triangulo(lado1, lado2, lado3);
        }

        return trianguloRetangulo;
    }
}
