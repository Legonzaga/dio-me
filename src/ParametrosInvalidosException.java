public class ParametrosInvalidosException extends Throwable{
    


    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
     

    public ParametrosInvalidosException(String msg) {
        super(msg);
    }

    public void invalidParameter() {

        System.out.println("O segundo parâmetro deve ser maior que o primeiro");

    }

}
