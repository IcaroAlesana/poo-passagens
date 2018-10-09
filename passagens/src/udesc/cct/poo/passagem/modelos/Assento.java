package udesc.cct.poo.passagem.modelos;
public class Assento{
    public static int LEITO = 0;
    public static int SEMILEITO = 1;
    public static int CONVENCIONAL = 2;

    private int tipo;
    private int numero;
    private boolean reservado;

    public Assento(int tipo, int numero){
        this.reservado = false;
        this.tipo = tipo;
        this.numero = numero;
    }

    public int getTipo(){
        return this.tipo;
    }
    public int getNumero(){
        return this.numero;
    }
    public boolean estaDesocupado(){
        return !this.reservado;
    }
    public void reservar(){
        this.reservado = true;
    }

    public String getInfo(){
        String tp, free;
        if (this.getTipo() == 0) tp = "Leito";
        else tp = (getTipo() == 1) ? "Semi-leito" : "Convencional";
        free = (this.reservado == false) ? "Desocupado" : "Ocupado";

        return (this.getNumero() + ") " + free + " Tipo: " + tp);
    }
}
