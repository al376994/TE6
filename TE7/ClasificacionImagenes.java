package TE7;

public class ClasificacionImagenes extends KNN {

	@Override
	boolean wantPrediction() {
		return false;
	}

	@Override
	void observarDatos() {
		System.out.println("Looking at the SATELITE IMAGE data");
	}

	@Override
	void votar() {
		System.out.println("Labeling SATELITE IMAGES");
	}
}
