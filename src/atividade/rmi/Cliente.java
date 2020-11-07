package atividade.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leocassio
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            ArrayList<Produto> produtos = new ArrayList();
            Registry registry = LocateRegistry.getRegistry("localhost", 9999);
            IHello obj = (IHello) registry.lookup("HelloService");
            Produto prod = new Produto("Leocassio", 1000);
            System.out.println(obj.Adicionar(prod));
            produtos = obj.Mostrar();
            for (Produto p : produtos) {
                System.out.println(p.getNome());
            }
            System.out.println(obj.Pesquisar("Leocassio"));
            System.out.println(obj.Remover("Leocassio"));
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
