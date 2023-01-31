package it.cantest.calculator.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pl.Gdy;
import io.cucumber.java.pl.Wtedy;
import io.cucumber.java.pl.Zakładając;
import it.cantest.calculator.Calculator;
import org.junit.jupiter.api.Assertions;

public class StepsDef {
    private Calculator calculator;
    private int result;
    @Zakładając("że kalkulator jest włączony")
    @Given("calculator is on")
    public void calculator_is_on() {
        this.calculator = new Calculator();
    }
    @Gdy("dodam liczby {int} i {int}")
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        this.result = calculator.sum(int1,int2);
    }
    @Wtedy("wynik wynosi {int}")
    @Then("the result is {int}")
    public void the_result_is(Integer int1) {
        Assertions.assertEquals(int1,this.result,"Summing result is wrong");
    }

    @Given("calculator color is pink")
    public void calculator_color_is_pink() {
        System.out.println("Pink");
    }

    @Then("color changed to yellow")
    public void color_changed_to_yellow() {
        System.out.println("Yellow");
    }
}
