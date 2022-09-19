package Classes;

public class BTree {
    public Object o;
    public BTree leftBranch;
    public BTree rightBranch;

    public BTree(Object o, BTree leftBranch, BTree rightBranch){
        this.o = o;
        this.leftBranch = leftBranch;
        this.rightBranch = rightBranch;
    }
}
