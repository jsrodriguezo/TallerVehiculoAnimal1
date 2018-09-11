package modelo;

public class Mundo
{
	private Avion avion;
	private Helicoptero heli;
	private HidroAvion hidro;
	private Pajaro pajaro;
	private Superman superman;
	
	public Mundo()
	{
		avion = new Avion();
		heli = new Helicoptero();
		hidro = new HidroAvion();
		pajaro = new Pajaro();
		superman = new Superman();
	}

	public Avion getAvion() 
	{
		return avion;
	}

	public void setAvion(Avion avion)
	{
		this.avion = avion;
	}

	public Helicoptero getHeli()
	{
		return heli;
	}

	public void setHeli(Helicoptero heli) 
	{
		this.heli = heli;
	}

	public HidroAvion getHidro() 
	{
		return hidro;
	}

	public void setHidro(HidroAvion hidro) 
	{
		this.hidro = hidro;
	}

	public Pajaro getPajaro() 
	{
		return pajaro;
	}

	public void setPajaro(Pajaro pajaro) 
	{
		this.pajaro = pajaro;
	}

	public Superman getSuperman() 
	{
		return superman;
	}

	public void setSuperman(Superman superman) 
	{
		this.superman = superman;
	}
	
	
}
