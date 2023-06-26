//creating tree based on ArrayList..
import java.util.ArrayList;
public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data=data;
       children=new ArrayList<TreeNode>();
    }
    public void addChild(TreeNode node){
        children.add(node);
    }
    public String print(int level){
        String ret;
        ret="  ".repeat(level)+data+"\n";
        for(TreeNode node:children){
            ret=ret+node.print(level+1);
        }
        return ret;
    }

    public static void main(String[] args) {
        TreeNode hot=new TreeNode("Hot");
        TreeNode drinks=new TreeNode("Drinks");
        TreeNode soup=new TreeNode("Soup");

        TreeNode cold=new TreeNode("Cold");
        TreeNode vanilla=new TreeNode("Vanilla");


        drinks.addChild(hot);

        drinks.addChild(cold);
        cold.addChild(vanilla);
        hot.addChild(soup);
        System.out.println(drinks.print(2));
    }
}
