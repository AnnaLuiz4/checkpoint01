package br.com.fiap.filmes.model;

public class Filmes {
private String name;
private int faixa_etaria;
private int ano;
private String categoria;
private String diretor;
private String pais_origem;

public Filmes() {
}


public Filmes(String name, int faixa_etaria, int ano, String categoria, String diretor, String pais_origem) {
	super();
	this.name = name;
	this.faixa_etaria = faixa_etaria;
	this.ano = ano;
	this.categoria = categoria;
	this.diretor = diretor;
	this.pais_origem = pais_origem;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getFaixa_etaria() {
	return faixa_etaria;
}
public void setFaixa_etaria(int faixa_etaria) {
	this.faixa_etaria = faixa_etaria;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public String getDiretor() {
	return diretor;
}
public void setDiretor(String diretor) {
	this.diretor = diretor;
}
public String getPais_origem() {
	return pais_origem;
}
public void setPais_origem(String pais_origem) {
	this.pais_origem = pais_origem;
}
}
