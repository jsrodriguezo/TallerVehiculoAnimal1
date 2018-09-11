package modelo;

public abstract class Kryptoniano extends Animal
{
	protected String tontada;
	
	public Kryptoniano()
	{
		this.tontada = "";
	}
	
	public abstract void configurarTontada();
	public abstract String mostrarTontada();
}
