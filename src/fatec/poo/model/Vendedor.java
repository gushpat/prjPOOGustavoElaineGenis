
package fatec.poo.model;
import java.util.ArrayList;
/**
 *
 * @author gusta
 */
public class Vendedor extends Pessoa{
    
    //Atributos da classe
    private double salarioBase;
    private double taxaComissao;
    
    //Assoc Bin
    private ArrayList<Pedido> pedidos; //0..*

    //metodo construtor tem como parametros de entrada salario base e cpf + nome da classe pessoa
    public Vendedor(double salarioBase, String cpf, String nome) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        
        //inicializa array list pedidos
        pedidos = new ArrayList<Pedido>();
    }
    
    //set taxa de comissao e salario base

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public double getTaxaComissao() {
        return taxaComissao;
    }

    //get taxa de comissao e salario base
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

  
    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    //adiciona itens no array pedidos
    public void addPedidos(Pedido p){
       pedidos.add(p);
      
    }
    
    
    
}
