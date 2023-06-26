import com.array.tree.BinaryTree;
import com.bst.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
//        BinaryTree bt=new BinaryTree(9);
//        bt.insert("N1");
//        bt.insert("N2");
//        bt.insert("N3");
//        bt.insert("N4");
//        bt.insert("N5");
//        bt.insert("N6");
//        bt.insert("N7");
//        bt.insert("N8");
//        bt.insert("N9");
//
//       bt.preOrder(1);
//        System.out.println();
//        bt.inOrder(1);
//        System.out.println();
//        bt.postOrder(1);
//        System.out.println();
//        bt.levelOrder();
//        System.out.println();
//        bt.deleteNode("N1");
//        bt.levelOrder();
//        System.out.println(bt.lastUsedIndex);

BinarySearchTree bst=new BinarySearchTree();
bst.insert(70);
bst.insert(50);
bst.insert(90);
        bst.insert(100);
        bst.insert(80);
bst.insert(30);
        bst.insert(40);
        bst.insert(20);
        bst.insert(10);
        bst.insert(60);
        bst.search(90);



bst.levelOrder();

    }
}