package tadsrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ChatInterface extends Remote {
    String getMessage() throws RemoteException;;
    void broadcast(String message) throws RemoteException;
}
