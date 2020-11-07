package atividade.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Leocassio
 */
public interface IHello extends Remote{
    public String Adicionar(Produto produto)throws RemoteException;
    public String Remover(int posicao) throws RemoteException;
    public ArrayList<Produto> Mostrar()throws RemoteException;
}
