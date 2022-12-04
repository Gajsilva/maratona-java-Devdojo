package academy.devdojo.javacore.Oexecetion.exeption.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException(){
        super("Login invalido");
    }
    public LoginInvalidoException(String message){
        super(message);
    }
}
