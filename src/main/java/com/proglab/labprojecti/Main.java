package com.proglab.labprojecti;

/**Classe Main para executar o programa e manipular as funcionalidades descritas em outras classes.
* @author Richard Miranda
* @version 1.00
* @since Release 01 da aplicação
*/

import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Instanciando a Classe PessoaDAO para cadastrar pessoas
        PessoaDAO insert = new PessoaDAO();
        
        Pessoa jose = new Pessoa();
        jose.setNome("Jose Luiz");
        jose.setIdade(25);
        
        Pessoa camila = new Pessoa();
        camila.setNome("Camila Ferreira");
        camila.setIdade(19);
        
        Pessoa marcos = new Pessoa();
        marcos.setNome("Marcos Scheffer");
        marcos.setIdade(36);
        
        insert.addPessoa(jose);
        insert.addPessoa(camila);
        insert.addPessoa(marcos);
        
        ArrayList<Pessoa> listInsert = insert.getPessoa("");
        for (Pessoa re : listInsert){
            System.out.printf("%s - %s\n", re.getNome(), re.getIdade());
        }
        
        //Limpa e insere todas as pessoas
        listInsert.clear();
        listInsert.addAll(insert.getPessoas());
        
        //Traz os nomes inseridos no array
        listInsert = insert.getPessoas();
        
        //Insere em um array todos os cadastros
        ArrayList<Pessoa> everyone = insert.getPessoas();
        
        //Array pra listar as pessoas com menos de 30 anos
        ArrayList<Pessoa> under30 = new ArrayList<>();
        for (Pessoa pessoa : insert.getPessoas()){
            if (pessoa.getIdade() < 30){
                under30.add(pessoa);
            }
        }
        
        if (under30.isEmpty()){
            System.out.println("Não há pessoas com menos de 30 anos");
        }
        else{
            System.out.println("\nPessoas com menos de 30 anos:");
            for (Pessoa pessoa : under30) {
                System.out.println(pessoa);
            }
        }
    }
   
    
}
