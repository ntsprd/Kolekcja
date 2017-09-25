package pl.connectis.cschool.jcourse.collections.utils;

import java.util.Iterator;

import pl.connectis.cschool.jcourse.collections.domain.Dog;

public class DogIterator implements Iterator<Dog> {
    
	private Dog[] dogs;
	private int currentPosition = -1;
	
	
	
	public DogIterator(Dog[] dogs) {
		super();
		this.dogs = dogs;
	}

	@Override
	public boolean hasNext() {
		if((currentPosition + 1 < dogs.length) && (dogs[currentPosition +1 ] != null))
			return true;
		
		return false;
	}

	@Override
	public Dog next() {
		if(hasNext()){
			currentPosition++;
			return dogs[currentPosition];
		}
		return null;
	}

}
