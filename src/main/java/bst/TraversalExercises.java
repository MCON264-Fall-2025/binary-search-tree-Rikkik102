package bst;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversalExercises {

    // Iterative preorder using a stack
    public static <T extends Comparable<T>> List<T> preorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO: implement iterative preorder using Deque as a stack
        // Hint: push root; while stack not empty:
        //   pop node, visit it, then push right child, then left child
        Deque<TreeNode<T>> stack = new ArrayDeque<>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode<T> current = stack.pop();
            result.add(current.value);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return result;
    }

    // Iterative inorder using a stack
    public static <T extends Comparable<T>> List<T> inorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO: implement iterative inorder
        // Hint: use a pointer 'curr' and a stack:
        //   while (curr != null || !stack.isEmpty()) { ... }
        Deque<TreeNode<T>> stack = new ArrayDeque<>();
        TreeNode<T> curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.value);
            // Move to right subtree
            curr = curr.right;
        }
        return result;
    }

    // Optional / challenge: iterative postorder
    public static <T extends Comparable<T>> List<T> postorderIterative(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO (challenge): implement iterative postorder
        // You may use two stacks, or one stack with a previous-node pointer.
        return result;
    }

    // Practice version of level-order
    public static <T extends Comparable<T>> List<T> levelOrderUsingQueue(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        // TODO: implement BFS using a Queue<TreeNode<T>>
        Queue<TreeNode<T>> queue = new LinkedList<>();

        if (root == null) {
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.poll();
            result.add(current.value);

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
        return result;
    }
}

