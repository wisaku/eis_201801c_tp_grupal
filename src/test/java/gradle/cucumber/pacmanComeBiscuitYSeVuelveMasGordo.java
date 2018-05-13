package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;


public class pacmanComeBiscuitYSeVuelveMasGordo {
    private Pacman pacman;
    private Biscuit biscuit;

    @Given("^un biscuit y un pacman")
    public void tengoUnPacmanYUnBiscuit(){
        this.pacman = new Pacman();
        this.biscuit = new Biscuit();

    }

    @When("^el pacman come un biscuit")
    public void pacmanComeBiscuit(){
        this.pacman.come(biscuit);

    }

    @Then("^pacman engorda")
    public void pacmanEngorda(){
        assertThat(this.pacman.getPuntos()).isEqualTo(20);


    }
}

