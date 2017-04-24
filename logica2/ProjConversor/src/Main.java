
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Conversor objConversor = new Conversor();
        System.out.print("Digite a quantidade de anos: ");
        objConversor.setAno(leia.nextInt());
        
        Tela.limparTela();
        
        System.out.println("A quantidade de anos: "+objConversor.getAno());
        System.out.println("Em meses: "+objConversor.converterMeses());
        System.out.println("Em semanas: "+objConversor.converterSemanas());
        System.out.println("Em dias: "+objConversor.converterDias());
        System.out.println(objConversor.converterTudo());
        
    }
}
