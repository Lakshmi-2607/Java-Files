class Node
{
int data;
Node left, right;
public Node(int item)
{
data = item;
left = right = null;
}
}
class BinaryTree
 {
Node root;
BinaryTree()
{
root = null;
}
void inorder(Node node) 
{
if (node == null) 
return;
inorder(node.left);
System.out.print(node.data + " ");
inorder(node.right);
}
void preorder(Node node) 
{
if (node == null) 
return;
System.out.print(node.data + " ");
preorder(node.left);
preorder(node.right);
 }
void postorder(Node node) 
{
if (node == null) return;
postorder(node.left);
postorder(node.right);
System.out.print(node.data + " ");
}
void inorder() 
{ inorder(root); 
}
void preorder() 
{ preorder(root);
 }
void postorder() 
{ postorder(root);
 }
public static void main(String[] args) 
{
BinaryTree bt = new BinaryTree();
bt.root = new Node(1);
bt.root.left = new Node(2);
bt.root.right = new Node(3);
bt.root.left.left = new Node(4);
bt.root.left.right = new Node(5);
bt.root.right.left = new Node(6);
bt.root.right.right = new Node(7);
System.out.println("\nInorder traversal:");
bt.inorder();
System.out.println("\nPreorder traversal:");
bt.preorder();
System.out.println("\nPostorder traversal:");
bt.postorder();
}
}