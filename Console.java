import java.util.Scanner;

public class Console implements View{


    private Scanner in = new Scanner(System.in);
    @Override
    public void printOutput(String message) {
        System.out.printf("%s", message);
    }

    @Override
    public String getInput(String message) {
        System.out.printf("%s", message);
        return in.nextLine();
    }
}
