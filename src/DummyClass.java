public class DummyClass {

  public static void main(String[] args) {
    String name = "Bence";
    int age = 25;
    String myName = "Nori";
    String horoscope="Gemini";
    cheer(myName);
    greet(name);
    count(age);
    future(horoscope);
  }

  public void cheer(string myName) {
    System.out.println("Hello, !" + myName);
  }

  public static void greet(String name) {
    System.out.println(name);
  }

  public void count (int age){
    System.out.println("My age is: " + age);
  }

  public static void future(String horoscope) {
    System.out.println(horoscope);
  }
}


