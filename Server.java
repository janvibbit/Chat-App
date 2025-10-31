import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Server started. Waiting for client...");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        // Input & Output streams
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        Scanner scanner = new Scanner(System.in);

        // Thread to receive messages
        Thread receive = new Thread(() -> {
            String msg;
            try {
                while ((msg = in.readLine()) != null) {
                    System.out.println("Client: " + msg);  
                }
            } catch (IOException e) {
                System.out.println("Client disconnected.");
                
            }
        });

        // Thread to send messages
        Thread send = new Thread(() -> {
            while (true) {
                String msg = scanner.nextLine();
                out.println(msg);
            }
        });
        receive.start();
        send.start();
    }
}
