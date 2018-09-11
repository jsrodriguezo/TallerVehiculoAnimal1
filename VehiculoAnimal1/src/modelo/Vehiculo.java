package modelo;

public abstract class Vehiculo 
{
	protected String tipoTransporte;
	
	public Vehiculo()
	{
		tipoTransporte = " ";
	}
	
	public abstract void configurarTipo();
	public abstract String mostrarTipo();
}
