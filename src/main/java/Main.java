
import java.io.IOException;

public class Main {

    public static final int PORT = 9999;

    public static void main(String[] args)throws IOException {
        var server = new Server();
        server.start(PORT);
    }
}