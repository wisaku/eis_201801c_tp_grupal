package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PacmanComePellets {

    private Pacman pacman;
    private Fantasma clyde;
    private Fantasma blinky;
    private Fantasma pinky;
    private Fantasma inky;
    private List<Fantasma> fantasmas;
    private Pellet pellet;

    @Given("un pellet un pacman y fantasmas")
    public void nuevoPacmanYFantasma(){
        this.pacman = new Pacman();
        this.clyde = new Fantasma();
        this.blinky = new Fantasma();
        this.pinky = new Fantasma();
        this.inky = new Fantasma();
        fantasmas = new ArrayList<>();
        fantasmas.add(clyde);
        fantasmas.add(blinky);
        fantasmas.add(pinky);
        fantasmas.add(inky);
        this.pellet = new Pellet();
    }

    @When("pacman come un pellet")
    public void pacmanComePellet(){
        this.fantasmas.forEach(f -> f.debilitar());
    }

    @Then("los fantasmas se debilitan")
    public void fantasmasDebilitados(){
        assertThat(this.fantasmas.stream().allMatch(f -> f.esDebil())).isEqualTo(true);
    }

}
