package personagens;
import java.util.Scanner;

import espadas.Excalibur;
import espadas.Katana;

import escudos.Hero;
import escudos.Spartan;

import cajados.Cronus;
import cajados.Eximerus;

import arcos.DeathBow;
import arcos.ShieldBow;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 100;
		
		List cadastro = new ArrayList();
		
		while(op != 0) {
			
			System.out.println("Escolha uma opção: ");
			System.out.println("(1) Guerreiro");
			System.out.println("(2) Mago ");
			System.out.println("(3) Arqueiro ");
			System.out.println("(0) Sair ");
			op = sc.nextInt();
			
			if(op!=0) {
				
				System.out.println("Escolha um nome: ");
				String name = sc.next();
				
				System.out.println("Digite a idade: ");
				int age = sc.nextInt();
				
				System.out.println("Escolha o sexo: ");
				String sex = sc.next();
				
				System.out.println("Nacionalidade: ");
				String country = sc.next();
				
				if(op == 1) {
					
					Guerreiro player = new Guerreiro(name, age, sex, country);
					
					System.out.println("(1) Excalibur ");
					System.out.println("(2) Katana ");
					op = sc.nextInt();
					
					if(op == 1) {
						Excalibur exc = new Excalibur();
						
						player.setEspada(exc);
						
						player.setAtaque(player.getAtaque() + exc.getAtaque());
						player.setSpeed(player.getSpeed() + exc.getSpeed());
						
					}
					if(op == 2) {
						Katana kat = new Katana();
						
						player.setEspada(kat);
						
						player.setAtaque(player.getAtaque() + kat.getAtaque());
						player.setSpeed(player.getSpeed() + kat.getSpeed());
			
					}
					
					System.out.println("(1) Hero ");
					System.out.println("(2) Spartan ");
					op = sc.nextInt();
					
					if(op == 1) {
						Hero hero = new Hero();
						
						player.setEscudo(hero);
						
						player.setDefesa(player.getDefesa() + hero.getDefesa());
						
					}
					if(op == 2) {
						Spartan spartan = new Spartan();
						
						player.setEscudo(spartan);
						
						player.setDefesa(player.getDefesa() + spartan.getDefesa());
					
					}
					
					op = 100;
					cadastro.add(player);
					System.out.println("Cadastrado!");
					System.out.println("=======================");
				
				}
				
				if(op == 2) {
					Mago player = new Mago(name, age, sex, country);
					
					System.out.println("(1) Eximerus ");
					System.out.println("(2) Cronus ");
					op = sc.nextInt();
					
					if(op == 1) {
						Eximerus exi = new Eximerus();
						
						player.setCajado(exi);
						
						player.setAtaque(player.getAtaque() + exi.getAtaque());
						
					}
					if(op == 2) {
						Cronus cro = new Cronus();
						
						player.setCajado(cro);
						
						player.setAtaque(player.getAtaque() + cro.getAtaque());
						
					}
					
					op = 100;
					cadastro.add(player);
					System.out.println("Cadastrado!");
					System.out.println("=======================");
					
				}
				if(op == 3) {
					
					Arqueiro player = new Arqueiro(name, age, sex, country);
					
					System.out.println("(1) Death Bow ");
					System.out.println("(2) Shield Bow ");
					op = sc.nextInt();
					
					if(op == 1) {
						DeathBow dtb = new DeathBow();
						
						player.setArco(dtb);
						
						player.setAtaque(player.getAtaque() + dtb.getAtaque());
						player.setDefesa(player.getDefesa() + dtb.getDefesa());
						player.setSpeed(player.getSpeed() + dtb.getSpeed());
						
					}
					if(op == 2) {
						ShieldBow sdb = new ShieldBow();
						
						player.setArco(sdb);
						
						player.setAtaque(player.getAtaque() + sdb.getAtaque());
						player.setDefesa(player.getDefesa() + sdb.getDefesa());
						player.setSpeed(player.getSpeed() + sdb.getSpeed());
						
					}
					
					op = 100;
					cadastro.add(player);
					System.out.println("Cadastrado!");
					System.out.println("=======================");
				}
			}
		}
		
		System.out.println(cadastro);
	}
	
	
}
