public class PhoneException extends Exception{
    String inputString;

    public PhoneException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Не правильно введен номер телефона" + inputString;
    }
}

