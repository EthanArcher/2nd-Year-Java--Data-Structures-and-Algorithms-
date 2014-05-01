/*
 * Author: Ethan Archer
 * Student Number: 40076614
 * 
 */

import java.util.*;

public class UseOfSets
{

    public static void main(String[] args) 
    	{
        // Create the sets.
        String[] listA = {"Sally","Ann",  "Jill", "Sally", "Joe"};
        String[] listB = {"Bob", "Bill", "Ann", "Jill", "Sally"};
        Set<String> setA = new HashSet<String>();
        Set<String> setB = new HashSet<String>();
        Set<String> setC = new HashSet<String>();
        // Load sets from arrays.
        for (int i = 0; i < listA.length; i++) {
            setA.add(listA[i]);
        }
        for (int i = 0; i < listB.length; i++) {
            setB.add(listB[i]);
        }
        System.out.println("The 2 sets are: " + "\n" + "Set A : " + setA + "\n" + "Set B : " +setB);
        
        setC = UseOfSets.union(setA, setB);
        System.out.println("Items in set union are: " + setC);
        
        setC = UseOfSets.intersection(setA, setB);
        System.out.println("Items in set intersection are: " + setC);
        
        setC = UseOfSets.difference(setA, setB);
        System.out.println("Items in set difference are: " + setC);
        
        System.out.println("Is Set A a sub set of set B? : " + UseOfSets.subSet(setA, setB));
        
        if (UseOfSets.subSet(setA, setB) == false)
        {
        	System.out.println("setA is NOT a subset of setB");
        }
        else
        {
        	System.out.println("setA is a subset of setB");
        }
    }


    public static <E> Set<E> union(Set<E> a, Set<E> b) 
    {
    	Set<E> tempSet = new HashSet<E>();
    	tempSet.addAll(a);
    	tempSet.addAll(b);
    	return tempSet;
    }

    public static <E> Set<E> intersection(Set<E> a, Set<E> b) 
    {
    	Set<E> tempSet = new HashSet<E>();
    	tempSet.addAll(a);
    	tempSet.retainAll(b);
    	return tempSet;
    }

    public static <E> Set<E> difference(Set<E> a, Set<E> b) 
    {
    	Set<E> tempSet = new HashSet<E>();
    	tempSet.addAll(a);
    	tempSet.removeAll(b);
    	return tempSet;
    }

    public static <E> boolean subSet(Set<E> a, Set<E> b) 
    {
       if(b.containsAll(a))
       {
      	 return true;
       }
       else return false;
    }
   
}

