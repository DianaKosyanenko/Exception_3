public class DateStringException extends Exception{
    String message;
    public DateStringException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
