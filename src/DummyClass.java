public class DummyClass {
  
  public void count (){
    System.out.println("My age is 25");
  }

  public static void main(String[] args) {
    String name = "Bence";
    greet(name);
    future();
  }

  public static void greet(String name) {
    System.out.println(name);
  }

  public static void future() {
    System.out.println("Gemini");
  }
}
