import java.util.ArrayList;

// tree node contains the value and right and left nodes information
public class InOrderTreeTraversal {
    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val, TreeNode right, TreeNode left){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
        // recursively calling left and right wrt traversal
    static void rec(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;

        rec(root.left, list);
        list.add(root.val);
        rec(root.right, list);
    }
        // calling the rec method for the confirmation
    public static ArrayList<Integer> inOrderTraversal(TreeNode root){
        ArrayList<Integer> list = new ArrayList<> ();

        rec(root, list);
        return list;
    }



    public static void main(String[] args) {

    }
}
