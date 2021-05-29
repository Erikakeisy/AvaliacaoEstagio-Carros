package com.compassouol.projeto.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topicos {
    
    @Id
	private String chassi;
    private String marca;
	private Date anoFabricacao;
	private String cor;
	private Double valor;

    public Topicos() {
	}
	public String getChassi() {
		return chassi;
		
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Date anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	private String nome;
	public Topicos(String chassi, String nome, String marca, Date anoFabricacao, String cor, Double valor) {
		super();
		this.chassi = chassi;
		this.nome = nome;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
		this.valor = valor;
	}

	
}
	