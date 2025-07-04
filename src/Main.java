public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト",40);
        System.out.println(h.getName() + "の現在のHP：" + h.hp);
        King k = new King();
        k.talk(h);
        h.sleep();
        System.out.println(h.getName() + "の現在のHP：" + h.hp);
        System.out.println(h.getName() + "は、眠って回復した！");
        Matango m = new Matango('A');
        h.attack(m);

    }
}