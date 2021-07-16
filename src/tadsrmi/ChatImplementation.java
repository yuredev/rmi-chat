package tadsrmi;

import tadsrmi.ChatInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatImplementation extends UnicastRemoteObject implements ChatInterface {

    String lastMessage;

    public ChatImplementation() throws RemoteException {
        lastMessage = null;
    }

    @Override
    public String getMessage() throws RemoteException {
        return lastMessage;
    }

    public void broadcast(String message) {
        lastMessage = message;
    }

}
