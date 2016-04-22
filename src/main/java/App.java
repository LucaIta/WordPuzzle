import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  static String userOriginalSentence = "";

  public static void main (String[] args){
    String layout = "templates/layout.vtl";

    get("/", (request, responde) -> {
      userOriginalSentence = "";
      HashMap model = new HashMap();
      model.put("template" ,"templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      HashMap model = new HashMap();
      WordPuzzle resultDisplayer = new WordPuzzle();
      if (userOriginalSentence.equals("")){
        userOriginalSentence = request.queryParams("userInput");
      }
      model.put("userOutput" ,resultDisplayer.WordPuzzler(userOriginalSentence));
      model.put("template" ,"templates/result.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/guess", (request, response) -> {
      HashMap model = new HashMap();
      WordPuzzle winOrLoseDisplayer = new WordPuzzle();
      String userGuess = request.queryParams("userGuess");
      model.put("userOutput" , winOrLoseDisplayer.sentenceChecker(userOriginalSentence,userGuess));
      model.put("template" ,"templates/guessResult.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
