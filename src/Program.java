
public class Program {
    public static void main(String[] args) {
        System.out.print("\033\143");
        NodeList list = new NodeList();
        System.out.println("Создем двусвязный список длиной 15 с рамдомными значениями");
        for (int i = 0; i < 15; i++) {
            int r = (int) (Math.random() * 100);
            Node node = new Node(r);

            if (i == 0) {
                list.head = node; // головной узел
            } else {
                list.head.append(node);
            }
            list.last = node; // хвостовой узел
        }

        System.out.println("Исходный список");
        System.out.println(list);
        System.out.println("Развернутый список");
        System.out.println(list.reverse());


    }
}

