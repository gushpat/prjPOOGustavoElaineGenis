
package fatec.poo.model;

/**
 *
 * @author gusta
 */
public class Pessoa {
    
    //Atributos da classe
    private String cpf;
    private String nome; 
    private String endereco;
    private String cidade; 
    private String uf; 
    private String cep; 
    private String ddd; 
    private String telefone;
    

 //metodo construtor, tem como parametros cpf e nome
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
//Set Endereço, Cidade, UF, CEP, DDD, Telefone

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
//get cpf, nome, Endereço, Cidade, UF, CEP, DDD, Telefone

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }
    
    
    
    
    
}
