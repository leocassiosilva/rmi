package atividade.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Leocassio
 */
public class Hello extends UnicastRemoteObject implements IHello {

    ArrayList<Produto> produtos = new ArrayList();

    public Hello() throws RemoteException {
        super();
    }

    @Override
    public String Adicionar(Produto produto) throws RemoteException {
        produtos.add(produto);
        return "inserido!";
    }

    @Override
    public String Remover(int posicao) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> Mostrar() throws RemoteException {
        return produtos;
    }

    @Override
    public String Pesquisar(String nome) throws RemoteException {
        boolean encontrar = false;
        
        
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().contains(nome)) { 
                return produtos.toString();
            }
        }
        return "Não encontrado!";
    }

}
