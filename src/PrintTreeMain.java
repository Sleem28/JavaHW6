//Реализовать печать бинарного дерева в скобочной форме: 1(3(31,511(202,nil)),2(4,5))
import Classes.BTree;
import Classes.BTreePrinter;

public class PrintTreeMain {

    public static void main(String[] args) {

        BTree<Integer> left5 = new BTree<Integer>(54);
        BTree<Integer> left4 = new BTree<Integer>(17);
        BTree<Integer> right4 = new BTree<Integer>(12);
        BTree<Integer> right3 = new BTree<Integer>(15);
        BTree<Integer> left2 = new BTree<Integer>(13,null,left5);
        BTree<Integer> right2 = new BTree<Integer>(11,left4,right4);
        BTree<Integer> left1 = new BTree<Integer>(5,null, right3);
        BTree<Integer> right1 = new BTree<Integer>(3,left2,right2);
        BTree<Integer> root = new BTree<Integer>(1, left1, right1);

        BTreePrinter printer = new BTreePrinter();
        printer.printTree(root,"");
    }
}
