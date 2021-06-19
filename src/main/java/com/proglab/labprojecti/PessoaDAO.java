package com.proglab.labprojecti;

/**Classe para objetos do tipo Pessoa, onde serão contidos, valores e métodos para o mesmo.
* @author Richard Miranda
* @version 1.00
* @since Release 01 da aplicação
*/

import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class PessoaDAO {
    
    //Cria o ArrayList para receber as pessoas cadastradas
    private ArrayList<Pessoa> pessoas = new ArrayList();
    
    //Método simples de adicionar pessoas
    public void addPessoa(Pessoa p){
        pessoas.add(p);
    }
    
     /**Método para retorno da pessoa cadastrada no ArrayList
 * @author Richard Miranda
 * @param nome String - Nome da pessoa.
 * @return ArrayLiist Output - Nome e idade da pessoa
 */
    public ArrayList getPessoa (String nome){
        ArrayList output = new ArrayList();
        for (Pessoa pessoa : pessoas){
            if(pessoa.getNome().toUpperCase().contains(nome.toUpperCase())){
                output.add(pessoa);
            }
        }
        return output;
    }
    
    
    public ArrayList<Pessoa> getPessoas(){
        return pessoas;
    }
    
}
