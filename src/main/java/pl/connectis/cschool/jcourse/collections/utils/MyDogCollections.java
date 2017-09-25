package pl.connectis.cschool.jcourse.collections.utils;

import java.util.Iterator;

import pl.connectis.cschool.jcourse.collections.domain.Dog;

public class MyDogCollections implements Iterable<Dog> {
    
	private Dog[] dogs;
	
	
	
	public MyDogCollections(Dog[] dogs) {
		this.dogs = dogs;
	}



	@Override
	public Iterator<Dog> iterator() {
		
		return new DogIterator(dogs);
	}
	

}
