/**
 * 
 */
package com.hakim.candy;

import java.util.Comparator;

/**
 * @author Kamilia_PC
 *
 */
public class ChildComaparator implements Comparator{
	

	@Override
	public int compare(Object n1, Object n2) {
		Child child1 = (Child) n1;
		Child child2 = (Child) n2;
	    if(child1.getRating()> child2.getRating()) return 1;
	    else if(child1.getRating()< child2.getRating()) return -1;
	    else return ( child1.equals(child2)? 0 : 1);
	}

}
