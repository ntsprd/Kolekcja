package pl.connectis.cschool.jcourse.collections;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import pl.connectis.cschool.jcourse.collections.domain.Cat;
import pl.connectis.cschool.jcourse.collections.domain.Dog;
import pl.connectis.cschool.jcourse.collections.service.CatManagerInMemory;
import pl.connectis.cschool.jcourse.collections.stale.BreedCat;
import pl.connectis.cschool.jcourse.collections.stale.BreedDog;
import pl.connectis.cschool.jcourse.collections.stale.CatSortBy;
import pl.connectis.cschool.jcourse.collections.utils.CatComparator;
import pl.connectis.cschool.jcourse.collections.utils.CatNameComperator;


public class CatTest {
	 Set<Cat> h = new HashSet<Cat>(Arrays.asList(new Cat("Filemon",1, BreedCat.DACHOWIEC), new Cat("Mruczek",20, BreedCat.ROSYJSKI),new Cat("Tom",13, BreedCat.SZKOCKI)));
	 CatManagerInMemory dm = new CatManagerInMemory(h);
	 
	 List<Cat> hh = new ArrayList<Cat>(Arrays.asList( new Cat("Mruczek",20, BreedCat.ROSYJSKI),new Cat("Filemon",1, BreedCat.DACHOWIEC),new Cat("Tom",13, BreedCat.SZKOCKI)));
	 
	 @Test
		public void addTest(){
			dm.add(new Cat("Kajtek",1, BreedCat.SYJAMSKI));
			assertEquals(4, dm.getDb().size());
			
			
		}
	 @Test
		public void sortNameTest(){
		 List<Cat> wzor = new ArrayList<Cat>(Arrays.asList(new Cat("Filemon",1, BreedCat.DACHOWIEC), new Cat("Mruczek",20, BreedCat.ROSYJSKI),new Cat("Tom",13, BreedCat.SZKOCKI)));
		 Comparator<Cat> dp = new CatComparator().wyborComparatora(CatSortBy.NAME);
		 
		 hh.sort(dp);
		 assertEquals(wzor, hh);
		}
	 @Test
		public void sortWiekTest(){
		 List<Cat> wzor = new ArrayList<Cat>(Arrays.asList(new Cat("Filemon",1, BreedCat.DACHOWIEC),new Cat("Tom",13, BreedCat.SZKOCKI), new Cat("Mruczek",20, BreedCat.ROSYJSKI)));
		 Comparator<Cat> dp = new CatComparator().wyborComparatora(CatSortBy.WIEK);
		 
		 hh.sort(dp);
		 assertEquals(wzor, hh);
		}

}
