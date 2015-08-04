
package br.senac.rn.controller;

import br.senac.rn.model.Cliente;

public interface OperacoesDAO {
    
    public abstract void cadastrar(Cliente cli);
    public void excluir(int id);
    public Cliente buscarById(int id);
    public void buscar();
    
}
