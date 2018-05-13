package gradle.cucumber;

public class EstadoMuerto implements Estado {

    private Boolean estado;

    public EstadoMuerto(){
        this.estado=false;
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
