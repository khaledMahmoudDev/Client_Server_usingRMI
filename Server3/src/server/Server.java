/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;

/**
 *
 * @author kmahm
 */
public class Server  extends java.rmi.server.UnicastRemoteObject implements Interface{

    public Server()throws Exception
    {
        
    }
    @Override
    public int sum2(int a, int b) throws RemoteException {
        return a+b;
    }
    
}
