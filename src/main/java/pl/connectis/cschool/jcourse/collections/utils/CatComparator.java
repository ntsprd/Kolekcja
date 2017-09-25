package pl.connectis.cschool.jcourse.collections.utils;

import java.util.Comparator;

import pl.connectis.cschool.jcourse.collections.domain.Cat;
import pl.connectis.cschool.jcourse.collections.stale.CatSortBy;

public class CatComparator {
	public Comparator<Cat> wyborComparatora(CatSortBy sortowanie) {
		  switch (sortowanie) {
		    case WIEK:
		  return new CatWiekComparator();
		      
		    case NAME: 
		    return new CatNameComperator();
		    default:	
		    return new CatNameComperator();
		 
		  }
		}
}
