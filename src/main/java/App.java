import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";


    get("/" , (request, response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();
      model.put("username", request.session().attribute("username"));
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/welcome", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      String inputtedUserName = request.queryParams("username");
      request.session().attribute("username", inputtedUserName);
      model.put("username", inputtedUserName);

      model.put("template", "templates/welcome.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/results", (request, response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();
      model.put("username", request.session().attribute("username"));
      int height = Integer.parseInt(request.queryParams("height"));
      int width = Integer.parseInt(request.queryParams("width"));
      int length = Integer.parseInt(request.queryParams("length"));
      int weight = Integer.parseInt(request.queryParams("weight"));

      Parcel myParcel = new Parcel (length, width, height, weight);
      Integer result = myParcel.costToShip();

      model.put("result", result);
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    }



        //RESTful ARCHITECTURE
        //Use POST to create something on the server
        //Use GET to retrieve something from the server
        //Use PUT to change or update something on the server
        //Use DELETE to remove or delete something on the server
        //Keep URLs intuitive
        //Each request from client contains all info necessary for that request

        //ROUTES: Home Page

        // get("/", (request, response) -> {
        //     HashMap<String, Object> model = new HashMap<String, Object>();

        //     model.put("template", "templates/index.vtl");
        //     return new ModelAndView(model, layout);
        // }, new VelocityTemplateEngine());

        //ROUTES: Identification of Resources

        //ROUTES: Changing Resources

    }
