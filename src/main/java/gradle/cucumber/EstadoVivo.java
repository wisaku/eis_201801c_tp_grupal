package gradle.cucumber;


public class EstadoVivo implements Estado {

    private Boolean estado;

    public EstadoVivo(){
        this.estado= true;
    }

    @Override
    public Boolean estaVivo() {
        return this.estado;
    }

    @Override
    public boolean estaVolando() {
        return false;
    }
}
