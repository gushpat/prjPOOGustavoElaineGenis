
package fatec.poo.model;

/**
 *
 * @author gusta
 */
public class Produto {
    
    //Atributos da classe
    private String codigo;
    private String descricao;
    private double qtdeEstoque;
    private String unidadeMedida;
    private double preco;
    private double estoqueMinimo; 
    
    //objeto da classe itempedido
    private ItemPedido itemPedido; //multiplicidade 1*
    
    
    //metodo construtor tem como parametros de entrada codigo e descricao;

    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    //set Descricao, quantidade de estoque, unidade medida, preco, estoque minimo

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtdeEstoque(double qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
    
    
    //get Descricao, quantidade de estoque, unidade medida, preco, estoque minimo

    public String getDescricao() {
        return descricao;
    }

    public double getQtdeEstoque() {
        return qtdeEstoque;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public double getPreco() {
        return preco;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }
    
    //get and set item pedido

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }
    
    
    //subtrai estoque
    public void subtraiEstoque(double d){
       this.qtdeEstoque -= d;
    }

    //get codigo, retorna o codigo.
    //Necessário para a lógica presente no botão consultar
    //do GuiProduto funcionar
    public String getCodigo() {
        return codigo;
    }
    
    
    
}
