package structures;

public class BinarySearchTree {
    public class BinarySearchNode {
        public int key;
        BinarySearchNode left, right;

        public BinarySearchNode(int key) { this.key = key; }
    }

    public BinarySearchNode root;
    public BinarySearchTree() { root = null; }

    public BinarySearchNode Insert(int key, BinarySearchNode x) { 

        // Si x == null, encontramos el lugar
        if (x == null) { 
            x = new BinarySearchNode(key);

        // De lo contrario hay que bajar al siguiente nivel
        } else if (key < root.key) {
            x.left = Insert(key, x.left);

        } else if (key > root.key) {
            x.right = Insert(key, x.right);

        }

        return x;
    }

    public BinarySearchNode Search(int key, BinarySearchNode x) {
        // 1. Si llegamos al final del arbol o encontramos el nodo.
        if (x == null || x.key == key) 
            return x;

        // 2. Recursión por las ramas del arbol
        if (x.key > key) {
            return Search(key, x.left);
        } else {
            return Search(key, x.right);
        }
    }

    //
    // Traversal functions
    //
    public void InOrder(BinarySearchNode x) {
        if (x == null) return;

        InOrder(x.left);

        System.out.printf("%d ", x.key);

        InOrder(x.right);

    }

    public void PreOrder(BinarySearchNode x) {
        if (x == null) return;

        System.out.printf("%d ", x.key);

        PreOrder(x.left);
        PreOrder(x.right);

    }

    public void PostOrder(BinarySearchNode x) {
        if (x == null) return;

        PostOrder(x.left);
        PostOrder(x.right);

        System.out.printf("%d ", x.key);
    }
}
