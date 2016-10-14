import java.rmi.registry.*;
import java.rmi.*;

public class Client {
    
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry(12345);
        /*String[] names = reg.list();
        for(String n : names) {
            KodInterface ki = (KodInterface) reg.lookup(n);
            System.out.println(n + " " + ki.getCode(n.charAt(0)));
        }*/ 

        System.out.println(args[0]);
        for(int i = 0; i < args[0].length(); i++) {
            KodInterface ki = (KodInterface) reg.lookup(""+args[0].charAt(i));
            System.out.println(args[0].charAt(i) + " " + ki.getCode(args[0].charAt(i)));
        }
    }
}
