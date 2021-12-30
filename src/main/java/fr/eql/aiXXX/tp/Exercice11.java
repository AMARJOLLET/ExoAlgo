package fr.eql.aiXXX.tp;

class Exercice11 extends InputExercice {
	int totalAllumette;
	int randomAllumette;
	int nombreAllumette;
	boolean gameContinue;
	String Premier;

	public void joueur1() {
		int tricherie = 1;
		System.out.println("Il reste : " + totalAllumette
				+ " allumettes \n Tour du joueur \n Combien d'allumettes veux tu retirer ?");
		while (tricherie == 1) {
			nombreAllumette = in.nextInt();
			if (nombreAllumette <= 3 && nombreAllumette > 0) {
				tricherie = 0;
			} else {
				System.out.println("Veuillez entrer un chiffre entre 1 et 3 !");
			}
		}
		totalAllumette = totalAllumette - nombreAllumette;
		if (totalAllumette == 0) {
			System.out.println("Le joueur a gagné");
		}
	}

	public void autowinPC() {
		if ((totalAllumette - 1) % 4 == 0) {
			randomAllumette = 1;
		} else if ((totalAllumette - 2) % 4 == 0) {
			randomAllumette = 2;
		} else if ((totalAllumette - 3) % 4 == 0) {
			randomAllumette = 3;
		} else if (totalAllumette == 0) {
		} else {
			randomAllumette = 1;
		}
		totalAllumette = totalAllumette - randomAllumette;
		System.out.println("Le Pc enlève " + randomAllumette + " allumettes");

		if (totalAllumette == 0) {
			System.out.println("Le PC a gagné");
		}
	}

	public void randomPC() {
		randomAllumette = (int) (Math.random() * 3) + 1;
		switch (totalAllumette) {
		case 3:
			randomAllumette = 3;
			break;
		case 2:
			randomAllumette = 2;
			break;
		case 1:
			randomAllumette = 1;
			break;
		}
		totalAllumette = totalAllumette - randomAllumette;
		if (totalAllumette == 0) {
			System.out.println("Le PC a gagné");
		}

	}

	public void NIM() {
		gameContinue = false;

		while (!gameContinue) {
			try {
				System.out.println("Qui commence : (MOI/PC)");
				Premier = in.nextLine();
				if (Premier.equals("MOI") || Premier.equals("PC")) {
					gameContinue = true;
				} else {
					System.out.println("Erreur de saisie");
				}

			} catch (Exception e) {
				System.out.println("Erreur de saisie");
			}
		}
		System.out.println("Nombre d'allumettes pour la partie");
		totalAllumette = in.nextInt();
		System.out.println("Il faut retirer entre 1 et 3 allumettes");
		while (totalAllumette > 0) {
			if (Premier.equals("MOI")) {
				if (totalAllumette > 0) {
					joueur1();
				}
				if (totalAllumette > 0) {
					autowinPC();
				}
			} else {
				if (totalAllumette > 0) {
					randomPC();
					System.out.println("Le Pc enlève " + randomAllumette + " allumettes");
				}
				if (totalAllumette > 0) {
					joueur1();
				}
			}
		}
	}
}