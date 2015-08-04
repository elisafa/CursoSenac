
package br.senac.rn.controller;

import br.senac.rn.model.Cliente;
import java.util.ArrayList;

public class GerenteDAO implements OperacoesDAO{

    ArrayList<Cliente> clientes = new ArrayList<>();   
    
    public void cadastrar(Cliente cliente) {
        clientes.add(cliente);
         }
    

    public void excluir(int id){
        for(Cliente cliente : clientes){
            if(cliente.getId() == id){
                clientes.remove(id);
            }
        }
    }

    public void atualizar(int id, String novoNome){
         
        for (Cliente cliente : clientes){
            if (cliente.getId() == id){
                
            System.out.println("Cliente: " + cliente.getNome());
                            
                if (!novoNome.equals("")){
                    cliente.setNome(novoNome);
                }
                break;
            }
        } 
    }

    public Cliente buscarById(int id) {
        boolean encontrado;
        for(Cliente cliente : clientes){
            if(cliente.getId() == id){
                encontrado = true;
                return cliente;
            }
        }
        System.out.println("O cliente não encontrado");
        return null;
    }
    
    public void buscar() {
        for (Cliente a : clientes){
                System.out.println("Nome : " + a.getNome());
    }
    }
}
  
    


