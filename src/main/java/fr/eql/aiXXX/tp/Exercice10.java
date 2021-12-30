package fr.eql.aiXXX.tp;

import java.util.*;

class Exercice10 extends InputExercice {
	int nombreEssai = 5;
	int answer = (int) (Math.random() * 100);
	int Number = 100;
	boolean saisieValide = true;

	public void input() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		saisieValide = false;
		System.out.println("Il vous reste : " + nombreEssai + " tentatives");
		System.out.println("Choississez un nombre entre 0 et 99");
		while (!saisieValide) {
			inputInt();
			if (list.contains(Number) == false) {
				saisieValide = true;
			} else {
				System.out.println("Le nombre " + Number + " a déjà été saisie. Pour rappel, vous avez saisie " + list);

			}
		}
		list.add(Number);
	}

	public void game() {
		while (Number != answer && nombreEssai > 0) {
			input();
			if (Number < answer && nombreEssai > 1) {
				System.out.println("C'est plus grand");
			} else if (Number > answer && nombreEssai > 1) {
				System.out.println("C'est plus petit");
			} else if (Number == answer) {
				System.out.println("Bien ouej en " + (5 - nombreEssai) + " tentatives");
			}
			nombreEssai--;

		}
		if (nombreEssai == 0) {
			System.out.println("Dommage, c'était : " + answer);
		}
	}

}
