package gradle.cucumber;

public class Fantasma {

    private EstadoFantasma estado;

    public Fantasma(){
        this.estado = new EstadoCorporeo();
    }

    public void choca(Pacman pacman) {
        pacman.choca(this);
    }

    public void debilitar() {
        this.estado = new EstadoDebil();
    }

    public void sinCuerpo(){
        this.estado = new EstadoSinCuerpo();
    }

    public EstadoFantasma getEstado() {
        return this.estado;
    }

    public Boolean esDebil() {
        return this.estado.esDebil();
    }
}
