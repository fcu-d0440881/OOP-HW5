package fcu.iecs.oop.hw5;
import java.util.Random;
public class GYM{
	public static void fight(Pokemon p1, Pokemon p2){
		Random rand = new Random();
		boolean flag = rand.nextBoolean();
		int cp;
		if(flag){
			System.out.println("\"Winner is " + p1.getName() + ". \"");
			cp = p1.getCp() + 500;
			p1.setCp(cp);
		}
		else{
			System.out.println("\"Winner is " + p2.getName() + ". \"");
			cp = p2.getCp() + 500;
			p2.setCp(cp);
		}
	}
}
