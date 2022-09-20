import Classes.BTree;

public class DiffTreeTraversal {
    public static void main(String[] args) {
        BTree root = new BTree("F",
                                      new BTree("B",
                                                       new BTree("A"),
                                                       new BTree("D",
                                                                        new BTree("C"),
                                                                        new BTree("E"))),
                                      new BTree("G",
                                                       null,
                                                        new BTree("I",
                                                                         new BTree("H"),
                                                                          null)));

        System.out.print("Pre-order traversal -> ");
        root.preOrderNLR();
        System.out.print("\nPost-order traversal -> ");
        root.postOrderLRN();
        System.out.print("\nIn-order traversal -> ");
        root.inOrderLNR();
        System.out.print("\nReverse pre-order traversal -> ");
        root.reversePreOrderNRL();
        System.out.print("\nReverse post-order traversal -> ");
        root.reversePostOrderRLN();
        System.out.print("\nReverse in-order traversal -> ");
        root.reverseInOrderRNL();
    }
}
