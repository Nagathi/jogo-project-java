package personagens;


import espadas.Espada;
import escudos.Escudo;

public class Guerreiro extends Personagem {
	
	private int ataque;
	private int defesa;
	private int speed;
	private Espada espada;
	private Escudo escudo;
	
	public Guerreiro(String name, int age, String sex, String country) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.setCountry(country);
		this.setAtaque(70);
		this.setDefesa(70);
		this.setSpeed(30);
	}
	
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public void show() {
		System.out.println("Nome: " + this.getName());
		System.out.println("Idade: " + this.getAge());
		System.out.println("Sexo: " + this.getSex());
		System.out.println("País: " + this.getCountry());
		System.out.println("Ataque: " + this.getAtaque());
		System.out.println("Defesa: " + this.getDefesa());
		System.out.println("Velocidade: " + this.getSpeed());
		System.out.println("Espada: " + this.getEspada());
		System.out.println("Escudo: " + this.getEscudo());
	}

	public Espada getEspada() {
		return espada;
	}

	public void setEspada(Espada espada) {
		this.espada = espada;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}
	
}
