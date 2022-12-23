import java.io.PrintStream;

public class Print {

    // Печать с новой строки:
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // Новая строка от содержания зависит
    public static void print() {
        System.out.println();
    }

    // Вывод без разрыва строки:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }

    // Си-подобный:
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
