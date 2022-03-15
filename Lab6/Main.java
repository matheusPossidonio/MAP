
public class Main {
    public static void main(String[] args) throws Exception{

        Triangulo teste = Triangulo.getIstanceIsosceles(20, 20, 31);
        System.out.println("valor = "+ teste.calcularAreaIsosceles());

        Triangulo teste2 = Triangulo.getIstanceEquilatero(10,10, 10);
        System.out.println("valor = "+ teste2.calcularAreaEquilatero());

        Triangulo teste3 = Triangulo.getIstanceRetangulo(17, 20, 25);
        System.out.println("valor = "+ teste3.calcularAreaRetangulo());

        Triangulo teste4 = Triangulo.getIstanceRetangulo(10, 20, 25);
        System.out.println("valor = "+ teste4.calcularAreaRetangulo());

        Circulo circulo = Circulo.getInstance( 8.0);
        //Circulo.getInstance(3);
        System.out.println("valor = "+circulo.calcularArea());

        Quadrado quadrado = new Quadrado(9);
        System.out.println("valor = "+quadrado.calcularArea());
    }
}
