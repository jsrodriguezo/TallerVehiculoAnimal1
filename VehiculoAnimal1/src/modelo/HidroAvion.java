package modelo;

public class HidroAvion extends Avion
{
	private int baseFlotantes;
	private String nombre;
	
	public HidroAvion()
	{
		this.nombre = "Hidroavion";
		this.baseFlotantes = 2;
		super.tipoTransporte = "Aereo";
	}

	public int getBaseFlotantes() 
	{
		return baseFlotantes;
	}

	public void setBaseFlotantes(int baseFlotantes) 
	{
		this.baseFlotantes = baseFlotantes;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String mostrarFlotadores()
	{
		String solu = "";

		solu = "Un " + this.nombre + " tiene " + this.baseFlotantes;
		
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

		solu = this.getNombre() + this.mostrarFlotadores() + this.mostrarTipo();
		
		return solu;
	}
}