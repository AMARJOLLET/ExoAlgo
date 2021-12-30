package fr.eql.aiXXX.tp;

public class TestExo extends InputExercice {
	public static void main(String[] args) {
		int numeroExo;

		do {
			System.out.println("Numero de l'exo ?");
			numeroExo = in.nextInt();
		} while (numeroExo > 12 || numeroExo < 0);

		switch (numeroExo) {
		case 1:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice01 exo1 = new Exercice01();
			exo1.signe();
			break;
		case 2:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice02 exo2 = new Exercice02();
			exo2.pairImpair();
			break;
		case 3:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice03 exo3 = new Exercice03();
			exo3.pairImpair();
			break;

		case 4:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice04 exo = new Exercice04();
			exo.ageEnfant();
			break;

		case 5:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice05 exo5 = new Exercice05();
			exo5.entry();
			exo5.superCalculatorInput();
			exo5.superCalculatoroperation();
			break;

		case 6:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice06 exo6 = new Exercice06();
			exo6.suiteNombre();
			break;

		case 7:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice07 exo7 = new Exercice07();
			exo7.suiteTableNombre();
			break;

		case 8:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice08 exo8 = new Exercice08();
			exo8.produitEntier();
			break;

		case 9:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice09 exo9 = new Exercice09();
			exo9.pyramide();
			break;

		case 10:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice10 exo10 = new Exercice10();
			exo10.game();			
			break;

		case 11:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice11 exo11 = new Exercice11();
			exo11.NIM();			

			break;

		case 12:
			System.out.println("***** CHARGEMENT DE L'EXO " + numeroExo + "*****");
			Exercice12 exo12 = new Exercice12();
			exo12.trianglePacal();
			break;

		}
	}
}
