
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
    
    //Metodo construtor

    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
    }
    
    
    
    //set quantidade vendida

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    //get sequencia, quantidade Vendida
    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public Produto getProduto() {
        return produto;
    }
    
    
    
    
    
    
    
}
