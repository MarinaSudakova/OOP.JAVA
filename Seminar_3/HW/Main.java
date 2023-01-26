package Seminar_3.HW;

public class Main {
    public static void main(String[] args) {
        LinkedLList<Integer> ll = new LinkedLList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(14);
        ll.add(8);

        for (Integer item : ll) {
            System.out.println(item);
        }
    }
}
