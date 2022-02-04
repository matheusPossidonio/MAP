public class Main {
    public static void main(String[] args)throws ValorInvalido {
        try {

        Quadrado quadrado = new Quadrado(0);
        System.out.println(quadrado.toString());
        
        } catch (ValorInvalido e) {
            System.out.println(new ValorInvalido().getMessage());
        }
    }
}
