/**
 * 
 */
package com.hakim.candy;

import java.util.*;

/**
 * @author Kamilia_PC
 *
 */
public class CandyApp {

	public Integer findTheNumberOfCandy (List<Child> childList){
		TreeSet<Child> sortedChilds = new TreeSet<Child>(new ChildComaparator());
		sortedChilds.addAll(childList);
		childList.clear();
		childList.addAll(sortedChilds);
		for(int i = 1; i< childList.size();i++){
			if(childList.get(i).getRating()>childList.get(i-1).getRating()){
				childList.get(i).setCandyAmount(i+1);
				if(childList.get(i-1).getCandyAmount().equals(null)){
					childList.get(i-1).setCandyAmount(i);
				}
				
			}else{
				childList.get(i).setCandyAmount(i);
				childList.get(i-1).setCandyAmount(i);
			}
		}
		Integer candyTotal = 0;
		for (int k = 0; k<childList.size();k++){
			candyTotal+= childList.get(k).getCandyAmount();
		}
		System.out.println(childList);
		
		return candyTotal;
		
	}
	public static void main(String[] args) {
		CandyApp cApp = new CandyApp();
		List<Child> list = new ArrayList<Child>();
		list.add(new Child("Lilo",0));
		list.add(new Child("Bino",0));
		list.add(new Child("Fino",6));
		list.add(new Child("Rano",2));
		list.add(new Child("Pamo",4));
		
		Integer res = cApp.findTheNumberOfCandy(list);
		System.out.println(res);
		
	}

}
