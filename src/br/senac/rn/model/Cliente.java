package br.senac.rn.model;

public class Cliente extends Usuario {
    
  private Conta conta;
 

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

   
    @Override
    public String toString() {
        return "Cliente{" + "conta=" + conta + '}';
    }
}
