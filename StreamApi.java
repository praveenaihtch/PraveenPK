package Julycode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {
	public static void main(String ar[]) {
	  //find the missing number in array?

         // List<Integer> li = Arrays.asList(13,13,6,8,14,3,2,6,8);
		     int l1[]= {3,5,2,4,5,12,17};
		     int min = Arrays.stream(l1).min().getAsInt();
		     int max = Arrays.stream(l1).max().getAsInt();
		     Set<Integer> create = new HashSet<>();
		     for(int i=min;i<=max;i++) {
		    	create.add(i);
		     }
		     Set<Integer> delete = new HashSet<>();
		     for(int kl : l1) {
		    	 delete.add(kl);
		     }
		     create.removeAll(delete);
		     System.out.println(create);
	} 

}
