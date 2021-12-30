package fr.eql.aiXXX.tp;

class Exercice03 extends InputExercice {
	public void pairImpair() {
		System.out.println("Division par 2 si le nombre est pair / Triplé du nombre+1 si impair");
		inputInt();
		if (Number % 2 == 0) {
			Number = Number / 2;
			System.out.println("Votre nombre pair a été divisé par 2 : " + Number);
		} else {
			Number = (int) Math.pow(Number + 1, 3);
			System.out.println("Votre nombre impair +1 a été triplé  : " + Number);
		}
	}
}
