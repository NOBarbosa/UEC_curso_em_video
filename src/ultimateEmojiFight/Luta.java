package ultimateEmojiFight;

import java.util.Random;

public class Luta implements ILuta {
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;


    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //
    @Override
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && !desafiado.getNome().equals(desafiante.getNome())) {
            this.setAprovada(true);
            this.setDesafiante(desafiante);
            this.setDesafiado(desafiado);
        } else {
            System.out.println("Impossível marcar");
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }


    @Override
    public void lutar() {
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("EMPATE");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiado.ganharLuta();
                    break;

            }

        }else{
            System.out.println("Não pode acontecer");
        }
    }
}
