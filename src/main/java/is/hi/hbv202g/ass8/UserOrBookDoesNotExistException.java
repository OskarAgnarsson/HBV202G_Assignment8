package is.hi.hbv202g.ass8;

public class UserOrBookDoesNotExistException extends Exception{

    public UserOrBookDoesNotExistException(String errorMessage){
        super(errorMessage);
    }
}
