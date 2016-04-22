// import java.util.Map;
// import java.util.HashMap;
import java.io.*;
import java.util.ArrayList;

  public class WordPuzzle {
    public static String WorldPuzzler (String userSentence){
      userSentence = userSentence.replace("a","-");
      userSentence = userSentence.replace("e","-");
      userSentence = userSentence.replace("i","-");
      userSentence = userSentence.replace("o","-");
      userSentence = userSentence.replace("u","-");
      return userSentence;
    }
  }
