package is.hi.hbv202g.ass8;

public class UserOrLendableDoesNotExistException extends Exception{

    public UserOrLendableDoesNotExistException(String errorMessage){
        super(errorMessage);
    }
}
