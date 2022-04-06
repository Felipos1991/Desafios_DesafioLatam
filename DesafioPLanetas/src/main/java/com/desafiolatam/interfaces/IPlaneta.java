package com.desafiolatam.interfaces;

import java.util.ArrayList;

import com.desafiolatam.models.Luna;

public interface IPlaneta {

	public String getNombre_planeta();

	public void setNombre_planeta(String nombre_planeta);

	public int getDistanciaSol();

	public void setDistanciaSol(int distanciaSol);

	public int getDiametro();

	public void setDiametro(int diametro);

	public ArrayList<Luna> getLunas();

	public void setLunas(ArrayList<Luna> lunas);
}
