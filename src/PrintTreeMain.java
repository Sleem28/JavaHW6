//Реализовать печать бинарного дерева в скобочной форме: 1(3(31,511(202,nil)),2(4,5))
import Classes.BTree;
import Classes.BTreePrinter;


public class PrintTreeMain {

    public static void main(String[] args) {

        BTree left5 = new BTree(54);
        BTree left4 = new BTree(17);
        BTree right4 = new BTree(12);
        BTree right3 = new BTree(15);
        BTree left2 = new BTree(13,null,left5);
        BTree right2 = new BTree(11,left4,right4);
        BTree left1 = new BTree(5,null, right3);
        BTree right1 = new BTree(3,left2,right2);
        BTree root = new BTree(1, left1, right1);

        BTreePrinter printer = new BTreePrinter();
        printer.printTree(root,"");
    }
}
