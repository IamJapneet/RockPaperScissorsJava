//This code was written on 5th June 2022 by Japneet
import java.util.Scanner;
import java.util.Random;
public class Firstjava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 0 for rock, 1 for paper, 2 for scissors");
		int u1=sc.nextInt();
		Random random= new Random();
		int computerinput=random.nextInt(3);
		if(u1==computerinput)
		{
			System.out.println("Draw");
		}
		else if(u1==0 && computerinput==2 || u1 ==1 && computerinput==0 || u1==2 && computerinput==1)
		{
			System.out.println("You win!");
		}
		else
		{
			System.out.println("Computer win, you lose");
		}   
		System.out.println("Computer choose "+computerinput);
	}

}
