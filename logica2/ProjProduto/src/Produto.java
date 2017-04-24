
public class Produto {

    private String nome;
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    
    
    public void cadastrarNome(String nome){
        this.nome = nome;
    }
    public void cadastrarDescricao(String descricao){
        this.descricao = descricao;
    }
    public void cadastrarValorUnitario(double valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    public void cadastrarQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public String buscarNome(){
        return this.nome;
    }
    public String buscarDescricao(){
        return this.descricao;
    }
    public double buscarValorUnitario(){
        return this.valorUnitario;
    }
    public int buscarQuantidade(){
        return this.quantidade;
    }
          
    
    public double calcularValorTotal() {
        return valorUnitario * quantidade;
        
        
    }
}
