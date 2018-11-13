import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SapxepImplement extends UnicastRemoteObject
        implements Isapxep {

    public SapxepImplement() throws RemoteException {
        //There is no action need in this moment.
    }
    

    public int[] SapXep(int a[]) throws RemoteException {
        
        int tam;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<(a.length);j++)
            if(a[i]<a[j]) {
                tam=a[i];
                a[i]=a[j];
                a[j]=tam;
            }
        }
        
        return a;
    }
}