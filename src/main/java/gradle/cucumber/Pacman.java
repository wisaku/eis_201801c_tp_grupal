package gradle.cucumber;


public class Pacman {

    private Estado estado;
    private int puntos;

    public Pacman() {
        this.estado = new EstadoVivo();
        this.puntos = 0;

    }


    private void debilitarFantasmaOMatarPacman(Fantasma fantasma)
    {
        if(fantasma.getEstado().esDebil() )
            fantasma.sinCuerpo();
        else
            this.estado = new EstadoMuerto();
    }


    public void choca(Fantasma fantasma) {
        //OBTENGO EL NUEVO ESTADO QUE DEBERIA TENER


        if (!fantasma.getEstado().esSinCuerpo() && !this.getEstado().estaVolando()) {
            if (fantasma.getEstado().esDebil())
                fantasma.sinCuerpo();
            else
                this.estado = new EstadoMuerto();
        }
    }
    public Boolean estaVivo() {
        return this.estado.estaVivo();
    }

    public void come(Comida comida) {
        this.setPuntos(getPuntos() + comida.getPuntos());
        comida.cambiarEstadoPorPropiedadesNutricionales(this);
    }



    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    }
