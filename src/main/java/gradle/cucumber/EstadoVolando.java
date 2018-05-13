package gradle.cucumber;


public class EstadoVolando implements Estado{

    @Override
    public Boolean estaVivo() {
        return true;
    }

    @Override
    public boolean estaVolando() {
        return true;
    }
}
