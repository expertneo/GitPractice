public class DummyClass {
  public static void main(String[] args) {
    String name = "Bence";
    int age = 25;
    String myName = "Java";
    String horoscope = "Gemini";
    String chineseHoroscope = "Horse";
    cheer(myName);
    greet(name);
    count(age);
    future(horoscope, chineseHoroscope);
  }

  public static void cheer(String myName) {
    System.out.println("Hello, " + myName + "!");
  }

  public static void greet(String name) {
    System.out.println(name);
  }

  public static void count(int age) {
    System.out.println("My age is: " + age);
  }

  public static void future(String horoscope, String chineseHoroscope) {
    System.out.println(horoscope);
    System.out.println(chineseHoroscope);
  }
}


