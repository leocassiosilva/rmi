package atividade.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Leocassio
 */
public class Hello extends UnicastRemoteObject implements IHello{
    
    ArrayList<String> loja = new ArrayList();

    
    public Hello() throws RemoteException{
        super();
    }

    @Override
    public String Adicionar(String nome, long preco) throws RemoteException {
        loja.add(nome + ";" + preco);
        return "inserido!";
    }

    @Override
    public String Remover(int posicao) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
