package br.senac.rn.view;

import br.senac.rn.controller.ClienteDAO;
import br.senac.rn.model.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        ClienteDAO cDAO = new ClienteDAO();
        Scanner sc = new Scanner(System.in); 
        int opcao = 1;
        
        do{  
        System.out.print("Informe a opção: "); 
        opcao = sc.nextInt();
            
        switch (opcao){
            case 1:
                Cliente c = new Cliente();
                
                System.out.println("Informe a Id: ");
                c.setId((sc.nextInt()));
                 
                System.out.println("Informe o nome: ");
                c.setNome((sc.next()));
                 
               cDAO.cadastrar(c);
               
                break;
            case 2:
                //cDAO.listarTodos();
                break;
            case 3:
                
                System.out.println("Digite a id: ");
                int id = sc.nextInt();
                
                System.out.println("Digite o novo nome ");
                String novoNome = sc.next();
               
                cDAO.atualizar(id, novoNome);
                break;
            case 4:
                
                System.out.println("Digite a id do cliente a excluir: ");
                id = sc.nextInt();
                
                //cDAO.delete(id);
                break;
                
            case 5:
                System.out.println("Digite o id do Cliente: ");
                id = sc.nextInt();
                //cDAO.findById(id);
                System.out.println(id);
                //System.out.println("O cliente é " +);
                break;
        }
        }while(opcao !=0);

//}       do{
//            Cliente cliente = new Cliente();
//            Scanner sc = new Scanner(System.in); 
//        
//            System.out.println("Digite o Cliente: ");
//            cliente.setNome(sc.nextLine());     
//                    
//            System.out.println("Digite o CPF: ");
//            cliente.setCpf(sc.nextLine());
//            
//            System.out.println("Deseja ZERO para sair? ");
//            opcao = sc.nextInt();
//            
//            clientes.add(cliente);
//            i++;
//            
//        }while(opcao != 0 );
//        
//        for (Cliente c : clientes){
//            System.out.println("Clientes: " + c.getNome() + " possui CPF: " + c.getCpf());

        }             
    }

