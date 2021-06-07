public class HomeWorkApp {
    public static void main (String[] args) {;
    PrintThreeWords();
    checkSumSign();
    PrintColor();
    compareNumbers();

    }

    public static void PrintThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    public static void checkSumSign(){
        int a = -70, b = 65, c = a + b;

        if (c >= 0)
        System.out.println("Сумма положительная");
        else if (c < 0);
        System.out.println ("Сумма отрицательная");
    }

    public static void PrintColor() {
        char value = 'v';
        int v = -15;
        if (v <= 0) {
            System.out.println("Красный");
        } else if (0 < v && v >= 100) {
            System.out.print("Желтый");
        } else if (v > 100) {
            System.out.print("Зеленый");
        }
    }

    public static void compareNumbers() {
    int a = 7, b = 17;
    if (a >= b)
        System.out.print("a >= b");
    else if (a<b)
        System.out.print("a < b");

    }
}
