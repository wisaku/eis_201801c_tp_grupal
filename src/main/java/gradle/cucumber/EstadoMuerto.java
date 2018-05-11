package gradle.cucumber;

public class EstadoMuerto implements Estado {

    private boolean estado;

    public EstadoMuerto(){
        this.estado=false;
    }

    @Override
    public boolean estaVivo() {
        return this.estado;
    }
}
