import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Presenter< V extends View> {

    private DataChecker model;
    private V view;

    public Presenter(V v) {
        view = v;
    }

    public void start() {
        boolean wokring = true;
        do {
            String input = view.getInput(
                    "Введите данные через пробел Фамилию Имя Отчество Дату Рождения Номер Телефона Пол или Exit для выхода из программы:");
            if (input.equals("Exit")) {
                wokring = false;
                break;
            } else {

                String[] splitedInput = input.replaceAll("\\s+", " ").split(" ");

                int inputDataCount = checkInputDataCount(splitedInput.length);
                if (inputDataCount == -1) {
                    view.printOutput("Слишком мало данных на вводе");
                } else if (inputDataCount == 0) {
                    view.printOutput("Слишком много данных на вводе ");
                } else {
                    try {
                        model = new DataChecker();
                        model.CheckData(splitedInput);
                        writePersonData(model);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ParsingException e) {
                        view.printOutput(e.getMessage());
                    }
                }
            }
        } while (wokring);
    }


    private int checkInputDataCount(int inputDataCount) {
        if (inputDataCount < DataChecker.dataCount) {
            return -1;
        } else if (inputDataCount > DataChecker.dataCount) {
            return 0;
        } else {
            return inputDataCount;
        }
    }


    private void writePersonData(DataChecker data) throws IOException {
        File filepath = new File(data.getLastName());
        try (FileWriter fileWriter = new FileWriter(filepath, true)) {
            fileWriter.append(data.toString() + "\n");
        } catch (IOException e) {
            throw e;
        }
    }
}
