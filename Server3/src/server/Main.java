/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author kmahm
 */
public class Main {public static void main(String args[]) throws Exception
    {
       Server s = new Server();
       java.rmi.registry.Registry r = java.rmi.registry.LocateRegistry.createRegistry(8000);
       r.bind("reg", s);
    }
    
    
    
}
