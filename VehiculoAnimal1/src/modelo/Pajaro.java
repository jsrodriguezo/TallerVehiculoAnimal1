package modelo;

public class Pajaro extends Animal implements Volador
{
	private String construirNido;
	private int ponerHuevos;
	private String nombre;
	
	public Pajaro()
	{
		this.construirNido = "arboles";
		this.ponerHuevos = 4;
		this.nombre = "pajaro";
		
		this.despegar();
		this.aterrizar();
		this.volar();
		this.configurarComida();
		this.mostrarComida();
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	@Override
	public String despegar()
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = "Un " + this.nombre + " abre las alas para despegar";
		
		return solu;
	}

	@Override
	public String aterrizar()
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = "Un " + this.nombre + " amortigua su aterrizaje";
		
		return solu;
	}

	@Override
	public String volar() 
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = "Un " + this.nombre + " se prepara para volar";
		
		return solu;
	}

	@Override
	public void configurarComida() 
	{
		// TODO Auto-generated method stub
		super.comida = "Semillas";
	}

	@Override
	public String mostrarComida()
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = "Un " + this.nombre + " se alimenta de " + super.comida;
		
		return solu;
	}
	
	public String construirNido()
	{
		String solu = "";

		solu = "Un " + this.nombre + " contruye su nido sobre los " + this.construirNido;
		
		return solu;
	}
	
	public String imprimirDatos()
	{
		String solu = "";

		solu = this.getNombre() +this.despegar() + this.aterrizar() + this.volar() + this.mostrarComida() + this.ponerHuevos;
		
		return solu;
	}
}
