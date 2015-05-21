
public class BinaryTree<T> {

    class Node<ET>{
        ET key;
        Node<ET> left, right;
        
        Node(Node<ET> left, ET key, Node<ET> right){
            this.left = null;
            this.key = key;
            this.right = null;
        }
        
        public ET getKey() {
            return key;
        }
        
        public Node<ET> getLeft() {
            return left;
        }
        
        public Node<ET> getRight() {
            return right;
        }
        
        public void setKey(ET e) {
            key = e;
        }
        
        public void setLeft(Node<ET> node) {
            left = node;
        }
        
        public void setRight(Node<ET> node) {
            right = node;
        }
        
        }
    
    
        Node<T> root;
        int NoOfNodes; 
        
        public BinaryTree(){
            root = null;
            NoOfNodes = 0;
       }
        
        public boolean isEmpty() {
            return (NoOfNodes==0);
        }
        
        public Node<T> getRoot() {
            return root;
        }
        
        public int getNumber() {
            return NoOfNodes;
        }
        
        public int size(Node<T> node) {
            if (node==null)
                return 0;
            else {
                return (1+size(node.getLeft()) + size(node.getRight()));
            }
        }
        
        public void preOrder(Node<T> node) {
            if (node!=null) {
                System.out.println(node.key);
                preOrder(node.left);
                preOrder(node.right);
            }
        }
        
        public void inOrder(Node<T> node) {
            if(node!=null) {
                inOrder(node.left);
                System.out.println(node.key);
                inOrder(node.right);
            }
        }
        
        public void postOrder(Node<T> node) {
            if(node!=null) {
                postOrder(node.left);
                postOrder(node.right);
                System.out.println(node.key);
            }
        }
        
}
