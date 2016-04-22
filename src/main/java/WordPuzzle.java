// import java.util.Map;
// import java.util.HashMap;
import java.io.*;
import java.util.ArrayList;

  public class WordPuzzle {
    public static String WorldPuzzler (String userSentence){
      // String[] vowels = {"a", "e", "i", "o", "u"};
      String puzzledSentence = userSentence.replace("e","-");
      // ArrayList<String> splittedSentence = new ArrayList<String>();
      // splittedSentence = userSentence.split("");
      // for (Index = 0; index < userSentence.size(); Index ++){
      //   for (String vowel: vowels){
      //     if (splittedSentence.get(Index).equals(vowel)){
      //       splittedSentence.get(Index) == "-";
      //     }
      //   }
      // }
      return puzzledSentence;
    }
  }
