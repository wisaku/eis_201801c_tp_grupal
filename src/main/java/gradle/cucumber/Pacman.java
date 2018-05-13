package gradle.cucumber;


public class Pacman {

    private Estado estado;
    private int puntos;

    public Pacman(){
        this.estado = new EstadoVivo();
        this.puntos = 0;

    }

    private void debilitarFantasmaOMatarPacman(Fantasma fantasma)
    {
        if(fantasma.getEstado().esDebil() )
            fantasma.sinCuerpo();
        else
            this.estado = new EstadoMuerto();
    }

    public void choca(Fantasma fantasma) {
        if(fantasma.getEstado().esSinCuerpo())
            this.estado= new EstadoVivo();
        else
            debilitarFantasmaOMatarPacman(fantasma);

    }

    public Boolean estaVivo() {
        return this.estado.estaVivo();
    }

    public void come(Biscuit biscuit) {
        this.puntos = puntos + biscuit.puntos();
    }

    public void comeFruta(Fruta fruta) {this.puntos = puntos + fruta.puntos();}

    public int puntos(){
        return this.puntos;
    }
}
