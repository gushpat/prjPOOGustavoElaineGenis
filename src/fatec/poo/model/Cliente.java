
package fatec.poo.model;
import java.util.ArrayList;
/**
 *
 * @author gusta
 */

//classe cliente herda atributos e metodos da classe pessoa
public class Cliente extends Pessoa{
    
    //Atributos da classe
    private double limiteCred;
    private double limiteDisp;
    
    //Assoc Bin
    private ArrayList<Pedido> pedidos;

    //metodo construtor tem como parametros de entrada limite de credito e cpf + nome da classe pessoa
    public Cliente(double limiteCred, String cpf, String nome) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        
        //Inicializa o limite de disponível com o valor do limite de crédito.
        this.limiteDisp = limiteCred; 
        
        //inicializa array list pedidos
        pedidos = new ArrayList<Pedido>();
    }
    
    //set limite de credito

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }
    
    //get limite de credito, limite disponivel

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    //adiciona itens no array pedidos
    public void addPedidos(Pedido p){
       pedidos.add(p);
      
    }
    
    
    
    

   
    
    
    
    
}
