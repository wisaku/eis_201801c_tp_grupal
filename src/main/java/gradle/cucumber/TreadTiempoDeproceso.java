package gradle.cucumber;

public class TreadTiempoDeproceso extends Thread {
    public Integer TIMEOUT = 10; //segundos

    Pacman pacman = null;

    @Override
    public void run() {
        try {
            Thread.sleep(1000* TIMEOUT);
            pacman.setEstado(new EstadoVivo());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void setPacman(Pacman pacman) {
        this.pacman = pacman;
    }
}
