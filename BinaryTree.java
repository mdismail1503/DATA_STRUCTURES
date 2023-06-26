import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;


public class BinaryTree {
    BinaryNode root;

    BinaryTree() {
        this.root = null;

    }

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        BinaryNode n1 = new BinaryNode();
        n1.value = "N1";
        BinaryNode n2 = new BinaryNode();
        n2.value = "N2";
        BinaryNode n3 = new BinaryNode();
        n3.value = "N3";
        BinaryNode n4 = new BinaryNode();
        n4.value = "N4";
        BinaryNode n5 = new BinaryNode();
        n5.value = "N5";
        BinaryNode n6 = new BinaryNode();
        n6.value = "N6";
        BinaryNode n7 = new BinaryNode();
        n7.value = "N7";
        BinaryNode n8 = new BinaryNode();
        n8.value = "N8";
        BinaryNode n9 = new BinaryNode();
        n9.value = "N9";

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        n4.left = n8;
        n4.right = n9;

        binaryTree.root = n1;

        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        binaryTree.levelOrder();
        binaryTree.search();
        System.out.println();

        binaryTree.deleteDeepestNode();
        binaryTree.deleteDeepestNode();
        binaryTree.deleteNode("N2");
        System.out.println();
        binaryTree.levelOrder();

        binaryTree.levelOrder();
        System.out.println("--".repeat(30));



    }

    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(BinaryNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    void postOrder(BinaryNode node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    void levelOrder() {
        if(root==null){
            System.out.println("Emtpty tree");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    void search() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (Objects.equals(presentNode.value, "Nfs4")) {
                System.out.println("value found");

                break;
            }
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);

            }
        }
         {
            System.out.println("not found");
        }

    }
    void insert(String nodeValue){
        BinaryNode node=new BinaryNode();
        node.value=nodeValue;
        if(root==null)
        {
            root=node;
        }
        else{
          Queue <BinaryNode> q=new LinkedList<>();
          q.add(root);
          while(!q.isEmpty()){
              BinaryNode b=q.remove();
              if(b.left==null){
                  b.left=node;
                  q.add(b.left);
                  break;
              }
               else if (b.right==null){
                  b.right=node;
                  q.add(b.right);
                  break;
              }
          }
        }
        System.out.println("node inserted");
    }

    //get deepest node
  public BinaryNode getDeepestNode(){
        Queue<BinaryNode> q=new LinkedList<>();
        q.add(root);
      BinaryNode presentNode=null;
        while(!q.isEmpty()){
             presentNode=q.remove();
            if(presentNode.left!=null){
                q.add(presentNode.left);
            }
            if(presentNode.right!=null){
                q.add(presentNode.right);
            }
        }
        return presentNode;
  }

  public void deleteDeepestNode(){
      Queue<BinaryNode> q=new LinkedList<>();
      q.add(root);
      BinaryNode presentNode=null;
      BinaryNode previousNode=null;
      while(!q.isEmpty()){
          previousNode=presentNode;
          presentNode=q.remove();
          if(presentNode.left==null){
              previousNode.right=null;
              return;
          }
          else if(presentNode.right==null){
              presentNode.left=null;
              return;
          }
          q.add(presentNode.left);
          q.add(presentNode.right);
      }
  }
  void deleteNode(String value){
      Queue<BinaryNode> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
          BinaryNode present=q.remove();
          if(present.value==value){
              present.value=getDeepestNode().value;
              deleteDeepestNode();
              System.out.println("Deleted Successfully");
              return;
          }
          q.add(present.left);
          q.add(present.right);
      }
      System.out.println("The node doesn't exist");

  }


void deleteEntireTree(){
 this.root=null;
    System.out.println("The tree has deleted successfully");
}

}
    class BinaryNode {
        String value;
        BinaryNode left;
        BinaryNode right;
        int height;

    }


