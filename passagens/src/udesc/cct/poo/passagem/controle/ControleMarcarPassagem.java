package udesc.cct.poo.passagem.controle;
import java.util.ArrayList;
import java.util.Scanner;

import udesc.cct.poo.passagem.modelos.*;
import udesc.cct.poo.passagem.servicos.ServicoDeLocais;
import udesc.cct.poo.passagem.servicos.ServicoDePassagens;
import udesc.cct.poo.passagem.servicos.ServicoDeViagens;

public class ControleMarcarPassagem {

    private Scanner scanner;
    private ServicoDeLocais servicoDeLocais;
    private ServicoDeViagens servicoDeViagens;
    private ServicoDePassagens servicoDePassagens;
    int existeOuNaoViagem;
    
    public ControleMarcarPassagem(Scanner scanner, ServicoDeLocais servicoDeLocais, ServicoDeViagens servicoDeViagens, ServicoDePassagens servicoDePassagens) {
        this.scanner = scanner;
        this.servicoDeLocais = servicoDeLocais;
        this.servicoDeViagens = servicoDeViagens;
        this.servicoDePassagens = servicoDePassagens;
    }

    public void iniciar() {
        Local origem = escolherOrigem();
        Local destino = escolherDestino();
        Viagem escolhida = acharUmaViagemPorOrigemDestino(origem, destino);
        Assento assento = escolherAssento(escolhida);
        assento.reservar();

        ArrayList<Assento> assentos = escolhida.getAssentos();
        this.listarAssentos(assentos);
        marcarPassagem(escolhida, origem, destino);
    }

    public Viagem acharUmaViagemPorOrigemDestino(Local origem, Local destino){
        ArrayList<Viagem> viagens = servicoDeViagens.getTodasAsViagensPorOrigemDestino(origem, destino);
        listarViagens(viagens, origem, destino);
        if( this.existeOuNaoViagem == 1){
           this.iniciar();
        }
        System.out.println("escolha um Onibus:");
        int viagensIdx = this.scanner.nextInt();
        Viagem escolhida = viagens.get(viagensIdx-1);
        return escolhida;
    }
    
    public void listarLocais(ArrayList<Local> locais) {

        for (int i = 0; i < locais.size(); i++) {
            int idx = i + 1;
            Local l = locais.get(i);
            String nome = l.getNome();
            System.out.println(idx + ") " + nome);
        }
    }

    public void listarViagens(ArrayList<Viagem> viagens, Local origem, Local destino) {

        for (int i = 0; i < viagens.size(); i++) {
            int idx = i + 1;
            Viagem v = viagens.get(i);
            Parada embarque = v.getParadaPorNome(origem.getNome());
            Parada desembarque = v.getParadaPorNome(destino.getNome());
            System.out.println(idx + ") " + embarque.getInfo() + " " + desembarque.getInfo());
        }
    }

    public void listarViagens(ArrayList<Viagem> viagens, Local origem, Local destino){
    if(viagens.size()== 0 ){
        System.out.println("Viagem não encontrada");    
        this.existeOuNaoViagem= 1;
    }else{
        for(int i =0;i<viagens.size();i++){
            int idx = i+1;
            Viagem v = viagens.get(i);
            Parada embarque = v.getParadaPorNome(origem.getNome());
            Parada desembarque = v.getParadaPorNome(destino.getNome());
            System.out.println(idx+") "+embarque.getInfo()+" "+desembarque.getInfo());
            
     }
         this.existeOuNaoViagem = 0;
         }
    }
   
    public void listarAssentos(ArrayList<Assento> assentos) {
        for (int i = 0; i < assentos.size(); i+=2) {
            Assento a = assentos.get(i);
            Assento b = assentos.get(i+1);
            System.out.println(a.getInfo() + " | " + b.getInfo());
        }
    }

    public Local escolherOrigem() {
        ArrayList<Local> locais = servicoDeLocais.getTodosOsLocais();
        listarLocais(locais);
        System.out.println("escolha uma ORIGEM:");
        int origemIdx = this.scanner.nextInt();
        Local origem = locais.get(origemIdx - 1);

        System.out.println("------------------------------------");
        System.out.println("ORIGEM:" + origem.getNome());
        System.out.println("------------------------------------");

        return origem;
    }

    public Local escolherDestino() {
        ArrayList<Local> locais = servicoDeLocais.getTodosOsLocais();
        this.listarLocais(locais);
        System.out.println("escolha um DESTINO:");
        int destinoIdx = this.scanner.nextInt();
        Local destino = locais.get(destinoIdx - 1);

        System.out.println("------------------------------------");
        System.out.println("DESTINO:" + destino.getNome());
        System.out.println("------------------------------------");

        return destino;
    }

    public Assento escolherAssento(Viagem viagem) {
        ArrayList<Assento> assentos = viagem.getAssentos();
        this.listarAssentos(assentos);
        System.out.println("escolha um assento:");
        int assentoIdx = this.scanner.nextInt();
        Assento assento = assentos.get(assentoIdx - 1);

        return assento;
    }

    public void marcarPassagem (Viagem v, Local origem, Local destino){
        Passageiro passageiro = new Passageiro(scanner);
        Passagem p = new Passagem(passageiro, v, origem, destino);
        servicoDePassagens.addPassagem(p);
    }

}

