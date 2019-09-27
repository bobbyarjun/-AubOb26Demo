package Inheritance2;

public class testhospetal {
public static void main(String args[]){
	Hospetal h1=new FortisHospetal();
			h1.scan();
	Hospetal h2=new GovtHospetal();
		h2.xray();
		FortisHospetal f1=new FortisHospetal();
		f1.scan();
		GovtHospetal g=new GovtHospetal();
		g.xray();
}
}
