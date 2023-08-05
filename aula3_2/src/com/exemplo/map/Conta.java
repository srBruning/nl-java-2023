package com.exemplo.map;

public class Conta {
	private long numero;
	private double saldo;
	
	public Conta(long numero) {
		super();
		this.numero = numero;
	}
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public boolean depositar(Double valor) {
		this.saldo += valor;
		return true;
	}
	
	
	public boolean sacar(Double valor) {
		
		if(saldo < valor)
			return false;
		
		saldo -= valor;
		return true;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
}
