import java.io.*;
import java.util.ArrayList;
import java.io.Console;

public class WordPuzzle {
  static ArrayList<String> puzzledSentence = new ArrayList<String>();

  public static String WordPuzzler (String userSentence){
    String[] vowels = {"a", "e", "i", "o", "u"};
    for (String vowel: vowels){
      userSentence = userSentence.replace(vowel,"-");
      userSentence = userSentence.replace(vowel.toUpperCase(),"-");
    }
    return userSentence;
  }

  public static String sentenceChecker (String originalUserSentence ,String userGuess) {
    String outcome = "that is not the sentence which was hidden";
    if (originalUserSentence.equals(userGuess)){
      outcome = "you guessed correctly";
    }
    return outcome;
  }
}
