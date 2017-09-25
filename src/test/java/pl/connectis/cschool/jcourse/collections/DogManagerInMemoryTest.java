package pl.connectis.cschool.jcourse.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import pl.connectis.cschool.jcourse.collections.domain.Dog;
import pl.connectis.cschool.jcourse.collections.service.DogManagerInMemory;
import pl.connectis.cschool.jcourse.collections.stale.BreedDog;

public class DogManagerInMemoryTest {
	 Set<Dog> h = new HashSet<Dog>(Arrays.asList(new Dog("Burek",1, BreedDog.Boxer), new Dog("Burek",20, BreedDog.Collie),new Dog("Reks",13, BreedDog.Spaniel)));
	 DogManagerInMemory dm = new DogManagerInMemory(h);
	
	List<Dog> hh = new ArrayList<Dog>(Arrays.asList(new Dog("Burek",1, BreedDog.Boxer), new Dog("Burek",20, BreedDog.Collie),new Dog("Reks", 13, BreedDog.Spaniel)));
	  
	@Test
	public void addTest(){
		dm.add(new Dog("Reksio",1, BreedDog.Spaniel));
		assertEquals(4, dm.getDb().size());
		
		
	}
	
	@Test
	public void findByNameTest(){
	 
	  boolean sprawdzenie = true;
	  
	  Collection<Dog> wynik = dm.findByName("Burek");
	  for(Dog dog : wynik){
		  
		  if(dog.getName().equals("Burek") ){
		  }
		  else 
			 sprawdzenie = false;
	  }
	  Collections.sort(hh);
	  
	  for(Dog dog : hh){
		  System.out.println(dog);
		  
	  }
	  
	  assertEquals(2, wynik.size());
	  assertTrue(sprawdzenie);
	  
	}
	
	@Test
	public void findYoungerThanTest(){
	 
	  boolean sprawdzenie = true;
	  
	  Collection<Dog> wynik = dm.findYoungerThan(14);
	
	  for(Dog dog : wynik){
		  if(dog.getWiek() < 14){
		  }
		  else 
			 sprawdzenie = false;
		  	
	  }
	  
	  assertEquals(2, wynik.size());
	  assertTrue(sprawdzenie);
	  
	}
	@Test
	public void findByBreedTest(){
	
	  boolean sprawdzenie = true;
	  
	  Collection<Dog> wynik = dm.findByBreed(BreedDog.Spaniel);
	  for(Dog dog : wynik){
		  if(dog.getBreed().equals(BreedDog.Spaniel)){
		  }
		  else 
			 sprawdzenie = false;
		     
	  }
	  
	  assertEquals(1, wynik.size());
	  assertTrue(sprawdzenie);
	  
	}
	@Test
	public void sortByWiekDogTest(){
	List<Dog> wzor = new ArrayList<Dog>(Arrays.asList(new Dog("Burek",1, BreedDog.Boxer),new Dog("Reks", 13, BreedDog.Spaniel), new Dog("Burek",20, BreedDog.Collie)));
	Collections.sort(hh);
	assertEquals(wzor, hh);
	}

	
}
