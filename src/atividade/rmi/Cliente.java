package atividade.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;
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
            Scanner leitura = new Scanner(System.in);
            boolean laco = true;
            int op;
            while (laco) {
                System.out.println("-----------Loja Deu Certo-----------");
                System.out.println("1 - Inserir produto");
                System.out.println("2 - Listar produtos");
                System.out.println("3 - Remover produto");
                System.out.println("4 - Buscar produto");
                System.out.println("5 - Sair");

                System.out.println("Entre com sua opção: ");
                op = Integer.parseInt(leitura.nextLine());
                Produto prod;

                String nome;
                float preco;
                switch (op) {

                    case 1:
                        System.out.println("Entre com o nome do produto:");
                        nome = leitura.nextLine();

                        System.out.println("Entre com o valor do produto: ");
                        preco = Float.parseFloat(leitura.nextLine());
                        prod = new Produto(nome, preco);
                        System.out.println(obj.Adicionar(prod));
                        break;

                    case 2:
                        produtos = obj.Mostrar();
                        for (Produto p : produtos) {
                            System.out.println(p.getNome());
                        }
                        break;
                    case 3:
                        System.out.println("Entre com o nome do produto:");
                        nome = leitura.nextLine();
                        System.out.println(obj.Remover("Leocassio"));
                        break;
                    case 4:
                        System.out.println("Entre com o nome do produto:");
                        nome = leitura.nextLine();
                        System.out.println(obj.Pesquisar(nome));
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                    System.out.println("Essa opção não existe!");

                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
