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
public interface Interface extends java.rmi.Remote {
 
    public int sum2(int a, int b) throws java.rmi.RemoteException;

}