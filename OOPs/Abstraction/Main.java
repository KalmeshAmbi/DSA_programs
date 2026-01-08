package OOPs.Abstraction;

public class Main {
	public static void main (String []args) {
		Son son = new Son();
		son.career();
		son.likes();
		Daughter daughter = new Daughter();
		daughter.career();
		daughter.likes();
		Parent daughters = new Daughter();
		daughters.career();
		daughters.likes();
	}

}
