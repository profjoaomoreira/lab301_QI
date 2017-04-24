
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
        System.out.print("Consume médio Km/l: ");
        objCarro.setConsumoMedioKmLitro(leia.nextDouble());
        System.out.print("Quantidade de combustível: ");
        objCarro.setQtdDeCombustivel(leia.nextDouble());

        byte op;
        do {
            System.out.print(
                    ":::::Computador de Bordo:::::\n"
                    + "Escolha uma opção abaixo:\n"
                    + "1 - Calcular distancia a percorrer\n"
                    + "2 - Calcular consumo\n"
                    + "3 - Abastecer\n"
                    + "4 - Mostrar todos os dados do carro\n"
                    + "0 - Sair\n"
                    + "Digite aqui a opção desejada: ");
            op = leia.nextByte();

            switch (op) {
                case 1:
                    System.out.println("A distancia a percorrer é: " + objCarro.calcularDistanciaAPercorrer());
                    break;
                case 2:
                    System.out.print("Digite a distancia que pretende percorrer: ");

                    System.out.println("O consumo é: " + objCarro.calcularConsumo(leia.nextDouble()));
                    break;
                case 3:
                    System.out.print("Digite o valor do combustível (Litro): ");
                    double valorLitro = leia.nextDouble();

                    System.out.println("Digite o valor a abastecer: ");
                    double valorTotalAbastecido = leia.nextDouble();

                    objCarro.abastecer(valorLitro, valorTotalAbastecido);
                    break;
                case 4:
                    System.out.println("Dados do carro\nFabricante: "+objCarro.getFabricante());
                default:

            }

        } while (op != 0);

    }

}
