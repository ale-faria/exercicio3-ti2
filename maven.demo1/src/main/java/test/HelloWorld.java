package test;

import static spark.Spark.*;

public class HelloWorld {
 public static void main(String[] arg){
 get("/hello", (request, response) -> "Hello World!");
 }
}


/*package maven.demo1;

public class HelloWorld {

}
*/