package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class PacmanComeFrutaEspecial {

    private Pacman pacman;
    private FrutaEspecial specialFruit;
    private Fantasma pinky;

    @Given("un Pacman, una fruta especial y un fantasma")
    public void un_Pacman_una_fruta_especial_y_un_fantasma() {
        pacman = new Pacman();
        specialFruit = new FrutaEspecial();
        pinky = new Fantasma();
    }

    @When("El pacman come la fruta")
    public void el_pacman_come_la_fruta() {
        pacman.come(specialFruit);
    }

    @Then("pasa por un fantasma y no muere")
    public void pasa_por_un_fantasma_y_no_muere() {
        pacman.choca(pinky);
        assertThat(this.pacman.estaVivo());
    }


}
