import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
  public void worldPuzzle_doesItReplacevowelsInSingleWords(){
    WordPuzzle puzzlerTest = new WordPuzzle();
    assertEquals("H-llo", puzzlerTest.WorldPuzzler("Hello"));
  }
}
