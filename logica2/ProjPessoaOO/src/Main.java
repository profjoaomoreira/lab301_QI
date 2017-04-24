
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa objPessoa1 = new Pessoa();
        Pessoa objPessoa2 = new Pessoa();
        
        System.out.println("Informe os dados da pessoa 1");
        System.out.print("Nome: ");
        objPessoa1.nome = leia.next();
        System.out.print("Idade: ");
        objPessoa1.idade = leia.nextByte();
        System.out.print("Sexo: ");
        objPessoa1.sexo = leia.next();
        System.out.print("Altura: ");
        objPessoa1.altura = leia.nextDouble();
        System.out.print("Peso: ");
        objPessoa1.peso = leia.nextDouble();
        System.out.print("Cpf: ");
        objPessoa1.cpf = leia.nextLong();
        
        System.out.println("Informe os dados da pessoa 2");
        System.out.print("Nome: ");
        objPessoa2.nome = leia.next();
        System.out.print("Idade: ");
        objPessoa2.idade = leia.nextByte();
        System.out.print("Sexo: ");
        objPessoa2.sexo = leia.next();
        System.out.print("Altura: ");
        objPessoa2.altura = leia.nextDouble();
        System.out.print("Peso: ");
        objPessoa2.peso = leia.nextDouble();
        System.out.print("Cpf: ");
        objPessoa2.cpf = leia.nextLong();
        
        System.out.println("\n\nDados da pessoa 1");
        System.out.println("Nome: "+objPessoa1.nome);
        System.out.println("Idade: "+objPessoa1.idade);
        System.out.println("Sexo: "+objPessoa1.sexo);
        System.out.println("Altura: "+objPessoa1.altura);
        System.out.println("Peso: "+objPessoa1.peso);
        System.out.println("Cpf: "+objPessoa1.cpf);
        
        System.out.println("\n\nDados da pessoa 2");
        System.out.println("Nome: "+objPessoa2.nome);
        System.out.println("Idade: "+objPessoa2.idade);
        System.out.println("Sexo: "+objPessoa2.sexo);
        System.out.println("Altura: "+objPessoa2.altura);
        System.out.println("Peso: "+objPessoa2.peso);
        System.out.println("Cpf: "+objPessoa2.cpf);
        
        
        objPessoa2.falar();
        
        
        
        
        
    }
}
