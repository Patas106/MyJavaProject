package fourthAndFifthClass;

public class CartException extends Exception { //Exception je hlídaná výjímka
  public CartException(String message) {
    super(message);
  }
}


//rozdíl mezi hlídanou a nehlídanou výjimkou je v tom, že hlídanou výjimku musím ošetřit?