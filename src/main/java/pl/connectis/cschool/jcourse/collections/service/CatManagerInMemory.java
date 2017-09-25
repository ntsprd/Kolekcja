package pl.connectis.cschool.jcourse.collections.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import pl.connectis.cschool.jcourse.collections.domain.Cat;
import pl.connectis.cschool.jcourse.collections.stale.BreedCat;

public class CatManagerInMemory implements CatManager {
private Collection<Cat> db; 
	
	public CatManagerInMemory() {
      this.db = new HashSet<>();
	}
	
	

	public CatManagerInMemory(Collection<Cat> db) {
		super();
		this.db = new HashSet<Cat>(db);
	}



	public Collection<Cat> getDb() {
		return db;
	}

	@Override
	public void add(Cat cat) {
		db.add(cat);

	}

	@Override
	public void remove(Cat cat) {
		db.remove(cat);

	}

	@Override
	public Collection<Cat> findByName(String name) {
		Set<Cat> nameResults = new HashSet<>();
		for(Cat cat : db){
			if(cat.getName() == name){
				nameResults.add(cat);
			}
		}
		return nameResults;
	}

	@Override
	public Collection<Cat> findYoungerThan(int years) {
		Set<Cat> yearsResults = new HashSet<>();
		for(Cat cat : db){
			if(cat.getWiek() < years){
				yearsResults.add(cat);
			}
		}
		return yearsResults;
		
	}

	@Override
	public Collection<Cat> findByBreed(BreedCat breed) {
		Set<Cat> breedResults = new HashSet<>();
		for(Cat cat : db){
			if(cat.getBreed() == breed){
				breedResults.add(cat);
			}
		}
		return breedResults;
	}

	public void setDb(Set<Cat> db) {
		this.db = db;
	}
}
