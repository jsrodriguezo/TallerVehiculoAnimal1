package modelo;

public class Helicoptero extends Avion
{
	private int helices;
	private String nombre;

	public Helicoptero()
	{
		this.helices = 2;
		this.nombre = "helicoptero";
		super.tipoTransporte = "Aereo";
	}

	public int getHelices() 
	{
		return helices;
	}

	public void setHelices(int helices) 
	{
		this.helices = helices;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String mostrarHelices()
	{
		String solu = "";

		solu = "Un " + this.nombre + " tiene " + this.helices + " helices";
		
		return solu;
	}
	
	public String mostrarTipo()
	{
		String solu = "";

		solu = "Un " + this.nombre + " es un tipo de transporte " + this.tipoTransporte;
		
		return solu;
	}
	
	public String imprimirDatos()
	{
		String solu = "";

		solu = this.getNombre() + this.mostrarHelices() + this.mostrarTipo();
				
		return solu;
	}
}
