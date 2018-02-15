public class DummyClass {

  public static void main(String[] args) {
    String name = "Greetings!";
    int age = 25;
    String month = "June";
    String myName = "Java";
    String hello = "Hellaou";
    String horoscope = "Gemini";
    String chineseHoroscope = "Horse";
<<<<<<< HEAD
    String age2 = "Ten";
    cheer(myName);
=======
    cheer(hello, myName);
>>>>>>> b9773da606e4fca7eb393f361d57b43a1242427b
    greet(name);
    count(age, month);
    future(horoscope, chineseHoroscope ,age2);
  }

  public static void cheer(String hello,String myName) {
    System.out.println(hello + ", " + myName + "!");
  }

  public static void greet(String name) {
    System.out.println(name);
  }

  public static void count(int age, String month) {
    System.out.println("My age is: " + age + " " + month);
  }

  public static void future(String horoscope, String chineseHoroscope ,String age2) {
    System.out.println(horoscope);
    System.out.println(chineseHoroscope);
    System.out.println(age2);
  }
}


