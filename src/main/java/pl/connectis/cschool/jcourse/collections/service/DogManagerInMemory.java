package pl.connectis.cschool.jcourse.collections.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import pl.connectis.cschool.jcourse.collections.domain.Dog;
import pl.connectis.cschool.jcourse.collections.stale.BreedDog;

public class DogManagerInMemory implements DogManager {
   
	private Collection<Dog> db; 
	
	public DogManagerInMemory() {
      this.db = new HashSet<>();
	}
	
	

	public DogManagerInMemory(Collection<Dog> db) {
		super();
		this.db = new HashSet<Dog>(db);
	}



	public Collection<Dog> getDb() {
		return db;
	}

	@Override
	public void add(Dog dog) {
		db.add(dog);

	}

	@Override
	public void remove(Dog dog) {
		db.remove(dog);

	}

	@Override
	public Collection<Dog> findByName(String name) {
		Set<Dog> nameResults = new HashSet<>();
		for(Dog dog : db){
			if(dog.getName() == name){
				nameResults.add(dog);
			}
		}
		return nameResults;
	}

	@Override
	public Collection<Dog> findYoungerThan(int years) {
		Set<Dog> yearsResults = new HashSet<>();
		for(Dog dog : db){
			if(dog.getWiek() < years){
				yearsResults.add(dog);
			}
		}
		return yearsResults;
		
	}

	@Override
	public Collection<Dog> findByBreed(BreedDog breed) {
		Set<Dog> breedResults = new HashSet<>();
		for(Dog dog : db){
			if(dog.getBreed() == breed){
				breedResults.add(dog);
			}
		}
		return breedResults;
	}

	public void setDb(Set<Dog> db) {
		this.db = db;
	}

}
