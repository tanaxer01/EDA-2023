package repaso_examen.utils;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode from_list(int[] arr, int idx) {
        int izquierda = 2*idx + 1;
        int derecha   = 2*idx + 2;

        TreeNode root = new TreeNode(arr[idx]);

        if (izquierda < arr.length)
            root.left = from_list(arr, izquierda);

        if (derecha < arr.length)
            root.right = from_list(arr,  derecha);

        return root;
    }
}
