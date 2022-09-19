package Classes;

public class BTreePrinter {
    public void printTree(BTree tree, String space) {
        if (tree != null) {
            System.out.print(space + tree.o);
            if(tree.leftBranch != null || tree.rightBranch != null){
                System.out.print("(");
                printTree(tree.leftBranch, space);
                System.out.print(",");
                printTree(tree.rightBranch, space);
                System.out.print(")");
            }
        }else{
            System.out.print("null");
        }
    }
}
