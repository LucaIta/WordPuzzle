// import java.util.Map;
// import java.util.HashMap;
import java.io.*;
import java.util.ArrayList;
import java.io.Console;


public class WordPuzzle {
  static Integer counter = 0;
  static ArrayList<String> puzzledSentence = new ArrayList<String>();
  // static String testString = "Hello";

  // public static String WorldPuzzler (String userSentence){
  //   String[] vowels = {"a", "e", "i", "o", "u"};
  //   for (String vowel: vowels){
  //     userSentence = userSentence.replace(vowel,"-");
  //     userSentence = userSentence.replace(vowel.toUpperCase(),"-");
  //   }
  //   return userSentence;
  // }

  public static String WorldPuzzler (String userSentence){
    Console myConsole = System.console();
    String[] vowels = {"a", "e", "i", "o", "u","y"};
    String[] consonants = {"b", "c", "d", "f", "g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","z"," "};
    String[] splittedUserSentence = userSentence.split("");
    String puzzledSentenceString = "";

    for (String letter : splittedUserSentence){

        for (String vowel : vowels){
          if (letter.contains(vowel) || letter.contains(vowel.toUpperCase())){
            puzzledSentence.add("-");
            puzzledSentenceString += "-";
          }
        }
        for (String consonant : consonants){
          if (letter.contains(consonant) || letter.contains(consonant.toUpperCase())){
            System.out.println(consonant);
            System.out.println(letter);
            System.out.println(puzzledSentenceString);
            puzzledSentence.add(letter);
            puzzledSentenceString += letter;
          }
        }
    }
    return puzzledSentenceString;
  }

  public static Boolean sentenceChecker (String originalUserSentence ,String userGuess) {
    Boolean userWin = false;
    if (originalUserSentence.equals(userGuess)){
      userWin = true;
    }
    return userWin;
  }
}
