//Linha em branco
public class Produto {//Declara uma classe com o nome produto com visibilidade pública, ou seja, pode ser acessada por qualquer outra classe do mesmo projeto
    private String nome;
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    public double getvalorUnitario(){
        return this.valorUnitario;
    }
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public double calcularValorTotal(){
        return this.valorUnitario*this.quantidade;
    }
    public double calcularValorTotalComDesconto(double desconto){
        return this.calcularValorTotal()*(1-desconto/100.0);
    }
    
    
    
    
}
