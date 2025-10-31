# 💬 Java Chat Application (Client-Server)

## 📖 Overview
This is a simple **console-based chat application** built using **Java Socket Programming**.  
It enables real-time communication between a **Server** and a **Client** using input and output streams over TCP.

The application demonstrates key networking concepts such as:
- Socket communication
- Multithreading for simultaneous message sending and receiving
- Input/Output stream handling in Java

---

## 🧠 Features
✅ Real-time two-way communication  
✅ Multi-threaded message handling  
✅ Simple console interface  
✅ Lightweight and easy to run locally  

---

## 🛠️ Tools & Technologies
- **Language:** Java  
- **Concepts Used:** Socket Programming, Multithreading, I/O Streams  
- **IDE:** Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, etc.) or Command Line  

---

## 🧩 Project Structure
ChatApp/
│
├── Server.java # Server-side code
├── Client.java # Client-side code
└── README.md # Project documentation

---

## ⚙️ How to Run

### 🖥️ Step 1: Compile the files
Open terminal (or command prompt) inside the project directory and run:
```bash
javac Server.java
javac Client.java

Step 2: Start the Server
Run the server file first:
java Server

You’ll see:
Server started. Waiting for client...

Step 3: Start the Client
In a new terminal window, run:
java Client

You’ll see:
Connected to server!

Now you can chat between Server and Client in real time!
🔄 Working Principle

Server starts first and waits for a client connection on port 1234.
Client connects to the server using the same port.
Both sides create separate threads:
One thread to send messages.
One thread to receive messages.
Communication continues until either side disconnects.

🧵 Code Explanation
Server.java
Creates a ServerSocket on port 1234.
Waits for the client to connect.
Uses two threads:
One for sending messages from the server console.
One for receiving messages from the client.

Client.java
Connects to the server at localhost on port 1234.
Uses two threads:
One for sending messages to the server.
One for receiving messages from the server.

🧪 Sample Output

Server Terminal

Server started. Waiting for client...
Client connected!
Client: Hello Server!
Hello Client!

Client Terminal

Connected to server!
Server: Hello Client!
Sent: Hello Server!

🚀 Future Enhancements

Add support for multiple clients (group chat).
Add a GUI interface using Java Swing or JavaFX.
Implement user authentication (username & password).
Save chat logs to a file.

📚 Author

Project by: Janvi Patel
Language: Java
Topic: Socket Programming & Multithreading
