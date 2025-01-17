package pt.up.fe.service;

import static pt.up.fe.model.Race.HOBBIT;
import static pt.up.fe.model.Race.MAIA;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pt.up.fe.model.Movie;
import pt.up.fe.model.Race;
import pt.up.fe.model.Ring;
import pt.up.fe.model.TolkienCharacter;
import pt.up.fe.service.DataService;

class DataServiceTest {

  private DataService dataService;

  @BeforeEach
  public void setup() {
    this.dataService = new DataService();
  }

  @Test
  public void ensureThatInitializationOfTolkeinCharactorsWorks() {
    TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
    // TODO check that age is 33
    // TODO check that name is "Frodo"
    // TODO check that name is not "Frodon"
    fail("not yet implemented");
  }

  @Test
  public void ensureFellowShipCharacterAccessByNameReturnsNullForUnknownCharacter() {
    // TODO imlement a check that dataService.getFellowshipCharacter returns null for an
    // unknow felllow, e.g. "Lars"
    fail("not yet implemented");
  }

  @Test
  public void ensureFellowShipCharacterAccessByNameWorksGivenCorrectNameIsGiven() {
    // TODO imlement a check that dataService.getFellowshipCharacter returns a fellow for an
    // existing felllow, e.g. "Frodo"
    fail("not yet implemented");
  }

  @Test
  public void ensureThatEqualsWorksForCharaters() {
    Object jake = new TolkienCharacter("Jake", 43, HOBBIT);
    Object sameJake = jake;
    Object jakeClone = new TolkienCharacter("Jake", 12, HOBBIT);
    // TODO check that:
    // jake is equal to sameJake
    // jake is not equal to jakeClone
    fail("not yet implemented");
  }

  @Test
  public void checkInheritance() {
    TolkienCharacter tolkienCharacter = this.dataService.getFellowship().get(0);
    // TODO check that tolkienCharacter.getClass is not a movie class
    fail("not yet implemented");
  }

  @Test
  public void ensureThatFrodoAndGandalfArePartOfTheFellowsip() {
    List<TolkienCharacter> fellowship = this.dataService.getFellowship();
    // TODO check that Frodo and Gandalf are part of the fellowship
    fail("not yet implemented");
  }

  @Test
  public void ensureThatOneRingBearerIsPartOfTheFellowship() {
    List<TolkienCharacter> fellowship = this.dataService.getFellowship();
    // TODO test that at least one ring bearer is part of the fellowship
    fail("not yet implemented");
  }

  // TODO Use @RepeatedTest(int) to execute this test 1000 times
  @Tag("slow")
  @DisplayName("Ensure that we can call getFellowShip multiple times")
  public void ensureThatWeCanRetrieveFellowshipMultipleTimes() {
    this.dataService = new DataService();
    assertNotNull(dataService.getFellowship());
    fail("this should run 1000 times"); // TODO remove once @RepeatedTest is in place
  }

  @Test
  public void ensureOrdering() {
    List<TolkienCharacter> fellowship = this.dataService.getFellowship();
    // TODO ensure that the order of the fellowship is:
    // frodo, sam, merry,pippin, gandalf,legolas,gimli,aragorn,boromir
    fail("not yet implemented");
  }

  @Test
  public void ensureAge() {
    List<TolkienCharacter> fellowship = this.dataService.getFellowship();
    // TODO test ensure that all hobbits and men are younger than 100 years

    // TODO also ensure that the elfs, dwars the maia are all older than 100 years
    fail("not yet implemented");
    
    // HINT fellowship.stream might be useful here
  }

  @Test
  public void ensureThatFellowsStayASmallGroup() {
    List<TolkienCharacter> fellowship = this.dataService.getFellowship();
    // TODO Write a test to get the 20 element from the fellowship throws an
    // IndexOutOfBoundsException
    fail("not yet implemented");
  }

  @Test
  public void ensureServiceDoesNotRunToLong() {
    // TODO Write a test to ensure that update does not run longer than 3 seconds
    // Tip: Use the assertTimeout assert statement.
    fail("not yet implemented");
  }
}
