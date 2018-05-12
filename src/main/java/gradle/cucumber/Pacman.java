package gradle.cucumber;


public class Pacman {

    private Estado estado;
    private int puntos;

    public Pacman(){
        this.estado = new EstadoVivo();
        this.puntos = 0;

    }

    public void choca(Fantasma fantasma) {
        this.estado = new EstadoMuerto();
    }

    public boolean estaVivo() {
        return this.estado.estaVivo();
    }

    public void come(Biscuit biscuit) {
        this.puntos = puntos + biscuit.puntos();
    }

    public int puntos(){
        return this.puntos;
    }
}
