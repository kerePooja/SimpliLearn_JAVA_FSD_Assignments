package java_assignment;

import java.util.*;

public class Collection {
	
	    public static void main(String[] args) {
	        
	    	
	        System.out.println("ArrayList");
	        ArrayList<String> city=new ArrayList<String>();   
	          city.add("Bidar");//
	          city.add("Gulbarga");           
	          System.out.println(city);  
	        
	        
	          System.out.println("\nVector");
	          Vector<Integer> vec = new Vector();
	          vec.addElement(20); 
	          vec.addElement(20); 
	          System.out.println(vec);
	        
	       
	          System.out.println("\nLinkedList");
	          LinkedList<String> names=new LinkedList<String>();  
	          names.add("pooja");  
	          names.add("madhu");            
	          Iterator<String> itr=names.iterator();  
	          while(itr.hasNext()){  
	           System.out.println(itr.next());  
	           
	          
	           System.out.println("\nHashSet");
	           HashSet<Integer> set=new HashSet<Integer>();  
	           set.add(11);  
	           set.add(13);  
	           set.add(12);
	           set.add(14);
	           System.out.println(set);
	           
	          
	           System.out.println("\n");
	           System.out.println("LinkedHashSet");
	           LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	           set2.add(1);  
	           set2.add(2);  
	           set2.add(3);
	           set2.add(4);           
	           System.out.println(set2);  
	          }
	
	       }  
	  }


