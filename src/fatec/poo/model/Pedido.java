
package fatec.poo.model;
import java.util.ArrayList;
/**
 *
 * @author gusta
 */
public class Pedido {
    
    //Atributos da classe
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    
    //obj da classe Cliente e Vendedor
    //Como trata-se de só um objeto de cada tipo, não foi utilizado o array list
    private Cliente cliente; //1
    private Vendedor vendedor; //1
    
    //Array de objetos da classe ItemPedido
    private ArrayList<ItemPedido> itensPedidos; //multiplicidade 1..*

    //Método Construtor tem como parametros numero e data de emissao
    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        
        //inicializa array list pedidos
        itensPedidos = new ArrayList<ItemPedido>();
    }
    
    //Set data de pagamento, forma de pagamento, situacao

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    //Get numero, data de emissao, data de pagamento, forma de pagamento, situacao

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }

    //Get and Set Cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //Get and Set Vendedor
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    
    //add ItensPedidos

    public void addItens(ItemPedido ip){
       itensPedidos.add(ip);
       
       //A cada ligação com um objeto ItemPedido o valor do item deve ser subtraído do limite disponível do objeto Cliente.
       cliente.subtraiValorLimiteDisponivel(ip.getProduto().getPreco());

    }

    public ArrayList<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    
    
    
}
