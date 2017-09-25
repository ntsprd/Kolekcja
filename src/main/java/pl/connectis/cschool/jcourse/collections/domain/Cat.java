package pl.connectis.cschool.jcourse.collections.domain;

import pl.connectis.cschool.jcourse.collections.stale.BreedCat;

public class Cat {
	private String name;
	private int wiek;
	private BreedCat breed;
	
	
	
	public Cat(String name, int wiek, BreedCat breed) {
		
		this.name = name;
		this.wiek = wiek;
		this.breed = breed;
	}

	

	public String getName() {
		return name;
	}



	public int getWiek() {
		return wiek;
	}



	public BreedCat getBreed() {
		return breed;
	}



	public void meow(){
		System.out.println("Cat " + name + " is meowing ");
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
		Cat other = (Cat) obj;
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
