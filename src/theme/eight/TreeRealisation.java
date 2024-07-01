package theme.eight;

// Задание 1
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public Node search(Node root, int value) {
        if (root == null || root.value == value) {
            return root;
        }

        if (value < root.value) {
            return search(root.left, value);
        }

        return search(root.right, value);
    }

    public Node delete(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.value) {
            root.left = delete(root.left, value);
        } else if (value > root.value) {
            root.right = delete(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.value = minValue(root.right);
            root.right = delete(root.right, root.value);
        }

        return root;
    }

    private int minValue(Node node) {
        int minVal = node.value;
        while (node.left != null) {
            minVal = node.left.value;
            node = node.left;
        }
        return minVal;
    }
}

class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        Node foundNode = bst.search(bst.root, 40);
        if (foundNode != null) {
            System.out.println("Узел найден: " + foundNode.value);
        }

        bst.root = bst.delete(bst.root, 40);
        foundNode = bst.search(bst.root, 40);
        if (foundNode == null) {
            System.out.println("Узел удален успешно");
        }
    }
}
