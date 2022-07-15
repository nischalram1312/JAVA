import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Lab3a {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.102",2020);
        System.out.println("client connected");
    }
}
