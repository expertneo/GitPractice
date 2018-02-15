public class DummyClass {

  public static void main(String[] args) {
    String name = "Bence";
    int age = 25;
    String month = "June";
    String myName = "Java";
    String horoscope = "Gemini";
    String chineseHoroscope = "Horse";
    cheer(myName);
    String title = "Sir";
    greet(name, title);
    count(age, month);
    future(horoscope, chineseHoroscope);
  }

  public static void cheer(String myName) {
    System.out.println("Hello, " + myName + "!");
  }

  public static void greet(String name, String title) {
    System.out.println(title + " " + name);
  }

  public static void count(int age, String month) {
    System.out.println("My age is: " + age + " " + month);
  }

  public static void future(String horoscope, String chineseHoroscope) {
    System.out.println(horoscope);
    System.out.println("Your future looks like" + chineseHoroscope);
  }
}


