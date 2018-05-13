package gradle.cucumber;


public class EstadoCorporeo implements EstadoFantasma {

    @Override
    public Boolean esDebil() {
        return false;
    }

    @Override
    public Boolean esSinCuerpo() {
        return false;
    }

}
