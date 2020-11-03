package atividade.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Leocassio
 */
public interface IHello extends Remote{
    public String Adicionar(String nome, long preco)throws RemoteException;
    public String Remover(int posicao) throws RemoteException;
}
