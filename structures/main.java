package structures;

class Main {
    public static void GetKthLargest(int k, int[] nums, int[] adds) {
        KthLargest kth = new KthLargest(k, nums);
        
        for (int i: adds)
            System.out.println(kth.add(i));
    }
    
    public static void main(String[] args) {
        int nums[] = {4, 5, 8, 2};
        // int adds[] = {3, 5, 10, 9 , 4};
        // GetKthLargest(3, nums, adds);

        BinarySearchTree tree = new BinarySearchTree();
        for (int n: nums)
            tree.root = tree.Insert(n, tree.root);
            
        tree.InOrder(tree.root);
        System.out.print("\n");
    }
}
