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

    public BTree(Object o){
        this.o = o;
    }

    public void preOrderNLR(){
        System.out.print(o + " ");
        if(leftBranch != null){ leftBranch.preOrderNLR();}
        if(rightBranch != null){ rightBranch.preOrderNLR();}
    }

    public void reversePreOrderNRL(){
        System.out.print(o + " ");
        if(rightBranch != null){ rightBranch.reversePreOrderNRL();}
        if(leftBranch != null){ leftBranch.reversePreOrderNRL();}
    }

    public void postOrderLRN(){
        if(leftBranch != null){ leftBranch.postOrderLRN();}
        if(rightBranch != null){ rightBranch.postOrderLRN();}
        System.out.print(o + " ");
    }

    public void reversePostOrderRLN(){
        if(rightBranch != null){ rightBranch.reversePostOrderRLN();}
        if(leftBranch != null){ leftBranch.reversePostOrderRLN();}
        System.out.print(o + " ");
    }

    public void inOrderLNR(){
        if(leftBranch != null){ leftBranch.inOrderLNR();}
        System.out.print(o + " ");
        if(rightBranch != null){ rightBranch.inOrderLNR();}
    }

    public void reverseInOrderRNL(){
        if(rightBranch != null){ rightBranch.reverseInOrderRNL();}
        System.out.print(o + " ");
        if(leftBranch != null){ leftBranch.reverseInOrderRNL();}
    }
}
