

public class Circulo implements ElementoConcretoIF  {
    private double raio;

    public Circulo(double raio) throws Exception{
        if(raio <= 0){
            throw new Exception();
        }
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    public void aceitaVisita(VisitorIF v){
        System.out.println(v.visitaCirculo(this));
    }
}
