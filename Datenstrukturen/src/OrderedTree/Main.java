package OrderedTree;

import IntTree.IntTree;

public class Main {
    public static void main(String[] args) {
        OrderedTree<Integer> test = new OrderedTree(5);
        
        test.addNode(1);
        test.addNode(2);
        test.addNode(4);
        test.addNode(6);
//        Bis hierher hat der Baum die Höhe 3.
        test.addNode(8);
//        test.addNode(9);
        
        test.preOrder(test.getWurzel());
        test.PostOrder(test.getWurzel());
        test.InOrder(test.getWurzel());
        System.out.println(test.countNodes(test.getWurzel()));
        System.out.println(test.height(test.getWurzel()));
    }
}
