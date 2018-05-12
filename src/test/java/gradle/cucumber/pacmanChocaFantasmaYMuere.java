package gradle.cucumber;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class pacmanChocaFantasmaYMuere {

    private Pacman pacman;
    private Fantasma fantasma;


    @Given("^un pacman y un fantasma")
    public void nuevoPacmanYFantasma(){
        this.pacman = new Pacman();
        this.fantasma = new Fantasma();
    }

    //@When("^el ([(pacman|fantasma)^\"]*) choca con el ([(pacman|fantasma)^\"]*)$")
    @When("^el pacman choca con el fantasma")
    public void pacmanChocaFantasma(){
        this.pacman.choca(this.fantasma);
    }

    @Then("^el pacman muere")
    public void pacmanMuere(){
        assertThat(this.pacman.estaVivo()).isEqualTo(false);
    }

}
