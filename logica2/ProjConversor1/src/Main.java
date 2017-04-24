
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Conversor objConversor = new Conversor();
        
        System.out.print("Digite a quantidade de anos: ");
        objConversor.setAno(leia.nextInt());
        
        System.out.println("Quantidade de anos é: "+objConversor.getAno());
        System.out.println("Em meses: "+objConversor.corverterMeses());
        System.out.println("Em semanas: "+objConversor.convereterSemanas());
        System.out.println("Em dias: "+objConversor.convereterDias());
        System.out.println(objConversor.mostrarTodos());
        
    }
}
