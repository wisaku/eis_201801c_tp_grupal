package gradle.cucumber;

public class FrutaEspecial extends Comida{

    @Override
    public void cambiarEstadoPorPropiedadesNutricionales(Pacman pacman) {
        pacman.setEstado(new EstadoVolando());
        TreadTiempoDeproceso aTread = new TreadTiempoDeproceso();
        aTread.setPacman(pacman);
        aTread.start();

    }




}


