package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador
{
	private Mundo bd;
	private Interfaz gui;
	
	public Controlador()
	{
		bd = new Mundo();
		gui = new Interfaz();
		
		gui.mostrarAvion(bd.getAvion().imprimirDatos());
		gui.mostrarHelicoptero(bd.getHeli().imprimirDatos());
		gui.mostrarHidroavion(bd.getHidro().imprimirDatos());
		gui.mostrarPajaro(bd.getPajaro().imprimirDatos());
		gui.mostrarSuperman(bd.getSuperman().imprimirDatos());
	}
}
