
// Implementing Hierarchical Inheritance

class Person
{
	Person()
	{
		System.out.println("Type : Human");
		System.out.println("Name : Clement");
	}
	void Person_1()
	{
		System.out.println("Gender : Male");
	}
}
class Character extends Person
{
	Character()
	{
		System.out.println("Hobbies : Gaming,Music");
	}
	void Character_1()
	{
		System.out.println("Ready To Mingle : Always");
	}
}
class Favourites extends Person
{
	Favourites()
	{
		System.out.println("Game : Need For Speed");
	}
	void Favourites_1()
	{
		System.out.println("Food : Shavarma");
	}
}
class Hierarchical_Inheritance
{
	public static void main(String args[])
	{
		Character Char = new Character();
		Char.Person_1();
		Char.Character_1();
		Favourites Fav =  new Favourites();
		Fav.Person_1();
		Fav.Favourites_1();
	}
}
