public class DummyClass {

  public static void main(String[] args) {
    String name = "Greetings!";
    int age = 25;
    String month = "June";
    String myName = "Java";
    String hello = "Hellaou";
    String horoscope = "Gemini";
    String chineseHoroscope = "Horse";
    cheer(hello, myName);
    greet(name);
    count(age, month);
    future(horoscope, chineseHoroscope);
  }

  public static void cheer(String hello,String myName) {
    System.out.println(hello + ", " + myName + "!");
  }

  public static void greet(String name) {
    System.out.println(name);
  }

  public static void count(int age, String month) {
    System.out.println("Counting the countless " + age + " " + month);
  }

  public static void future(String horoscope, String chineseHoroscope) {
    System.out.println(horoscope);
    System.out.println(chineseHoroscope);
  }
}


