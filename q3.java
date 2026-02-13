import java.util.ArrayList;
import java.util.Scanner;

public class q3 {

    class Node {
        Object data;
        Node left, right;

        Node(Object data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public ArrayList<String> allpaths() {
        ArrayList<String> result = new ArrayList<>();
        paths(root, "", result);
        return result;
    }

    private void paths(Node node, String path, ArrayList<String> result) {
        if (node == null)
            return;

        path += node.data.toString();

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        path += "->";
        paths(node.left, path, result);
        paths(node.right, path, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q3 tree = new q3();

        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("[]");
            return;
        }

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = tree.new Node(sc.next());
        }

        for (int i = 0; i < n; i++) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            if (l < n) nodes[i].left = nodes[l];
            if (r < n) nodes[i].right = nodes[r];
        }

        tree.root = nodes[0];

        System.out.println(tree.allpaths());
    }
}
