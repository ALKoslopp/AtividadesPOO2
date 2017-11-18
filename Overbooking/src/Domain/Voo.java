package Domain;

import java.util.ArrayList;

public class Voo {
	private Airbus ar;
	private static int id;
	//private ArrayList<Integer> lugar = new ArrayList();
        private static int instancias;
	
	public Voo() {
            geraId();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
        
        public int geraId(){
            if(this.id <= 0 || this.id > ar.getNumeroLugares()){
                return this.id++;
            } 
            else{
                return getId();
            }
        }
}