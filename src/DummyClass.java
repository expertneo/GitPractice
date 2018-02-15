public class DummyClass {

  public static void main(String[] args) {
    String name = "Greetings!";
    int age = 1992;
    String month = "June";
    String day = "21";
    String myName = "Java";
    String horoscope = "Gemini";
    String chineseHoroscope = "Horse";
    cheer(myName);
    greet(name);
    count(age, month, day);
    future(horoscope, chineseHoroscope);
  }

  public static void cheer(String myName) {
    System.out.println("Hello, " + myName + "!");
  }

  public static void greet(String name) {
    System.out.println(name);
  }

  public static void count(int age, String month, String day) {
    System.out.println("My birthday is : " + age + " " + month + " " + day);
  }

  public static void future(String horoscope, String chineseHoroscope) {
    System.out.println(horoscope);
    System.out.println(chineseHoroscope);
  }
}


