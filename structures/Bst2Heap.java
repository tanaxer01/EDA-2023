package structures;

import structures.BinarySearchTree.BinarySearchNode;

import java.util.ArrayList;
import java.util.List;

public class Bst2Heap {
    private int index;

    public void solve1(BinarySearchTree tree) {
        this.index = 0;
        List<Integer> list = new ArrayList<>();
        BstToList(tree.root,  list);
        ListToHeap(tree.root, list);

        System.out.print("solve1: ");
        tree.PreOrder(tree.root);
        System.out.print("\n");
    }

    private static void BstToList(BinarySearchNode root, List<Integer> result) {
        // Caso base
        if (root == null) return;

        // Recorremos el arbol In Order.
        BstToList(root.left, result);

        result.add(root.key);

        BstToList(root.right, result);
    }

    private void ListToHeap(BinarySearchNode root, List<Integer> list) {
        // Caso base
        if (root == null) return;

        // Recorremos el arbol Pre Order.
        root.key = list.get(this.index++);

        ListToHeap(root.left , list);
        ListToHeap(root.right, list);
    }

    
    public void solve2(BinarySearchTree tree, int N) {
        MaxHeap heap = new MaxHeap(N);
        PostOrderAppend(tree.root, heap);

        System.out.printf("solve2: ");
        while (!heap.empty()) {
            System.out.printf("%d ", heap.extractMax());
        }
        System.out.printf("\n");
    }

    private static void PostOrderAppend(BinarySearchNode root, MaxHeap heap) {
        // Caso base
        if (root == null) return;

        PostOrderAppend(root.left, heap);
        PostOrderAppend(root.right, heap);

        heap.insert(root.key);
    }


    public static void main(String[] args) {
        Bst2Heap instance = new Bst2Heap();
        int nums[] = {4, 5, 8, 2};

        BinarySearchTree tree = new BinarySearchTree();
        for (int n: nums)
            tree.root = tree.Insert(n, tree.root);
            

        instance.solve1(tree);
        instance.solve2(tree, nums.length);
    }
    
}
