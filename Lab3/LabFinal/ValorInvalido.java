public class ValorInvalido extends Exception{
    @Override
    public String getMessage(){
        return "o valor informado é menor ou igual a zero, por favor infome um valor válido";
  }
}
