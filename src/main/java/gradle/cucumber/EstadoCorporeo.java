package gradle.cucumber;


public class EstadoCorporeo implements EstadoFantasma {

    @Override
    public Boolean esDebil() {
        return false;
    }

    @Override
    public boolean esSinCuerpo() {
        return false;
    }
}
