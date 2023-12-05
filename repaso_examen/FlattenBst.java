package repaso_examen;

import repaso_examen.utils.TreeNode;

public class FlattenBst {
    static void flatten(TreeNode root) {

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 2, 4, 5, 7};
        TreeNode tree = TreeNode.from_list(arr, 0);

        flatten(tree);
        
    }
}
