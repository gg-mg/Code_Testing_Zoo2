package main;

public class Animal {

	boolean isOrganic;
	String name;

	enum AnimalNames {
		Panda, Kangaroo, Elephant, Lion, Monkey, Platypus
	};

	public void setOrganicNature(boolean b) {
		isOrganic = b;
	}

	public boolean getOrganicNature() {
		return isOrganic;
	}

	public void setName(String string) {
		AnimalNames[] names = AnimalNames.values();
		for (AnimalNames name : names)
		{
			if (name.toString().equals(string))
			{
				this.name = string;
				break;
			}
			else
			{
				this.name = "Invalid Name";
			}
		}
	}

	public String getName() {
		return name;
	}

}
