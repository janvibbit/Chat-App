import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        System.out.println("Connected to server!");

        // Input & Output streams
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        Scanner scanner = new Scanner(System.in);

        // Thread to receive messages
        Thread receive = new Thread(() -> {
            String msg;
            try {
                while ((msg = in.readLine()) != null) {
                    System.out.println("Server: " + msg);
                }
            } catch (IOException e) {
                System.out.println("Server disconnected.");
                System.exit(0);
            }
        });

        // Thread to send messages
        Thread send = new Thread(() -> {
            while (true) {
                String  msg = scanner.nextLine();
                out.println(msg);
                System.out.println("Sent: " + msg);  // Debugging statement
            }
        });
        receive.start();    
        send.start();
    }
}
