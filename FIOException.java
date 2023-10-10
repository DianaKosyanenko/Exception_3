public class FIOException extends Exception{
    String inputString;

    public FIOException(String inputString){
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Неправидьный формат ФИО" + inputString + "\n";
    }
}
