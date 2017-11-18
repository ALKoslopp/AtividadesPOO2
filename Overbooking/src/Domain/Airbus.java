package Domain;


public class Airbus {
	
	private Voo voo;
	private int numeroLugares = 5;
	//private ArrayList<Integer> lugares = new ArrayList(numeroLugares);

    public int getNumeroLugares() {
        return numeroLugares;
    }

    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }
	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	
	
}