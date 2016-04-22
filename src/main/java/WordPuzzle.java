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

// public static String WordPuzzler (String userSentence){
//   Console myConsole = System.console();
//   String[] vowels = {"a", "e", "i", "o", "u","y"};
//   String[] consonants = {"b", "c", "d", "f", "g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","z"," "};
//   String[] splittedUserSentence = userSentence.split("");
//   String puzzledSentenceString = "";
//
//   for (String letter : splittedUserSentence){
//
//       for (String vowel : vowels){
//         if (letter.contains(vowel) || letter.contains(vowel.toUpperCase())){
//           puzzledSentence.add("-");
//           puzzledSentenceString += "-";
//         }
//       }
//       for (String consonant : consonants){
//         if (letter.contains(consonant) || letter.contains(consonant.toUpperCase())){
//           puzzledSentence.add(letter);
//           puzzledSentenceString += letter;
//         }
//       }
//   }
//   return puzzledSentenceString;
// }

// public static String vowelDisplayer (letter){
//   for ()
// }
