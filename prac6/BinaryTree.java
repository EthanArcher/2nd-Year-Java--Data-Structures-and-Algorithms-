/*
 * Author: Ethan Archer
 * Student Number: 40076614
 * 
 */

import java.io.*;

public class BinaryTree
{
	BinaryTreeNode root;

	public void insertNode(int d)
	{
		if (root == null)
			root=new BinaryTreeNode(d);								// if no tree then creates a new tree
		else
			root.insert(d);														// insert in correct position
	}

	/* call the recursive inorder method
 	 *beginning the traversal at the root
     */ 	
	
	public void inOrderTraversal()
	{
		inOrder(root);
	}
	
	/*perform an inorder traversal
	 *@param n a Tree Node
	 */
	
	private void inOrder(BinaryTreeNode n)
	{
		if(n != null)
		{
			inOrder(n.left);
			System.out.print(n.getNodeData()+" ");
			inOrder(n.right);
		}
	}
	
	/* call the recursive preorder method
 	 *beginning the traversal at the root
     */ 
	
	public void preOrderTraversal()
	{
		preOrder(root);
	}
	
	/*perform a preorder traversal
	 *@param n a Tree Node
	 */
	private void preOrder(BinaryTreeNode n)
	{
		if (n != null)
		{
			System.out.print(n.getNodeData() + " ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	
	/* call the recursive minValue method
 	 *beginning the traversal at the root
     */ 
	public void findMinValue()
	{
		minValue(root);
	}
	
	/*find the min value in the tree
	 *@param n a Tree Node
	 */
	private void minValue(BinaryTreeNode n)
	{
		if (n == null)																		// if empty tree
		{
			System.out.println("Tree is empty");
		}
		if (n.left == null)																// if there is no left tree
		{
			System.out.println("Min Value is " + n.getNodeData());
		}
		else minValue(n.left);														// else run recursive with left tree
	}
	
	/* call the recursive maxValue method
 	 *beginning the traversal at the root
     */ 
	public void findMaxValue()
	{
		maxValue(root);
	}
	
	/*find the max value in the tree
	 *@param n a Tree Node
	 */
	private void maxValue(BinaryTreeNode n)
	{
		if (n == null)																		// if empty tree
		{
			System.out.println("Tree is empty");
		}
		if (n.right == null)																// if there is no right tree
		{
			System.out.println("Max Value is " + n.getNodeData());
		}
		else maxValue(n.right);														// else run recursive with right tree
	}
	
	/* call the recursive searchTree method
 	 *beginning the traversal at the root
 	 *@param i the value being searched for
     */ 
	public BinaryTreeNode searchTree(int i)
	{
		searchTree(root, i);
		return root;
	}
	
	/*find the if the value is in the tree
	 *@param n a Tree Node
	 *@param i the value being searched for
	 */
	private BinaryTreeNode searchTree(BinaryTreeNode n, int i)
	{
		if (i < n.getNodeData())												// if value is less than current node
		{
			if (n.left != null)														// if there is a left tree
			{
				searchTree(n.left, i);											// recursive search the left tree for i
			}
			else 																					// if not there
			{
				System.out.println(i + " was not found");		// print not found
				return null;
			}
		}
			
		else if (i > n.getNodeData())												// if value is more than current node
		{
			if (n.right != null)															// if there is a right tree
			{
				searchTree(n.right, i);													// recursive search the right tree for i
			}
			else 																							// if not there
			{
				System.out.println(i + " was not found");				// print not found
				return null;
			}
		}

		else if (i == n.getNodeData())											// if the value is equal
		{
			System.out.println(i + " was found");							// print was found
			return n;
		}
		return n;

	}

}