package pl.connectis.cschool.jcourse.collections.domain;

import pl.connectis.cschool.jcourse.collections.stale.BreedDog;

public class Dog implements Comparable<Dog>{
	private String name;
	private int wiek;
	private BreedDog breed;
	
	
	
	public Dog(String name, int wiek, BreedDog breed) {
		this.name = name;
		this.wiek = wiek;
		this.breed = breed;
	}

	public void bark(){
		System.out.println("Dog " + name + " is barking");
	}

	public String getName() {
		return name;
	}

	public int getWiek() {
		return wiek;
	}

	public BreedDog getBreed() {
		return breed;
	}

	@Override
	public int compareTo(Dog x) {
		if(wiek > x.getWiek() ){
			return 1;
			
		} else if (wiek < x.getWiek()){
			return -1;
		} else{
			return 0;
		}
		
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", wiek=" + wiek + ", breed=" + breed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + wiek;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (breed != other.breed)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wiek != other.wiek)
			return false;
		return true;
	}
	
	

	
	
	
	
	

}
