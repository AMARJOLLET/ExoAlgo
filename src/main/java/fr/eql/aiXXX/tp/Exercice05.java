package fr.eql.aiXXX.tp;

class Exercice05 extends InputExercice {
	boolean isValid;
	long a;
	long b;
	double result;

	public void entry() {
		while (!isValid) {
			System.out.println("Votre login ?");
			String login = in.nextLine();
			System.out.println("Votre mdp ?");
			String mdp = in.nextLine();

			if (login.equals("admin") && mdp.equals("123Soleil")) {
				System.out.println("Bienvenue " + login);
				isValid = true;
			} else {
				System.out.println("Login/mdp invalide");
			}
		}
	}

	public void superCalculatorInput() {
		System.out.println("Vous êtes sur le Super Calculator");
		System.out.println("Deux nombres doivent être saisie");
		inputInt();
		a = Number;
		inputInt();
		b = Number;
	}

	public void superCalculatoroperation() {
		System.out.println("Voulez vous une addition, soustraction, multiplication ou une division ?");
		String operation = in.nextLine();

		switch (operation) {
		case "addition":
			result = a + b;
			break;
		case "soustraction":
			result = a - b;
			break;
		case "multiplication":
			result = a * b;
			break;
		case "division":
			try {
				result = (double) a / b;
			} catch (ArithmeticException e) {
				System.out.println("On ne peut faire une division par 0");
			}
			break;
		default:
			System.out.println("Pas compris");
		}
		System.out.println(operation + " de " + a + " et " + b + " = " + result);

	}
}