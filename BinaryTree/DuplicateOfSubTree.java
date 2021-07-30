import java.util.HashMap;
import java.util.Map;



public class DuplicateOfSubTree {
    static class Node{
        Node rNode , lNode ;
         int data;
         Node(int data){
             this.data =data;
             lNode = rNode= null;

         }
    }
    static Node root;
    static Map<String, Integer> m ;
    static String solve(Node root){
        if(root==null)
        return "";
        String s ="(";
        if(root.lNode==null && root.rNode==null)
        return s;
        s+=Integer.toString(root.data);
        s+=solve(root.lNode);
        s+=solve(root.rNode);
        s+=")";
        if(m.get(s)!=null && m.get(s)==1)
        System.out.print(root.data+" ");
        if(m.containsKey(s))
        m.put(s, m.get(s)+1);
        else
        m.put(s, 1);

        return s;
    }
    static void dupLicate(Node root){
        m = new HashMap<>();
        solve(root);
    }
    public static void main(String[] args) {
        root = new Node(2);
		root.lNode = new Node(2);
		root.rNode = new Node(2);
		root.lNode.lNode = new Node(3);
        root.rNode.lNode = new Node(3);
        dupLicate(root);
    }
}