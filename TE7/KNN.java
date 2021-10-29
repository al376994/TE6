package TE7;

public abstract class KNN {
	final public void templateMethod() {
		if (wantPrediction()) observarDatos();
		calcularDistancias();
		buscarVecinos();
		votar();
	}
	boolean wantPrediction() {
		return true;
	}

	abstract void observarDatos();

	private void calcularDistancias() {
		System.out.println("Calculando distancias");
	}

	private void buscarVecinos() {
		System.out.println("Encontrando vecinos");
	}

	abstract void votar();

}
