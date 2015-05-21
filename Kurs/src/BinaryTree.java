
public class BinaryTree {
    public class BinaryNode{
        int key;
        BinaryNode left;
        BinaryNode right;
        
        BinaryNode(BinaryNode left, int key, BinaryNode right){
            this.left=left;
            this.key = key;
            this.right = right;
        }
        
        public boolean member(int x) {
            if(key==x) return true;
            else
                if (x<key) 
                    if(left==null) return false;
                    else
                        return left.member(x);
                
                else 
                    if (right==null)
                        return false;
                    else
                        return right.member(x);
        }
        
        public BinaryNode insert(int x) {
            
            
            
            if (x==key) {
                return this;
            }
            else {
                if (x<key)
                    if (left==null) {
                        left = new BinaryNode(null, x, null);
                        
                        return left;
                    }
                    else return left.insert(x);
                else
                    if(right==null) {
                        right = new BinaryNode(null, x, null);
                        
                        return right;
                    }
                    else return right.insert(x);
                        
            }
        }
    }
        BinaryNode root;
        int NoOfNodes;
        
        BinaryTree(int x){
            root = new BinaryNode(null, x, null);
            
            NoOfNodes = 0;
        }
        
        public BinaryNode getRoot() {
            return root;
        }
        
        
        
        
        public static void preOrder(BinaryNode t) {
            if(t!=null) {
                System.out.println(t.key);
                preOrder(t.left);
                preOrder(t.right);
            }
        }
    
}
