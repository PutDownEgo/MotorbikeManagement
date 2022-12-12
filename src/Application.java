
import org.opencv.core.Core;
import view.Login;

public class Application {

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Login login = new Login();
    }
}
