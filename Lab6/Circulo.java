public class Circulo {
    private static Circulo circulo;
    private Double raio;

    private Circulo(Double valor){
     raio = valor;
    }


    public static Circulo getInstance(Double raio){
        if(circulo == null){
           circulo = new Circulo(raio);
        }
        return circulo;
    } 

    public Double calcularArea(){
        return  3.14 * (raio * raio) ;
    }
}
