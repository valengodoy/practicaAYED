package POO;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plat;
	private String color;
	private int peso;
	private boolean asientos_cuero, climatizador;
	
	
	
	public 	Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plat = 500;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return "El color del auto es " + color;
 	}
	
	
	public String dime_datos() {
		return "La plataforma del vehiculo tiene " +ruedas + " ruedas. Mide "
				+ largo/1000 + " metros con un ancho de "+ ancho +
				"scm y un peso de platafomra de " + peso_plat + " kilos";
		
	}	
	
	public void configura_Asientos(String asientos_cuero) { //setter
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		}
		else {
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos() {
		if(asientos_cuero == true) {
			return("El auto tiene asientos de cuero");
		}
		else
			return("El auto no tiene asientos de cuero");
	}
	
	
	
	public void configura_climatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador = true;
		}
		else {
			this.climatizador = false;
		}
		
	}
	
	public String dime_climatizador() {
		if(climatizador = true) {
			return "El auto tiene climatizador";
		}
		else {
			return "El auto no tiene climatizador";
		}
	}
	

	public String getLargo() {
		return "El largo del auto es " + largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}


	public String getPeso() { //setter + getter
		int pesoc = 500;
		peso = peso_plat + pesoc;
		if(asientos_cuero == true) {
			peso += 50;
		}
		if(climatizador == true) {
			peso += 20; 
		}
		return "El peso del auto es " + peso; 
		
	}
	
	public int precio_coche(){
		int precio_final = 10000;
		if(asientos_cuero == true) {
			precio_final += 1500;
		}
		return precio_final;
		
	}
	


}



