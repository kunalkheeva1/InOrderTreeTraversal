import java.util.ArrayList;

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

    static void rec(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;

        rec(root.left, list);
        list.add(root.val);
        rec(root.right, list);

    }



    public static void main(String[] args) {

    }
}
