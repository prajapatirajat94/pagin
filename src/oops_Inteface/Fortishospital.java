package oops_Inteface;

public class Fortishospital extends Medicaltest implements Medicalindia,USmedical {

	@Override
	public void phsioUS() {
		System.out.println("US ------>physio");
		
	}

	@Override
	public void orthoUS() {
		System.out.println("US ------>orthoUS");
		
	}

	@Override
	public void cardioIndia() {
		System.out.println("India ------>cradioIndia");
		
	}

	@Override
	public void leverindia() {
		System.out.println("India ------>LiverIndia");
		
	}

	@Override
	public void Covidtest() {
		System.out.println("Medicalorg------>Covid-19 test");
	}

}
