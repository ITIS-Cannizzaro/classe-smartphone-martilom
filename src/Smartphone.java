public class Smartphone {
	private String Marca;
	private String Modello;
	private double prezzoin;
	private double numPollici;
	private int Ram;
	private boolean touchscreen;
	private String Fascia;
	private String Tipo;
	
	public Smartphone(String Marca,String Modello,double prezzoin,double numPollici,int Ram,boolean touchscreen) {
		this.Marca=Marca;
		this.Modello=Modello;
		this.prezzoin=prezzoin;
		this.numPollici=numPollici;
		this.Ram=Ram;
		this.touchscreen=touchscreen;
	}
	
	public void FasciaPrezzo() {
		if (prezzoin>=500) {
			System.out.println("Fascia Alta");
			this.Fascia="Fascia Alta";
		}
		else if (prezzoin>=200&&prezzoin<500) {
			System.out.println("Fascia Media");
			this.Fascia="Fascia Media";
		}
		else if (prezzoin<200) {
			System.out.println("Fascia Bassa");
			this.Fascia="Fascia Bassa";
		}
	}
	
	public void Tipo() {
		if (numPollici>=7) {
			System.out.println("Maxi");
			this.Tipo="Maxi";
		}
		else if (numPollici>=5&&numPollici<7) {
			System.out.println("Normal");
			this.Tipo="Normal";
		}
		else if (numPollici>5) {
			System.out.println("Mini");
			this.Tipo="Mini";
		}
	}
	
	public void Tutto() {
		System.out.println("Il telefono è di marca "+this.Marca+", modello "+this.Modello+", e costa "+this.prezzoin+" Euro");
		System.out.println("Misura "+this.numPollici+" pollici e ha "+this.Ram+"GB di Ram");
		System.out.println("Touchscreen "+this.touchscreen);
		System.out.println("Il telefono è di "+this.Fascia+", e di tipo "+this.Tipo);
	}
}
