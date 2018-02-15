public class DummyClass {

  public static void main(String[] args) {
    String name = "Bence";
    int age = 1992;
    String month = "June";
    String day = "21";
    String myName = "Java";
    String hello = "Hellaou";
    String horoscope = "Gemini";
    String chineseHoroscope = "Horse";
    String title = "Sir";
    greet(name, title);
    String age2 = "Ten";
    cheer(hello, myName);
    count(age, month, day);
    future(horoscope, chineseHoroscope ,age2);
  }

  public static void cheer(String hello,String myName) {
    System.out.println(hello + ", " + myName + "!");
  }

  public static void greet(String name, String title) {
    System.out.println(title + " " + name);
  }

  public static void count(int age, String month, String day) {
    System.out.println("My birthday is : " + age + " " + month + " " + day);
  }

  public static void future(String horoscope, String chineseHoroscope ,String age2) {
    System.out.println(horoscope);
    System.out.println(chineseHoroscope);
    System.out.println(age2);
  }
}


