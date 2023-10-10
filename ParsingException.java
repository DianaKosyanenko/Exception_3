public class ParsingException extends Exception{
    String message;
    public ParsingException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
