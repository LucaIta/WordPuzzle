import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
  public void worldPuzzle_doesItReplacevowelsInSingleWords(){
    WordPuzzle puzzlerTest = new WordPuzzle();
    assertEquals("H-ll-", puzzlerTest.WordPuzzler("Hello"));
  }

  @Test
  public void worldPuzzle_doesItReplacevowelsTwoWordSentences(){
    WordPuzzle puzzlerTest = new WordPuzzle();
    assertEquals("H-ll- W-rld", puzzlerTest.WordPuzzler("Hello World"));
  }

  @Test
  public void worldPuzzle_doesItReplacevowelsCapitalized(){
    WordPuzzle puzzlerTest = new WordPuzzle();
    assertEquals("H-ll- W-rld", puzzlerTest.WordPuzzler("HEllO WOrld"));
  }

  @Test
  public void worldPuzzle_doesItCorrectlyCompareOriginalSentenceAndUserGuess(){
    WordPuzzle puzzlerTest = new WordPuzzle();
    assertEquals("you guessed correctly", puzzlerTest.sentenceChecker("Hello World","Hello World"));
  }
}
