package udesc.cct.poo.passagem.modelos;

import java.util.Scanner;

public class Passageiro{
    private String nome;
    private String cpf;

    public Passageiro(Scanner scanner){
        scanner.nextLine();
        setNome(scanner);
        setCpf(scanner);
    }

    public void setNome(Scanner scanner) {
        System.out.println("Digite seu nome:");
        this.nome = scanner.nextLine();
    }

    public void setCpf(Scanner scanner) {
        System.out.println("Digite seu CPF:");
        this.cpf = scanner.nextLine();
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }
}
