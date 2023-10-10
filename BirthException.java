public class BirthException extends Exception{
    String inputString;

    public BirthException(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public String getMessage() {
        return "Ошибка при вводе даты '" + inputString + "', требуется формат 'дд.мм.гггг'.\n";
    }
}
