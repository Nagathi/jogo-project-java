package personagens;

import arcos.Arco;

public class Arqueiro extends Personagem {
	private int ataque;
	private int defesa;
	private int speed;
	private Arco arco;
	
	public Arqueiro (String name, int age, String sex, String country) {
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.setCountry(country);
		this.setAtaque(120);
		this.setDefesa(10);
		this.setSpeed(120);
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
		System.out.println("Cajado: " + this.getArco());
	}

	public Arco getArco() {
		return arco;
	}

	public void setArco(Arco arco) {
		this.arco = arco;
	}
}
