package tp2;

public class Imc {
	private double poids;
	private double taille;
	public Imc(double poids, double taille) {
		super();
		this.poids = poids;
		this.taille = taille;
	}
	
	double calacul()
	{
		double imc;
		return  imc=poids/(taille*taille);
	}
	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "Imc [poids=" + poids + ", taille=" + taille + "]";
	}
	
	

}
