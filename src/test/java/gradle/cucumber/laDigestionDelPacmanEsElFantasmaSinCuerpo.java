package gradle.cucumber;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class laDigestionDelPacmanEsElFantasmaSinCuerpo {

    private Pacman pacman;
    private Fantasma fantasma;

    @Given("un fantasma debilitado y un pacman")
    public void nuevoPacmanYFantasmaDebilitado(){
        this.pacman = new Pacman();
        this.fantasma = new Fantasma();
        this.fantasma.debilitar();
    }

    @When("el fantasma choca con el pacman")
    public void pacmanChocaFantasma(){
        this.pacman.choca(this.fantasma);
    }

    @Then("la digestion es el fantasma sin cuerpo")
    public void fantasmaSinCuerpo(){

        

        assertThat(this.fantasma.getEstado().esDebil()).isEqualTo(false);
        assertThat(this.fantasma.getEstado().esSinCuerpo()).isEqualTo(true);
    }
}
