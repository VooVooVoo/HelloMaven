package com.wojtszym;
import spark.Spark;

public class HelloMaven{
public static void main(String[] args) {
System.out.println("HelloWorld");
Spark.get("/hello", (request, response) -> {
            return "<html> Hello <b> Buddy </b> <br/>" +
                    "Now you can do things!" +
                    "</html>";
        });
}
}