package pl.connectis.cschool.jcourse.collections.utils;

import java.util.Comparator;

import pl.connectis.cschool.jcourse.collections.domain.Cat;

public class CatNameComperator implements Comparator<Cat> {
	@Override
	public int compare(Cat o1, Cat o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
