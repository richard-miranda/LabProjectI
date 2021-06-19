package com.proglab.labprojecti;

/**Classe para objetos do tipo Pessoa, onde serão contidos, valores e métodos para o mesmo.
* @author Richard Matheus Miranda
* @version 1.00
* @since Release 01 da aplicação
*/
public class Pessoa {
    
    /**Define que pessoa será composta de duas variáveis, nome e idade **/
    private String nome;
    private int idade;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
      @Override
    public String toString() {
        return nome+ " - " + idade; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
