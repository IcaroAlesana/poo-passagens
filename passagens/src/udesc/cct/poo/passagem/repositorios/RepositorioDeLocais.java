package udesc.cct.poo.passagem.repositorios;
import java.util.ArrayList;

import udesc.cct.poo.passagem.helpers.LeitorDeArquivo;
import udesc.cct.poo.passagem.modelos.Local;

public class RepositorioDeLocais{
    private ArrayList<Local> locais = new ArrayList<Local>();

    public RepositorioDeLocais(){
        LeitorDeArquivo leitor = new LeitorDeArquivo("D:\\Documentos\\Faculdade\\POO\\2018\\poo-passagens\\passagens" +
                "\\data\\locais.csv");
        ArrayList<String> linhas= leitor.ler();

        for(int i =0;i<linhas.size();i++){
                String nome = linhas.get(i);
                Local l = new Local(nome);
                locais.add(l);
        }
    }
    public ArrayList<Local> getTodosOsLocais(){
        return this.locais;
    }

    public Local getLocalPorNome(String nome){
        for(int i = 0;i<this.locais.size();i++){
            Local local = this.locais.get(i);
            String nomeDoLocal = local.getNome();
            if( nome.equals(nomeDoLocal) ){
                return local;
            }
        }
        return null;
    }
}
