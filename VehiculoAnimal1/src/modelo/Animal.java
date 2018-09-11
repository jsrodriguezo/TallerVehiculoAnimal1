package modelo;

public abstract class Animal
{
	protected String comida;
	
	public Animal()
	{
		this.comida = "";
	}
	
	public abstract void configurarComida();
	public abstract String mostrarComida();

}
