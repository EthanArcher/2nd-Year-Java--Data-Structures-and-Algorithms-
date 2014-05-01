/*
 * Author: Ethan Archer
 * Student Number: 40076614
 * 
 */

public class Practical6test {
	
	public static void main (String[] args)
	{
		BinaryTree tree = new BinaryTree();		//binarytree tree
		BinaryTree B = new BinaryTree();			//binarytree B
		BinaryTree B1 = new BinaryTree();			//binarytree B1
		Practical6test prac6 = new Practical6test();
		
//  **** inserts values into B1 and prints them inOrder *****			
		
		tree.insertNode(50);									// adding values to tree
		tree.insertNode(13);
		tree.insertNode(15);
		tree.insertNode(17);
		tree.insertNode(77);
		tree.insertNode(57);
		tree.insertNode(67);
		tree.insertNode(85);
		tree.insertNode(87);
		tree.insertNode(38);
		tree.insertNode(28);
		tree.insertNode(79);
		tree.insertNode(29);
		tree.insertNode(43);
		tree.insertNode(6);
		tree.insertNode(103);							// adding values to tree
		tree.inOrderTraversal();					// print values inOrder
		
//  *********************************************************					
		
		System.out.println(" ");
		tree.preOrderTraversal();					// print values preOrder
		System.out.println(" ");
		tree.findMinValue();							// print min value
		tree.findMaxValue();							// print max values
		tree.searchTree(7);								// search for 7
		tree.searchTree(79);							// search for 79
	
		
//  **** inserts values into B1 and prints them inOrder *****				
		B.insertNode(50);									
		B.insertNode(13);
		B.insertNode(15);
		B.insertNode(17);
		B.inOrderTraversal();							
		System.out.println(" ");
//  *********************************************************				
		
//  **** inserts values into B1 and prints them inOrder *****			
//		B1.insertNode(50);							
//		B1.insertNode(13);
//		B1.insertNode(15);
//		B1.insertNode(17);
//		B1.inOrderTraversal();					
//  *********************************************************			
		
//  **** inserts values into B1 and prints them inOrder *****			
		B1.insertNode(50);							
		B1.insertNode(13);
		B1.insertNode(15);
		B1.insertNode(79);
		B1.insertNode(29);
		B1.insertNode(43);
		B1.insertNode(6);
		B1.insertNode(103);							
		B1.inOrderTraversal();					
		System.out.println(" ");		
//  *********************************************************		
		
		prac6.compareTrees(B, B1);					// compare trees, print identical or not identical
		
	}
	
	/* call the recursive compareTree method
 	 *beginning the traversal at the root of each tree
 	 *@param B the first binary tree
 	 *@param B1 the tree its being compared to
     */ 
	public boolean compareTrees(BinaryTree B, BinaryTree B1)
	{
		if ((compareTrees(B.root, B1.root)) == false)				// checks returned outgoing if false
		{
			System.out.println("Not Identical");							// print not identical
			return false;
		}
		else																								// checks returned outgoing if true
		{
			System.out.println("Identical");									// print identical
			return true;
		}
	}
	
	/*find the if all the values are the same in both trees
	 *@param n1 the node from the first tree
	 *@param n2 the node from the second tree
	 *@param outgoing tells if was same or not
	 */
	boolean outgoing;
	private boolean compareTrees(BinaryTreeNode n1, BinaryTreeNode n2)
	{
		if ((n1 != null) && (n2 != null))											// if the trees are not empty
		{
			if (n1.getNodeData() == n2.getNodeData())						// if the values held are the same
			{
				outgoing = true;																	// outgoing is true
				
				if ((n1.left != null) && (n2.left != null))				// if both these tress then have left trees
				{
					compareTrees(n1.left, n2.left);									// recursive compareTrees method on left trees
				}
				else if ((n1.right != null) && (n2.right != null))// if both these tress then have right trees
				{
					compareTrees(n1.right, n2.right);								// recursive compareTrees method on right trees
				}
			}	
			else if (n1.getNodeData() != n2.getNodeData())			// if data held is different
			{
				outgoing = false;																	// outgoing is false
			}
		}
		if ((n1 != null) && (n2 == null)) return false;				// if one is empty 
		else if ((n1 == null) && (n2 != null)) return false;	// if the other is empty
		else if ((n1 == null) && (n2 == null)) return true;		// if both are empty

		return outgoing;																			// returns outgoing
	}

}
