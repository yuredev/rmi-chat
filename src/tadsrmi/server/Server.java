package tadsrmi.server;

import tadsrmi.ChatImplementation;
import tadsrmi.ChatInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(6000);
            ChatInterface remoteObj = new ChatImplementation();
            registry.bind("RemoteObj", remoteObj);
            System.out.println("\uD83D\uDE80 Server listening...");
//            UnicastRemoteObject.exportObject(remoteObj, 6000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
