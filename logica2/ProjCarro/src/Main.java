
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carro objCarro = new Carro();

        System.out.println("Informe os dados do carro");
        System.out.print("Fabricante: ");
        objCarro.setFabricante(leia.next());
        System.out.print("Marca: ");
        objCarro.setMarca(leia.next());
        System.out.print("Modelo: ");
        objCarro.setModelo(leia.next());
        System.out.print("Tipo: ");
        objCarro.setTipo(leia.next());
        System.out.print("Ano de fabricação: ");
        objCarro.setAnoFabricacao(leia.nextInt());
        System.out.print("Potência CV: ");
        objCarro.setPotenciaCv(leia.nextInt());
        System.out.print("Valor a vista: ");
        objCarro.setValorAVista(leia.nextDouble());
        System.out.print("Taxa: ");
        objCarro.setTaxa(leia.nextDouble());
        System.out.print("Consumo Km/l: ");
        objCarro.setConsumoMedioKmLitro(leia.nextDouble());
        System.out.print("Nível do tanque: ");
        objCarro.setQtdDeCombustivel(leia.nextDouble());
        Tela.limparTela();
        byte op;
        do {

            System.out.print("::::::::COMPUTADOR DE BORDO:::::::\n"
                    + "Escolha uma opção abaixo:\n"
                    + "1 - Calcular distância a percorrer\n"
                    + "2 - Calcular consumo\n"
                    + "3 - Abastecer\n"
                    + "4 - Mostrar dados do carro\n"
                    + "0 - Sair\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();
            Tela.limparTela();
            switch (op) {
                case 1:
                    System.out.println("A distância a percorrer é: " + objCarro.calcularDistanciaAPercorrer());
                    break;
                case 2:
                    System.out.print("Digite a distância que deseja percorrer: ");
                    System.out.println("O consumo estimado é: " + objCarro.calcularConsumo(leia.nextDouble()));
                    break;
                case 3:
                    System.out.print("Digite o valor do combustível (litro): ");
                    double valorLitro = leia.nextDouble();
                    System.out.print("Digite o valor a ser abastecido: ");
                    double valorAbastecido = leia.nextDouble();
                    objCarro.abastecer(valorLitro, valorAbastecido);
                    break;
                case 4:
                    System.out.println(objCarro.mostrarTodosOsDados());
                    break;
                case 0:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida\nDigite novamente");

            }

        } while (op != 0);

    }
}
