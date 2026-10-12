public class Test3 {

    public static void main(String[] args) {
        CircularQueue<String> maFile;
        maFile = new CircularQueue<String>(7);

        maFile.enqueue("A");
        maFile.enqueue("B");
        maFile.enqueue("C");
        maFile.enqueue("D");

        System.out.println("Ma file est : " + maFile);
        System.out.print("Ma file est aussi : ");
        printIterator(maFile.iterator());
        System.out.println();

        System.out.println();

        maFile.dequeue();
        maFile.dequeue();
        maFile.dequeue();

        maFile.enqueue("E");
        maFile.enqueue("F");
        maFile.enqueue("G");

        System.out.println("Ma file est maintenant : " + maFile);
        System.out.print("Ma file est maintenant aussi: ");
        printIterator(maFile.iterator());
        System.out.println();
    }

    public static void printIterator(Iterator<?> iterator) {
        if (iterator.hasNext()) {
            System.out.print("[");
            System.out.print(iterator.next());
        }

        while (iterator.hasNext()) {
            System.out.print(", " + iterator.next());
        }
        System.out.print("]");
    }
}