package com.ericgoebelbecker.steps;

import com.ericgoebelbecker.model.Thing;
import org.jbehave.core.annotations.*;
import org.junit.Assert;


public class ThingSteps {

    private final ThreadLocal<Thing> thingStash = new ThreadLocal<>();

    private Thing getThing() {
        return this.thingStash.get();
    }

    @Given("I have a Thing")
    public void givenIHaveAThing() {
        thingStash.set(new Thing());
    }

    @Given("I have a Thing with an item named $name")
    public void givenIHaveAThingWithAnItemNamed(String name) {
        Thing thing = new Thing(name);
        thingStash.set(thing);
    }

    @When("I add an item named $name")
    public void whenIAddAnItemNamed(String name) {
        getThing().addThing(name);
    }

    @Then("My thing has $count items")
    public void thenThingHasName(int count) {
        Assert.assertEquals(getThing().getThingCount(), count);
    }

    @Then("My thing has an item named $name")
    public void thenThingHasName(String name) {
        Assert.assertTrue(getThing().hasThing(name));
    }
}
