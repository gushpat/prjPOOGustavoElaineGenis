
package fatec.poo.model;

/**
 *
 * @author gusta
 */
public class ItemPedido{
    
    //Atributos da classe
    private int sequencia;
    private double qtdeVendida;
    
    //assoc Bin
    private Produto produto;
    
    private Pedido pedido;
    
    //Metodo construtor

    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
    }
    
    
    
    //set quantidade vendida

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
        
        //A quantidade vendida do item deve ser subtraída da quantidade disponível em 
        //estoque do objeto Produto que está ligado ao objeto ItemPedido
        produto.subtraiEstoque(qtdeVendida);
        
    }

    //get sequencia, quantidade Vendida
    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }
    
   //get produto
    public Produto getProduto() {
        return produto;
    }
    
   //get pedido
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
    
    
    
    
    
    
    
}
