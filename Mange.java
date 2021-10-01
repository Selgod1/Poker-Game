 
 
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
 
 
public class Mange {
    public void startGame() {
		Scanner in = new Scanner(System.in);
		List<Poker> list =new Poker().createPoker();
		showPork(list.iterator());
		Judgement judgement = new Judgement();
		list = judgement.washPoke(list);
		 System.out.println ("------ Crear jugador ...--------");
		int id1;
		String name1;
		 System.out.println ("Ingrese la ID y el nombre del primer jugador:");
		 System.out.print ("Ingrese ID:");
		id1 = in.nextInt();
		 System.out.println ("Ingrese nombre:");
		in.nextLine();
		name1 = in.nextLine();
		int id2;
		String name2;
		 System.out.println ("Ingrese la ID y el nombre del segundo jugador:");
		 System.out.print ("Ingrese ID:");
		id2 = in.nextInt();
		 System.out.println ("Ingrese nombre:");
		in.nextLine();
		name2 = in.nextLine();
		Player player = new Player(id1, name1);
		Player player2 = new Player(id2, name2);
		 System.out.println ("------ Bienvenidos jugadores:" + player.getName ());
		 System.out.println ("------ Bienvenidos jugadores:" + player2.getName ());
		 System.out.println ("-------- Iniciar licencia ...--------");
		for (int i = 0; i < 4; i+=2) {
			 System.out.println ("---- Player:" + player.getName () + "-take card");
			player.getPoker(list.get(i));
			 System.out.println ("---- Player:" + player2.getName () + "-take card");
			player2.getPoker(list.get(i+1));
		}
		 System.out.println ("-------- Fin de la licencia! ------------");
		 System.out.println ("---------- Inicie el juego ...---------");
		 System.out.println ("Player:" + player.getName () + "La mano más grande es:" + player.putPoker ());
		 System.out.println ("Player:" + player2.getName () + "La mano más grande es:" + player2.putPoker ());
		judgement.whoWin(player, player2);
		 System.out.println ("Las manos respectivas de los jugadores son:");
		System.out.println(player.getName()+":"+player.getPokers());
		System.out.println(player2.getName()+":"+player2.getPokers());
	}
	
	
	public void showPork(Iterator<Poker> iterator) {
		 System.out.print ("es: [");
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
		System.out.println("]");
	}
}