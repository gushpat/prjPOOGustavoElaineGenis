
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
    
    //obj da classe ItemPedido
    private ArrayList<ItemPedido> itensPedidos; //

    //Método Construtor tem como parametros numero e data de emissao
    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
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

    //Get and Set 
    
    
    
}
