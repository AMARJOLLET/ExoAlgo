package fr.eql.aiXXX.tp;

import java.util.*;

abstract class InputExercice {
	static int Number;
	static String str;
	static boolean isValid = false;
	static Scanner in = new Scanner(System.in);

	public static void inputInt() {
		while (!isValid) {
			try {
				System.out.println("Entrer un nombre");
				Number = in.nextInt();
				isValid = true;
			} catch (Exception e) {
				System.out.println("Erreur de Saisie");
			}
		}
	}
}
