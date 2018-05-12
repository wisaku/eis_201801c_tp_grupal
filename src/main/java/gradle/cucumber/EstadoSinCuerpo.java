package gradle.cucumber;


public class EstadoSinCuerpo implements EstadoFantasma {

    @Override
    public Boolean esDebil() {
        return false;
    }

    @Override
    public boolean esSinCuerpo() {
        return true;
    }
}
