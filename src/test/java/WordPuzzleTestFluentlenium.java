import org.junit.*;
import org.fluentlenium.adapter.FluentTest;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

public class WordPuzzleTestFluentlenium extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Enter your sentence");
  }

  @Test public void testThataWordGetPuzzled() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("h-ll-");
  }

  @Test public void testThataWordCanBeGuessed() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("h-ll-");
    fill("#userGuess").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("you guessed correctly");
  }

  @Test public void testThatIfTheUSerGuessISWrongTheCorrectMessageIsDisplayed() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("h-ll-");
    fill("#userGuess").with("ciao");
    submit(".btn");
    assertThat(pageSource()).contains("that is not the sentence which was hidden");
  }

  @Test public void testThatAfterGuessingWronglyTheUserCanTryAgain() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("h-ll-");
    fill("#userGuess").with("ciao");
    submit(".btn");
    assertThat(pageSource()).contains("that is not the sentence which was hidden");
    submit("#tryAgain");
    assertThat(pageSource()).contains("Type here the sentence which you think has been hidden");
  }

  @Test public void testThatTheUserCanGetBackToRootToTypeANewWord() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("h-ll-");
    fill("#userGuess").with("ciao");
    submit(".btn");
    assertThat(pageSource()).contains("that is not the sentence which was hidden");
    submit("#backToRoot");
    assertThat(pageSource()).contains("Please enter your sentence");
  }

}
