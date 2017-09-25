package pl.connectis.cschool.jcourse.collections.utils;
import java.util.Comparator;

import pl.connectis.cschool.jcourse.collections.domain.Cat;
public class CatWiekComparator implements Comparator<Cat> {
	@Override
	public int compare(Cat o1, Cat o2) {
		return new Integer(o1.getWiek()).compareTo(o2.getWiek()); 
	}
}
