package gradle.cucumber;

public class EstdoDebil implements EstadoFantasma {

    public Boolean esDebil() {
        return true;
    }

    @Override
    public Boolean esSinCuerpo() {
        return false;
    }
}
