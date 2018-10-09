package udesc.cct.poo.passagem.modelos;

public class Passagem{
    private Passageiro passageiro;
    private Viagem viagem;
    private Local origem;
    private Local destino;

    public Passagem(Passageiro passageiro, Viagem viagem, Local origem, Local destino){
        this.passageiro = passageiro;
        this.viagem = viagem;
        this.origem = origem;
        this.destino = destino;
    }
    public String getInfo(){
        return ("Passageiro - " + this.passageiro.getNome() + " / " + this.passageiro.getCpf() + "\n\n" + "Origem: " + this.origem.getNome() + "\n" + "Destino: " + this.destino.getNome() + "\n\n" + "Itinerario\n\n" + "Embarque: " + this.viagem.getParadaPorNome(this.origem.getNome()).getInfo() + " / " + "Desembarque: " + this.viagem.getParadaPorNome(this.destino.getNome()).getInfo() + "\n");
    }
}
