# Answers

## 1. Why does inorder traversal of a BST return elements in sorted order?


An inorder traversal visits nodes in the order left, root right. Since
values on the left side are smaller than ones on the right, the traversal will return a list
in ascending order.
---

## 2. Give an example of an insertion order that produces a highly unbalanced BST. What does the inorder traversal look like for that tree?



10, 70, 30, 20, 50

The inorder traversal of this tree would be 10, 20, 30, 40, 50

---

## 3. Differences in Traversal Types

### Recursive vs Iterative Traversal

Recursive traversal calls the method many times over while
the iterative loops through the tree and uses a data structure to keep track of the tree.

### Depth First vs Breadth First Traversal

Depth first traversal goes down as far as it can, then comes up and goes down for
the next node. Breadth first starts at the top, visits all the nodes there, then moves down a level until it hits
all the nodes in the tree.
---

## 4. When might you prefer a breadth-first traversal in a real application?

A map search application using nodes to hold location data might use breadth first traversal to display
locations closest to the user first, then go down to find ones father away.