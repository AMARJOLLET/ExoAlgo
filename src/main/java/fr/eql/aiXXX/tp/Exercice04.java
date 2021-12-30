package fr.eql.aiXXX.tp;

class Exercice04 extends InputExercice {
	public void ageEnfant() {
		System.out.println("Détermine la catégorie en fonction de l'age renseigné");
		inputInt();
		switch (Number) {
		case 6:
		case 7:
			System.out.println("Votre enfant de " + Number + " ans est un poussin");
			break;
		case 8:
		case 9:
			System.out.println("Votre enfant de " + Number + " ans est un pupille");
			break;
		case 10:
		case 11:
			System.out.println("Votre enfant de " + Number + " ans est un mimine");
			break;
		}
		if (Number >= 12) {
			System.out.println("Votre enfant de " + Number + " ans est un cadet");
		} else if (Number < 6) {
			System.out.println("Votre enfant est trop petit");
		}
	}
}
