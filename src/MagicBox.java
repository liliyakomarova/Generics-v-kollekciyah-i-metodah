import java.util.Random;
public class MagicBox <T> {
    protected static T [] items;
    Random random = new Random();
    private T hull;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }
    public static boolean add(T item) {
        for (int i = 0; items.length > i; i++) {
            if (items[i] == hull) {
                items [i] = item;
                System.out.println("Добавлено: " + item);
                return true;
            }
        }
        return false;
    }
    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == hull) {
                throw new RuntimeException("Положи ещё, осталось доложить: " + (items.length - i));
            }
        }
        int randomInt = random.nextInt(items.length);
        return items [randomInt];
    }
}