package gradle.cucumber;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Clock;

import static org.assertj.core.api.Assertions.assertThat;

public class pacmanChocaFantasmaYMuere {

    private Pacman pacman;
    private Fantasma fantasma;


    @Given("un pacman y un fantasma")
    public void nuevoPacmanYFantasma(){
        this.pacman = new Pacman();
        this.fantasma = new Fantasma();
    }

    @When("un pacman choca con un fantasma")
    public void pacmanChocaFantasma(){
        this.pacman.choca(this.fantasma);
    }

    @When("un fantasma choca con un pacman")
    public void fantasmaChocaPacman(){
        this.fantasma.choca(this.pacman);
    }

    @Then("el pacman muere")
    public void pacmanMuere(){
        assertThat(this.pacman.estaVivo());
    }

}
