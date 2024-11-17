# Console-Based Messaging Application

## Project Overview
This is a console-based messaging application built using Java, utilizing Socket Programming and Multithreading. The application allows users to authenticate, start conversations, send/receive messages, and manage message history in a simple text-based interface.

## Features
- **User Authentication**: Clients are authenticated with a unique Client ID.
- **Start a Conversation**: Users can start a new conversation with any contact in their contact list.
- **View Message History**: View all the messages exchanged during the current session.
- **Clear All Messages**: Option to clear all messages stored in memory.
- **Mark Messages as Read**: Mark all unread messages as read.
- **Delete Messages by Contact**: Option to delete all messages for a specific contact.
- **Display Messages by Contact**: View all messages exchanged with a specific contact.
- **Multithreading**: Handles simultaneous sending and receiving of messages in separate threads for smooth user experience.

## Project Structure
The project consists of two main components:
1. **Server**: Handles client connections, message storage, and manages communication between clients.
2. **Client**: Allows users to authenticate, send messages, view message history, and interact with the server.

### Server
- Listens for incoming client connections.
- Handles authentication and manages communication between multiple clients.
- Stores and processes messages sent by clients.

### Client
- Connects to the server.
- Allows users to enter commands to start conversations, send messages, view message history, and more.
- Displays received messages in real-time.

## Instructions to Use

### Step 1: Running the Server
1. **Compile the Server Code**:
   ```bash
   javac Server.java
   Run the Server:
bash
Copy code
java Server
The server will start listening for incoming client connections.
Make sure the server is running before starting the client.
Step 2: Running the Client
Compile the Client Code:

bash
Copy code
javac Client.java
Run the Client:

bash
Copy code
java Client
When prompted, enter your unique Client ID to authenticate.
Once authenticated, you can interact with the server using the menu options provided.
Client Menu Options:
1. Start Conversation: Start a new chat with a contact from your contact list.
2. View Message History: View all messages exchanged.
3. Clear All Messages: Clear all stored messages.
4. Mark All Messages Read: Mark all unread messages as read.
5. Delete All Messages for Specific Contact: Delete all messages for a selected contact.
6. Display Messages for Specific Contact: View messages exchanged with a specific contact.
7. Exit: Exit the application.
Step 3: Communication Between Server and Client
After the client successfully authenticates, it can start a conversation by selecting a contact from the contact list.
Messages are exchanged between the server and client. The client can send messages using the console interface, and the server will broadcast messages to the appropriate clients.
The server stores the messages and handles the management of message history, allowing the client to view, delete, and mark messages.
Troubleshooting
If you encounter errors while running the server or client, make sure both the server and client are compiled and running on the same network.
Authentication failure: Ensure that you are entering a valid Client ID. If the problem persists, check the server logs for more information.

