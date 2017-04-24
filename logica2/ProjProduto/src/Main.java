
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Produto objProduto = new Produto();

        System.out.println("Informe os dados do produto");
        System.out.print("Nome: ");
        objProduto.cadastrarNome(leia.next());
        System.out.print("Descrição: ");
        objProduto.cadastrarDescricao(leia.next());
        System.out.print("Valor unitário: ");
        objProduto.cadastrarValorUnitario(leia.nextDouble());
        System.out.print("Quantidade: ");
        objProduto.cadastrarQuantidade(leia.nextInt());
        
        
        
        System.out.println("Dados do produto");
        System.out.println("Nome: " + objProduto.buscarNome());
        System.out.println("Descrição: " + objProduto.buscarDescricao());
        System.out.println("Valor unitário: " + objProduto.buscarValorUnitario());
        System.out.println("Quantidade: " + objProduto.buscarQuantidade());
        System.out.println("Valor total: " + objProduto.calcularValorTotal());

    }

}
