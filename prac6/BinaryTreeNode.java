/*
 * Author: Ethan Archer
 * Student Number: 40076614
 * 
 */

class BinaryTreeNode
{
BinaryTreeNode left;
private int data;
BinaryTreeNode right;

public BinaryTreeNode (int i)
	{
	data = i;
	right = left = null;
	}

/* creates a node for new data and inserts
 *it in the correct position.  If d is less than data then insert into the left, 
 *if d is greater than data then insert into the right.  If the value of left or 
 *right is null then you have found the position to put d.
 *@param d the data to be inserted
 */	
public void insert(int d)
{
	if (d < data)												// if incoming number is less than the node its at
	{
		if (left == null)									// and there is no left tree
		{
			left = new BinaryTreeNode(d);		// creates a new left tree
		}
		else left.insert(d);							// recursive call for insert if value in tree
	}
	else if (d > data)									// if incoming number is greater than the node its at
	{
		if (right == null)								// and there is no right tree
		{
			right = new BinaryTreeNode(d);	// creates a new right tree
		}
		else right.insert(d);							// recursive call for insert 
	}
}
	
/*return the value of data in a given node
 *@returns the data in the Node
*/
	public int getNodeData()
	{ 	
		return data;
	}

}
