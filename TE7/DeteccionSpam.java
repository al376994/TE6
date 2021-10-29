package TE7;

public class DeteccionSpam extends KNN {


	@Override
	void observarDatos() {
		System.out.println("Looking at the SPAM data");
	}

	@Override
	void votar() {
		System.out.println("Labeling SPAM");
	}
}
