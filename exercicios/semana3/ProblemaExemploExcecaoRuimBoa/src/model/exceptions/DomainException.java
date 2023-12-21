package model.exceptions;

public class DomainException extends RuntimeException{

    public DomainException(String msg){
        super(msg); // para poder instanciar a excecao atraves de uma msg
    }
}
