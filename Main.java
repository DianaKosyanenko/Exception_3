public class Main {
    public static void main(String[] args) {
        Presenter<View> presenter = new Presenter<View>(new Console());
        presenter.start();
    }
}
