import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
  public void worldPuzzle_doesItReplacevowelsInSingleWords(){
    WordPuzzle puzzlerTest = new WordPuzzle();
    assertEquals("H-ll-", puzzlerTest.WorldPuzzler("Hello"));
  }

  @Test
  public void worldPuzzle_doesItReplacevowelsTwoWordSentences(){
    WordPuzzle puzzlerTest = new WordPuzzle();
    assertEquals("H-ll- W-rld", puzzlerTest.WorldPuzzler("Hello World"));
  }
}
