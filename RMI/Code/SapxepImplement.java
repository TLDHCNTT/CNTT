import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;

public class SapxepImplement extends UnicastRemoteObject
        implements Isapxep {

    public SapxepImplement() throws RemoteException {
        //There is no action need in this moment.
    }
    

    public int[] SapXep(int a[]) throws RemoteException {
        
        Arrays.sort(a);
        return a;
    }
}