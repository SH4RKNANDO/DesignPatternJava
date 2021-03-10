package be.heh.isims.ihm.tp1.ex1;

class Number implements IExpression {

	private int value;

	/* Default Builder */
	public Number(int value){
		this.value = value;
	}

	/* Getter / Setter */
	public void setValue(int value){ this.value = value; }
	public int getValue() { return this.value; }

	public int evaluate() { return this.value; }
}