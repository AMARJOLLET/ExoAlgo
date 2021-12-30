package fr.eql.aiXXX.tp;

class Exercice01 extends InputExercice {
	public void signe() {
		System.out.println("Determine si le nombre est positif ou négatif");
		inputInt();
		if (Number > 0) {
			System.out.println("Votre nombre : " + Number + " est positif");
		} else if (Number < 0) {
			System.out.println("Votre nombre : " + Number + " est négatif");
		} else {
			System.out.println("Votre nombre : " + Number + " est ni positif ni négatif");
		}
	}
}
