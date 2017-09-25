package pl.connectis.cschool.jcourse.collections.service;

import java.util.Collection;

import pl.connectis.cschool.jcourse.collections.domain.Dog;
import pl.connectis.cschool.jcourse.collections.stale.BreedDog;

public interface DogManager {
	void add(Dog dog);
	void remove(Dog dog);
	Collection<Dog> findByName(String name);
	Collection<Dog> findYoungerThan(int years);
	Collection<Dog> findByBreed(BreedDog breed);

}
