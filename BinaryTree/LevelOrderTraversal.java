import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

class LevelOrderTraversal {
    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root;

    static Vector<Integer> levelOrder(Node root) {
        Vector<Integer> ans = new Vector<>();
        if (root == null)
            return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            ans.add(temp.data);
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
            q.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        root= new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        root.left.left = new Node(40);
        root.left.right= new Node(60);
        System.out.println(levelOrder(root));
    }

}