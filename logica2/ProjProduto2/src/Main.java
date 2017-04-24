
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Produto objProduto = new Produto();
        
        System.out.println("Informe os dados do produto");
        System.out.print("Nome: ");
        objProduto.setNome(leia.next());
        System.out.print("Descrição: ");
        objProduto.setDescricao(leia.next());
        System.out.print("Valor unitário: ");
        objProduto.setValorUnitario(leia.nextDouble());
        System.out.print("Quantidade: ");
        objProduto.setQuantidade(leia.nextInt());
        
        System.out.println("Digite o valor do desconto %: ");
        double desconto = leia.nextDouble();
        
        System.out.println("Dados do produto");
        System.out.println("Nome: "+objProduto.getNome());
        System.out.println("Descrição: "+objProduto.getDescricao());
        System.out.println("Valor unitário: "+objProduto.getValorUnitario());
        System.out.println("Quantidade: "+objProduto.getQuantidade());
        System.out.println("Valor total: "+objProduto.calcularValorTotal());
        System.out.println("Valor total com desconto: "+objProduto.calcularValorTotalComDesconto(desconto));
        
    }
}
