package pl.connectis.cschool.jcourse.collections.service;

import java.util.Collection;

import pl.connectis.cschool.jcourse.collections.domain.Cat;
import pl.connectis.cschool.jcourse.collections.stale.BreedCat;


public interface CatManager {
	void add(Cat cat);
	void remove(Cat cat);
	Collection<Cat> findByName(String name);
	Collection<Cat> findYoungerThan(int years);
	Collection<Cat> findByBreed(BreedCat breed);

}
