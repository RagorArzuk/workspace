package IntTree;

public class Main {

    public static void main(String[] args) {
        IntTree test = new IntTree(7);
        test.addNode(1);
        test.addNode(0);
        test.addNode(3);
        test.addNode(2);
        test.addNode(5);
        test.addNode(4);
        test.addNode(6);
        test.addNode(9);
        test.addNode(8);
        test.addNode(10);
        test.preOrder(test.getWurzel());
        test.PostOrder(test.getWurzel());
        test.InOrder(test.getWurzel());
        System.out.println(test.countNodes(test.getWurzel()));
        System.out.println(test.height(test.getWurzel()));
    }
}
