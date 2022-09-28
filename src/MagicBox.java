import java.util.Arrays;
import java.util.Random;
public class MagicBox <T> {
    protected T [] items;
    Random random = new Random();
    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }
    public boolean add(T item) {
        for (int i = 0; items.length > i; i++) {
            if (items[i] == null) {
                items [i] = item;
                System.out.println("Добавлено: " + item);
                return true;
            }
        }
        return false;
    }
    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Положи ещё, осталось доложить: " + (items.length - i));
            }
        }
        int randomInt = random.nextInt(items.length);
        return items [randomInt];
    }
}