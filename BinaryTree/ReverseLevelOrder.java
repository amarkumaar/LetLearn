import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class ReverseLevelOrder {
    static class Node {
        Node leftNode, rightNode;
        int data;

        Node(int data) {
            this.data = data;
            leftNode = rightNode = null;
        }

    }

    static Node root;

    static void reverseOrder(Node root) {
        Vector<Integer> ans = new Vector<>();
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            ans.add(temp.data);

            if (temp.leftNode != null)
                q.add(temp.leftNode);
            if (temp.rightNode != null)
                q.add(temp.rightNode);
            q.poll();

        }

        Collections.reverse(ans);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.leftNode = new Node(20);
        root.rightNode = new Node(30);
        root.leftNode.leftNode = new Node(40);
        root.leftNode.rightNode = new Node(60);
        reverseOrder(root);
    }
}