public class Chap01 {
  // 'String[] args' lets main take in String parameters
  public static void main(String[] args) {

    // if user provided no arguments
    if (args.length < 1) {
      System.out.println("Hola!");
    } 

    //if user provides at least one (we'll use the first)
    else {
      System.out.println("Hola " + args[0] + "!");
    }
  }
}