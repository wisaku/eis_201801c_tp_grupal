package gradle.cucumber;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class pacmanChocaFantasmaSinCuerpoYNoMuere {

    private Pacman pacman;
    private Fantasma fantasma;


    @Given("un pacman y fantasma sin cuerpo")
    public void nuevoPacmanYFantasmaSinCuerpo(){
        this.pacman = new Pacman();
        this.fantasma = new Fantasma();
        this.fantasma.sinCuerpo();
    }

    @When("un pacman choca con fantasma sin cuerpo")
    public void pacmanChocaFantasma(){
        this.pacman.choca(this.fantasma);
    }

   @When("fantasma sin cuerpo choca con un pacman")
    public void fantasmaChocaPacman(){
        this.fantasma.choca(this.pacman);
    }

    @Then("el pacman no muere")
    public void pacmanNoMuere(){
        assertThat(this.pacman.estaVivo()).isEqualTo(true);
    }

}
