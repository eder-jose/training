import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Properties;

public interface MyRmiInterface extends Remote {
    public Properties getProperties() throws RemoteException;
}
