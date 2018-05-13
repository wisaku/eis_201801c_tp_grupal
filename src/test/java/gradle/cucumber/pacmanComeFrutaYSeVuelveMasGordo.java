package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

public class pacmanComeFrutaYSeVuelveMasGordo {
    private Pacman pacman;
    private Fruta fruta;



    @Given("^una fruta y un pacman")
    public void tengoUnPacmanYUnaFruta(){
        this.pacman = new Pacman();
        this.fruta = new Fruta();

    }

    @When("^el pacman come una fruta")
    public void pacmanComeFruta(){
        this.pacman.come(fruta);
    }

    @Then("^pacman se vuelve gordo")
    public void pacmanEngordaPorFruta(){
        assertThat(this.pacman.getPuntos()).isEqualTo(30);


    }
}

