import java.rmi.*;
import java.util.ArrayList;

public interface IMaxMin extends Remote
{
     public int[] SapXep(int a[]) throws RemoteException;
}