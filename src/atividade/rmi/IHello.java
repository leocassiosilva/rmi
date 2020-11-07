package atividade.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Leocassio
 */
public interface IHello extends Remote {

    public String Adicionar(Produto produto) throws RemoteException;

    public String Remover(String nome) throws RemoteException;

    public ArrayList<Produto> Mostrar() throws RemoteException;

    public String Pesquisar(String nome) throws RemoteException;
    
    
}
