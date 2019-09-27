package Inheritance2;

public class GovtHospetal implements Hospetal{
	public void scan(){
		System.out.println("Scannning in govt hospetal");
	}
	public void xray(){
		System.out.println("Xray in govt hospetal");
	}
	public void consult(){
		System.out.println("Consultation in govt hospetal");
	}
	void cost(){
		System.out.println("Cost is low");
	}
}
