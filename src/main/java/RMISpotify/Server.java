package RMISpotify;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Contract{

    private static final long serialVersionUID = 1L;

    protected Server() throws RemoteException {

        super();

    }

    public String getSong() throws RemoteException {
        return "ofasz";
    }

    public static void main(String[] args){

        try {

            Naming.rebind("//localhost/MyServer", new Server());
            System.err.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }

    }
}
