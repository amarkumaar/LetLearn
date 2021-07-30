import java.util.*;
public class PrintPath {
    static class Node {
        Node left , right ;
        int data;
        Node(int data){
            this.data= data;
            left= right= null;
        }
    }
    static Node root;
    static void solve(Node root, Vector<Integer> path , int k){

        if(root==null)
        return;
        path.add(root.data);
        solve(root.left, path, k);
        solve(root.right, path, k);
        int f=0;
        for(int j = path.size()-1;j>=0;j--){
            f+=path.get(j);
            if(f==k){
                for(int m = j ; m<path.size();m++){
                    System.out.print(path.get(m)+" ");
                }
                System.out.println();
            }
        }
        

     path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(-1);
		root.left.left = new Node(2);
		root.right.left = new Node(4);
		root.left.right = new Node(1);
        root.right.right = new Node(5);
        int k =5 ;
        Vector<Integer> path = new Vector<>();
        solve(root, path, k);
    }
}