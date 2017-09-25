package pl.connectis.cschool.jcourse.collections;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import pl.connectis.cschool.jcourse.collections.domain.Dog;
import pl.connectis.cschool.jcourse.collections.stale.BreedDog;
import pl.connectis.cschool.jcourse.collections.utils.MyDogCollections;

public class DogCollectionsTest {
	
	MyDogCollections dogCollections;
	
	@Test
	public void emptyCollectionsTest(){
		Dog[] dogs = new Dog[5];
		dogCollections = new MyDogCollections(dogs);
		assertFalse(dogCollections.iterator().hasNext());
	}
	
	@Test
	public void notEmptyCollectionsTest(){
 		Dog[] dogs = new Dog[]{ new Dog("Reksio",31, BreedDog.Collie), new Dog("Burek",10, BreedDog.Boxer), new Dog("Szarik",1, BreedDog.Terrier)};
		dogCollections = new MyDogCollections(dogs);
		Iterator<Dog> dogIterator = dogCollections.iterator();
		for(Dog dog : dogCollections){
			dog.bark();
		}
		assertTrue(dogIterator.hasNext());
		assertNotNull(dogIterator.next());
	}

}
