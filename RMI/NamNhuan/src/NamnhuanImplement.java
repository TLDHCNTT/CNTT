
import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;

public class NamnhuanImplement extends UnicastRemoteObject
        implements Inamnhuan {

    public NamnhuanImplement() throws RemoteException {
        //There is no action need in this moment.
    }
    

    public int[] NamNhuan(int a[]) throws RemoteException {
        
        Arrays.sort(a);
        return a;
    }
}
