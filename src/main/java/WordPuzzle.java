// import java.util.Map;
// import java.util.HashMap;
import java.io.*;
import java.util.ArrayList;

  public class WordPuzzle {
    public static String WorldPuzzler (String userSentence){
      String[] vowels = {"a", "e", "i", "o", "u"};
      for (String vowel: vowels){
        userSentence = userSentence.replace(vowel,"-");
        userSentence = userSentence.replace(vowel.toUpperCase(),"-");
      }
      return userSentence;
    }
  }
