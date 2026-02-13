import java.util.Scanner;

public class q2 {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public int sumeven() {
        if (head == null)
            return 0;

        int sum = 0;
        Node temp = head;

        do {
            if (temp.data % 2 == 0) {
                sum += temp.data;
            }
            temp = temp.next;
        } while (temp != head);

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q2 list = new q2();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        System.out.println(list.sumeven());
    }
}
