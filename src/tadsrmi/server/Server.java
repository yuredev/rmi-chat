package tadsrmi.server;

import tadsrmi.ChatInterface;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(3333);
            ChatInterface remoteObj = new ChatImplementation();
            registry.bind("RemoteObj", remoteObj);
            System.out.println("\uD83D\uDE80 Server listening...");
            UnicastRemoteObject.exportObject(remoteObj, 3333);
//            registry.rebind("rmi://192.168.100.6", remoteObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
