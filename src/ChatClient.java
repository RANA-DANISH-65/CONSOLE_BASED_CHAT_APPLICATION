import java.io.*;
import java.net.*;
import java.util.*;

public class ChatClient {
    private String ipAddress = "localhost";
    private int port = 5555;

    public ChatClient() {
        try {
            System.out.println("\t\t\t============= Welcome To Console-Based Chat =============");
            System.out.println("\t\t\t-------------Looking For Server To Connect-------------");
            Socket socket = new Socket(ipAddress, port);
            System.out.println("\t\t====> Connected Successfully to Server At  "+ipAddress+ " at Port " + port+" <=====");
            new ClientHandlerThread(socket).start();
        } catch (IOException io) {
            System.out.println("\nError connecting to server: " + io.getMessage());
        } catch (Exception e) {
            System.out.println("\nError creating socket: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }



}
