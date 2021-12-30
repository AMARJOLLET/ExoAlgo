package fr.eql.aiXXX.tp;

class Exercice09 extends InputExercice {
	public void pyramide() {
		String star = "*";
		String space = " ";
		int indexspace = 0;
		
		inputInt();
		
		for (int i = 1; i < Number*2; i += 2) {
			indexspace++;
			String repeatedstar = star.repeat(i);
			String repeatedSpace = space.repeat(Number - (indexspace));
			System.out.println(repeatedSpace + repeatedstar);
		}
	}

}
