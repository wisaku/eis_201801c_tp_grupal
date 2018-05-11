package gradle.cucumber;


public class EstadoVivo implements Estado {

    private boolean estado;

    public EstadoVivo(){
        this.estado= true;
    }

    @Override
    public boolean estaVivo() {
        return this.estado;
    }
}
