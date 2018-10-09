package udesc.cct.poo.passagem.controle;

import udesc.cct.poo.passagem.modelos.Passagem;
import udesc.cct.poo.passagem.servicos.ServicoDePassagens;

public class ControleListarPassagens {
    ServicoDePassagens servicoDePassagens;

    public ControleListarPassagens(ServicoDePassagens servicoDePassagens){
        this.servicoDePassagens = servicoDePassagens;
    }

    public void iniciar(){
        for (int i = 0; i < this.servicoDePassagens.getTodasAsPassagens().size(); i++){
           Passagem p =  this.servicoDePassagens.getTodasAsPassagens().get(i);
            System.out.println(p.getInfo());
        }
    }
}
