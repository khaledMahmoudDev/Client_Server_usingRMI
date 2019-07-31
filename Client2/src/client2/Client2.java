/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client2;

import java.rmi.RemoteException;


/**
 *
 * @author kmahm
 */
import server.Interface;
public class Client2 {

    private static Interface s ;
    private static java.rmi.registry.Registry r;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        r = java.rmi.registry.LocateRegistry.
                getRegistry("localhost",8000);
        
        s = (Interface)r.lookup("reg");
        
        int sum = s.sum2(5,4);
        System.out.println(sum);
        
        
    }
    
}
