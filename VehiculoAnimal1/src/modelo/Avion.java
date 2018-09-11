package modelo;

public class Avion extends Vehiculo implements Volador
{
	private String nombre;

	public Avion()
	{
		// TODO Auto-generated constructor stub
		this.nombre = "Avion";

		this.despegar();
		this.aterrizar();
		this.volar();
		this.configurarTipo();
		this.mostrarTipo();
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setTipo(String nombre) 
	{
		this.nombre = nombre;
	}

	@Override
	public String despegar()
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = "Un " + this.nombre + " para despegar necesita pista";

		return solu;
	}

	@Override
	public String aterrizar() 
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = "Un " + this.nombre + " para aterrizar necesita bajar la velocidad";

		return solu;
	}

	@Override
	public String volar() 
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = "Un " + this.nombre + " para volar necesita 2 alas";

		return solu;
	}

	@Override
	public void configurarTipo()
	{
		// TODO Auto-generated method stub
		super.tipoTransporte = "Aereo";
	}

	@Override
	public String mostrarTipo()
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = "Un " + this.nombre + " es un tipo de transporte " + super.tipoTransporte;
		
		return solu;
	}
	
	public String imprimirDatos()
	{
		String solu = "";
		
		solu = this.getNombre() + this.despegar() + this.aterrizar() + this.volar() + this.mostrarTipo();
		return solu;
	}

}
