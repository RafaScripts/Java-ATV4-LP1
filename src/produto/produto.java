package produto;

public class produto {
    protected String descricao;
    protected double peco;
    protected int qtdestoque;
 
    public produto(String descricao, double peco, int qtdestoque)
    {
        this.descricao = descricao;
        this.peco = peco;
        this.qtdestoque = qtdestoque;
    }
 
    public void produto(String descricao, double peco, int qtdestoque)
    {
        System.out.printf(descricao, peco, qtdestoque);
        
    }
    
}