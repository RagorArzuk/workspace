package OrderedTree;


public class OrderedTree<T> {

    private class Node{
        T value;
        Node left, right;
    }
    
    private Node wurzel;
    
    public OrderedTree(T v) {
        wurzel = new Node();
        wurzel.value = v;
        wurzel.left = null;
        wurzel.right = null;
    }
    
    public Node findNext(Node n) {
        if(n==null)
            return null;
        else {
            findNext(n.left);
            if 
        }
    }
    
    public OrderedTree addNode(T v) {
        Node neu = new Node();
        neu.value = v;
        Node ref = new Node();
        ref = this.findNext(wurzel);
        if (ref.left==null)
            ref.left=neu;
        else
            if(ref.right==null)
                ref.right=neu;
        return this;
    }
    
    public Node getWurzel() {
        return wurzel;
    }
    
    public void preOrder(Node n) {
        if (n!=null) {
            System.out.println("PreOrder: " + n.value);
            preOrder(n.left);
            preOrder(n.right);
        }
    }
    
    public void PostOrder(Node n) {
        if (n!=null) {
            PostOrder(n.left);
            PostOrder(n.right);
            System.out.println("postOrder: " + n.value);
        }
    }
    
    public void InOrder(Node n) {
        if (n!=null) {
            InOrder(n.left);
            System.out.println("InOrder: " + n.value);
            InOrder(n.right);
        }
    }
    
    public int countNodes(Node n) {
        if(n==null)
            return 0;
        else
            return countNodes(n.left) + countNodes(n.right) + 1;
    }
    
    public int height(Node n) {
        if (n == null)
            return 0;
        else {
            int heightL = height(n.left) + 1;
            int heightR = height(n.right) + 1;
            if(heightL>heightR)
                return heightL;
            else
                return heightR;
        }
    }
}
