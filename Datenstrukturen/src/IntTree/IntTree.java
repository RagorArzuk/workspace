package IntTree;
//Ein Binärbaum, der Integerwerte der Größe nach ordnet.

public class IntTree {
    
    private class Node{
        private int value;
        private Node left, right;
    }
    
    private Node wurzel;
    
    public IntTree(int n) {
        wurzel = new Node();
        wurzel.value = n;
        wurzel.left = null;
        wurzel.right = null;
    }
    
    public Node nextNode(Node n, int v) {
        if(n.value>v && n.left == null)
            return n;
        else
            if(n.value>v && n.left != null)
                return nextNode(n.left, v);
            else
                if(n.value<v && n.right==null)
                    return n;
                else
                    if(n.value<v && n.right!=null)
                        return nextNode(n.right, v);
                    else
                       return null;
    }
    
    public IntTree addNode(int v) {
        Node neu = new Node();
        neu.value = v;
//        wurzel steht alleine
        if (wurzel.left==null && wurzel.right==null) {
            if(wurzel.value > v)
                wurzel.left = neu;
            else
                if(wurzel.value < v)
                    wurzel.right = neu;
        }   
            else
//                neu steht mitten im Baum.
            {
                Node ref = new Node();
                ref = this.nextNode(wurzel, v);
                System.out.println("Ref.value = " + ref.value);
                if(ref.value > v)
                    ref.left = neu;
                else
                    ref.right = neu;
            }
        
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
