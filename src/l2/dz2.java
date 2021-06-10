package l2;

public class dz2 {

    public static void main(String[] args) {

    System.out.println("task1 - " + Task1(12,3));
    System.out.println("_______________");
    Task2 (30);
    System.out.println("_______________");
    Task3 (-12);
    System.out.println("_______________");
    Task4("hi", 7);
    System.out.println("_______________");
    Task5(1989);
    System.out.println("_______________");
    }


    public static boolean Task1(int A, int B) {
        return (A + B <= 20) && (A + B >= 10);
    }
        public static void Task2(int count) {
        if (count >= 0) {
            System.out.println(count + "+");
        }
        else {
            System.out.println(count + "-");
        }
        }
    public static boolean Task3 (int count) {
        return count <=0;
    }
    public static void Task4 (String value, int count) {
        for (int a = 1; a < count; a++) {
            System.out.println ("Str #" + a + "- " + value);
        }
    }
    public static boolean Task5 (int visyear){
        return (visyear % 4 == 0) && (visyear % 100 != 0) || (visyear % 400 == 0);
    }
}

