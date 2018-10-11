package udesc.cct.poo.passagem.controle;
import java.util.Scanner;


import udesc.cct.poo.passagem.servicos.ServicoDeLocais;
import udesc.cct.poo.passagem.servicos.ServicoDePassagens;
import udesc.cct.poo.passagem.servicos.ServicoDeViagens;

public class ControleGeral{
    public final static int MARCAR_PASSAGEM = 1;
    public final static int VER_PASSAGENS = 2;
    public final static int SAIR = 0;

    private Scanner scanner;

    private ServicoDeLocais servicoDeLocais;
    private ServicoDeViagens servicoDeViagens;
    private ServicoDePassagens servicoDePassagens;

    private ControleMarcarPassagem marcarPassagem;
    private ControleListarPassagens listarPassagens;

    public ControleGeral(){
        this.scanner = new Scanner(System.in);
        this.servicoDeLocais = new ServicoDeLocais();
        this.servicoDeViagens = new ServicoDeViagens();
        this.servicoDePassagens = new ServicoDePassagens();

        this.marcarPassagem = new ControleMarcarPassagem(
        		this.scanner, 
        		this.servicoDeLocais, 
        		this.servicoDeViagens, 
        		this.servicoDePassagens
        );

        this.listarPassagens = new ControleListarPassagens(
                this.servicoDePassagens
        );
    }
    
    public void encerrar(){
        System.out.println("programa finalizado");
    }
    
    public void iniciar(){
        int escolha = -1;
        while(escolha != ControleGeral.SAIR){
            System.out.println("Escolha algo:");
            System.out.println( ControleGeral.MARCAR_PASSAGEM+") Marcar passagem");
            System.out.println( ControleGeral.VER_PASSAGENS+") Ver passages compradas");
            System.out.println( ControleGeral.SAIR+") Sair");
            escolha = this.scanner.nextInt();

            switch(escolha){
                case ControleGeral.MARCAR_PASSAGEM:
                    this.marcarPassagem.iniciar();
                break;
                case ControleGeral.VER_PASSAGENS:
                    this.listarPassagens.iniciar();
                break;
                case ControleGeral.SAIR:
                    this.encerrar();
                break;
            }
        }
    }
}
