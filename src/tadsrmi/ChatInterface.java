package tadsrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatInterface extends Remote {
    String update(String s) throws RemoteException;
}
