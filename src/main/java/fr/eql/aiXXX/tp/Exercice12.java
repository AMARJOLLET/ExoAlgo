package fr.eql.aiXXX.tp;

class Exercice12 extends InputExercice {
	int space;
	int value;

	public void trianglePacal(){
		
		inputInt();
		space = (Number/2);
		if (space%2 != 0) {
			space = space +1;
		}
		
		
		for (int i = 0; i < Number; i++) {
			value = 1;
	        System.out.format("%"+(Number-i)*(space/2)+"s","");

			for (int j = 0; j <= i; j++) {
				System.out.format("%"+space+"d",value);
				value = value * (i - j) / (j + 1);

			}
			System.out.println();
		}
	}
}