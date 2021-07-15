package tadsrmi.server;

import tadsrmi.ChatInterface;

import java.rmi.RemoteException;

public class ChatImplementation implements ChatInterface {
    public ChatImplementation() throws RemoteException { }

    @Override
    public String update(String s) throws RemoteException {
        System.out.println("Executou");
        return s.replaceAll("o", "e");
    }
}
