public class Main {
    public static void main(String[] args) {
        System.out.println("Шляпа с отделениями: ");
        MagicBox <String> magicBox = new MagicBox<>(3);
        magicBox.add("Кролик");
        magicBox.add("Блёстки");
        magicBox.add("Шарфик");
        String pick = magicBox.pick();
        System.out.println("Волшебная шляпа: " + pick);

        System.out.println("Шляпа с цифрами: ");
        MagicBox<Integer> magicBox1 = new MagicBox<>(5);
        magicBox1.add(1);
        magicBox1.add(2);
        magicBox1.add(3);
        Integer pick1 = magicBox1.pick();
        System.out.println("Волшебная шляпа: " + pick1);
    }
}