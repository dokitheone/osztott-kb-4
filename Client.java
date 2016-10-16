import java.rmi.registry.*;
import java.rmi.*;

public class Client {
    
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry(12345);
        System.out.println(args[0]);
        String[] names = reg.list();
        for (int i = 0; i < args[0].length(); i++) {
            for (int j = 0; j < names.length; j++) {
                KodInterface ki = (KodInterface) reg.lookup(names[j]);
                if (args[0].charAt(i) == names[j].charAt(0)) {
                    System.out.println(args[0].charAt(i) + " " + ki.getCode(args[0].charAt(i)));
                }
            }
        }
    }
}
