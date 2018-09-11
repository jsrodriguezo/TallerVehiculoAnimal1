package modelo;

public class Superman extends Kryptoniano implements Volador
{
	private String nombre;
	
	public Superman()
	{
		this.nombre = "Superman";
		
		this.despegar();
		this.aterrizar();
		this.volar();
		this.configurarTontada();
		this.mostrarTontada();
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

		solu = this.nombre + " salta y despega";
		
		return solu;
	}

	@Override
	public String aterrizar()
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = this.nombre + " amortigua su aterrizaje";
		
		return solu;
	}

	@Override
	public String volar() 
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = this.nombre + " utiliza sus habilidades para volar";
		
		return solu;
	}

	@Override
	public void configurarTontada() 
	{
		// TODO Auto-generated method stub
		super.tontada = "Batman";
	}

	@Override
	public String mostrarTontada()
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = this.nombre + " le da la tontada con " + super.tontada;
		
		return solu;
	}

	@Override
	public void configurarComida() 
	{
		// TODO Auto-generated method stub
		super.comida = "hamburguesas";
	}

	@Override
	public String mostrarComida()
	{
		// TODO Auto-generated method stub
		String solu = "";

		solu = this.nombre + " le encanta las " + super.comida;
		
		return solu;
	}
	
	public String saltarEdificios()
	{
		String solu = "";

		solu = this.nombre + " tiene la habilidad de saltar edificios";
		
		return solu;
	}
	
	public String detenerBalas()
	{
		String solu = "";

		solu = this.nombre + " tiene la habilidad de detener las balas enemigas";
		
		return solu;
	}
	
	public String imprimirDatos()
	{
		String solu = "";

		solu = this.getNombre() + this.despegar() + this.aterrizar() + this.volar() + this.mostrarTontada() + this.mostrarComida() + this.saltarEdificios() + this.detenerBalas(); 
		
		return solu;
	}
}
