package tadsrmi.client;

import tadsrmi.ChatInterface;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
//            Registry registry = LocateRegistry.getRegistry();
            ChatInterface remoteObject = (ChatInterface) Naming.lookup("rmi://localhost:3333/RemoteObj");
//            ChatInterface remoteObject = (ChatInterface) registry.lookup("rmi://192.168.100.6:7777");

            String message = "Olá mundo";
            System.out.println("Nova frase " + remoteObject.update(message));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
