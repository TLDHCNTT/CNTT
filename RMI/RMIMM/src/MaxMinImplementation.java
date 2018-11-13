

import java.util.ArrayList;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;
public class MaxMinImplementation extends UnicastRemoteObject implements IMaxMin{

    private float[] array;
    public  MaxMinImplementation() throws RemoteException{    
    }
    public int[] SapXep(int a[]) throws RemoteException {
        
        Arrays.sort(a);
        return a;
    }
    }

