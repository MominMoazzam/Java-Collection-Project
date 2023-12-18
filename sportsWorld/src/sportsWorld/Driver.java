package sportsWorld;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

interface individualSports {
	public void singleplayergames();

}

class moj implements individualSports { /* INHERTANCE */
	public void singleplayergames() {
		Scanner sc = new Scanner(System.in);
		sports ref = new sports();

		System.out.println("1)CHESS");
		System.out.println("2)SWIMMING");
		System.out.println("3)ARCHERY");
		System.out.println("4)JUDO");
		System.out.println("                                 ");
		System.out.println("PLEASE TYPE YOUR CHOICE IN A WORD OR PHARSE :-");
		String name = sc.nextLine();

		switch (name.toLowerCase()) {
		case "chess":
			ref.chess();
			System.out.println("WANT TO SEE MORE PLZ PRESS 1");
			System.out.println("WANT TO START YOUR CARREIR IN CHESS PLZ PRESS 2");
			try {
				int s = sc.nextInt();
				if (s == 1)
					singleplayergames();
				else if (s == 2) {
					System.out.println("1) ADMIN LOGIN");
					System.out.println("2) CREATE NEW ACCOUNT");
					System.out.println("3) USER LOGIN");
					System.out.println("   ");
					System.out.println("PRESS THE NUMBER-");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						LOG log = new admin_login();
						log.logindetails();
						Equipments e = new Equipments();
						e.chess_Equipments();
						e.buy_chess();
						e.bill();
						break;
					case 2:
						register.user_input();
						Equipments QI = new Equipments();
						QI.chess_Equipments();
						QI.buy_chess();
						QI.bill();
						break;
					case 3:
						System.out.println("ENTER USERNAME-");
						String usname = sc.next();
						boolean flag = false;

						for (Object obj : register.user) {
							if (usname.equals(obj)) {
								register.password();
								flag = true;
							}
						}
						if (flag == false) {
							System.out.println("INVALID USERNAME PLEASE CREATE NEW ACCOUNT");
							register.user_input();
							Equipments PI = new Equipments();
							PI.chess_Equipments();
							PI.buy_chess();
							PI.bill();
						}

						break;
					}
				} else {
					System.out.println("PLEASE PRESS VALID NUMBER TO MOVE FURTHER-");
					int si = sc.nextInt();
					if (si == 1)
						singleplayergames();
					else {
						System.out.println("----------------CREATE NEW ACCOUNT--------------------------");
						System.out.println("");
						register.user_input();
						Equipments QI = new Equipments();
						QI.chess_Equipments();
						QI.buy_chess();
						QI.bill();
					}
				}
			} catch (InputMismatchException e) {
				System.out.println(
						"----------------//------------------------ERROR----------------------//---------------------------");
				System.out.println("                 ");
				singleplayergames();
			}

			break;
		case "swimming":
			ref.swimming();
			System.out.println("WANT TO SEE MORE PRESS 1");
			System.out.println("WANT TO START YOUR CARREIR IN SWIMMING PLZ PRESS 2");
			try {
				int s = sc.nextInt();
				if (s == 1)
					singleplayergames();
				else if (s == 2) {
					System.out.println("1) ADMIN LOGIN");
					System.out.println("2) CREATE NEW ACCOUNT");
					System.out.println("3) USER LOGIN");
					System.out.println("   ");
					System.out.println("PRESS THE NUMBER-");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						LOG log = new admin_login();
						log.logindetails();
						Equipments e = new Equipments();
						e.swimming_Equipments();
						e.buy_swimming();
						e.bill();
						break;
					case 2:
						register.user_input();
						Equipments QI = new Equipments();
						QI.swimming_Equipments();
						QI.buy_swimming();
						QI.bill();
						break;
					case 3:
						System.out.println("ENTER USERNAME-");
						String usname = sc.next();
						boolean flag = false;

						for (Object obj : register.user) {
							if (usname.equals(obj)) {
								register.password();
								flag = true;
							}
						}
						if (flag == false) {
							System.out.println("INVALID USERNAME PLEASE CREATE NEW ACCOUNT");
							register.user_input();
							Equipments PI = new Equipments();
							PI.swimming_Equipments();
							PI.buy_swimming();
							PI.bill();
						}

						break;
					}
				} else {
					System.out.println("PLEASE ENTER THE VALID NUMBER TO MOVE FURTHER");
					int si = sc.nextInt();
					if (si == 1)
						singleplayergames();
					else {
						System.out.println("----------------CREATE NEW ACCOUNT--------------------------");
						register.user_input();
						Equipments QI = new Equipments();
						QI.swimming_Equipments();
						QI.buy_swimming();
						QI.bill();
					}
				}
			} catch (InputMismatchException e) {
				System.out.println(
						"----------------//------------------------ERROR----------------------//---------------------------");
				System.out.println("                 ");
				singleplayergames();
			}
			break;
		case "archery":
			ref.Archery();
			System.out.println("WANT TO SEE MORE PRESS 1");
			System.out.println("WANT TO START YOUR CARREIR IN ARCHERY PLZ PRESS 2");
			try {
				int s = sc.nextInt();
				if (s == 1)
					singleplayergames();
				else if (s == 2) {
//					
					System.out.println("1) ADMIN LOGIN");
					System.out.println("2) CREATE NEW ACCOUNT");
					System.out.println("3) USER LOGIN");
					System.out.println("   ");
					System.out.println("PRESS THE NUMBER-");
					int choice = sc.nextInt();
					
					switch (choice) {
					case 1:
						LOG log = new admin_login();
						log.logindetails();
						Equipments e = new Equipments();
						e.archery_Equipments();
						e.buy_archery();
						e.bill();
						break;
					case 2:
						register.user_input();
						Equipments QI = new Equipments();
						QI.archery_Equipments();
						QI.buy_archery();
						QI.bill();
						break;
					case 3:
						System.out.println("ENTER USERNAME-");
						String usname = sc.next();
						boolean flag = false;

						for (Object obj : register.user) {
							if (usname.equals(obj)) {
								register.password();
								flag = true;
							}
						}
						if (flag == false) {
							System.out.println("INVALID USERNAME PLEASE CREATE NEW ACCOUNT");
							register.user_input();
							Equipments PI = new Equipments();
							PI.archery_Equipments();
							PI.buy_archery();
							PI.bill();
						}

						break;
					}
				} else {
					System.out.println("PLEASE ENTER THE VALID NUMBER TO MOVE FURTHER");
					int si = sc.nextInt();
					if (si == 1)
						singleplayergames();
					else if(si==2){
						System.out.println("----------------CREATE NEW ACCOUNT--------------------------");
						System.out.println("");
						register.user_input();
						Equipments QI = new Equipments();
						QI.archery_Equipments();
						QI.buy_archery();
						QI.bill();
					}
				}
			} catch (InputMismatchException e) {
				System.out.println(
						"----------------//------------------------ERROR----------------------//---------------------------");
				System.out.println("                 ");
				singleplayergames();
			}
			break;
		case "judo":
			ref.judo();
			System.out.println("WANT TO SEE MORE PRESS 1");
			System.out.println("WANT TO START YOUR CARREIR IN JUDO PLZ PRESS 2");
			try {
				int s = sc.nextInt();
				if (s == 1)
					singleplayergames();
				else if (s == 2) {
					System.out.println("1) ADMIN LOGIN");
					System.out.println("2) CREATE NEW ACCOUNT");
					System.out.println("3) USER LOGIN");
					System.out.println("   ");
					System.out.println("PRESS THE NUMBER-");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						LOG log = new admin_login();
						log.logindetails();
						Equipments e = new Equipments();
						e.judo_Equipments();
						e.buy_judo();
						e.bill();
						break;
					case 2:
						register.user_input();
						Equipments QI = new Equipments();
						QI.judo_Equipments();
						QI.buy_judo();
						QI.bill();
						break;
					case 3:
						System.out.println("ENTER USERNAME-");
						String usname = sc.next();
						boolean flag = false;

						for (Object obj : register.user) {
							if (usname.equals(obj)) {
								register.password();
								flag = true;
							}
						}
						if (flag == false) {
							System.out.println("INVALID USERNAME PLEASE CREATE NEW ACCOUNT");
							register.user_input();
							Equipments PI = new Equipments();
							PI.judo_Equipments();
							PI.buy_judo();
							PI.bill();
						}

						break;
					}
				} else {
					System.out.println("PLEASE ENTER THE VALID NUMBER TO MOVE FURTHER");
					int si = sc.nextInt();
					if (si == 1)
						singleplayergames();
					else if(si==2) {
						System.out.println("----------------CREATE NEW ACCOUNT--------------------------");
						System.out.println(" ");
						register.user_input();
						Equipments QI = new Equipments();
						QI.judo_Equipments();
						QI.buy_judo();
						QI.bill();
					}
				}
			} catch (InputMismatchException e) {
				System.out.println(
						"----------------//------------------------ERROR----------------------//---------------------------");
				System.out.println("                 ");
				singleplayergames();
			}
			break;
		default:
			System.out.println("INVALID INPUT");
			singleplayergames();
			break;
		}
		sc.close();
	}
}

class sports {
	public void chess() {
		System.out.println("-----------------------CHESS-------------------------------");
		System.out.println();
		System.out.println("INTRODUCTION");
		System.out.println();
		System.out.println(
				"The history of chess can be traced back nearly 1,500 years to its earliest known predecessor, called chaturanga, in India; its prehistory is the subject of speculation. From India it spread to Persia. Following the Arab invasion and conquest of Persia, The game evolved roughly into its current form by about 1500 C");
		System.out.println(
				" chess was taken up by the Muslim world and subsequently spread to Europe via Spain (Al Andalus) and Italy (Emirate of Sicily).");
		System.out.println("chess, one of the oldest and most popular board games");
		System.out.println(
				"played by two opponents on a checkered board with specially designed pieces of contrasting colours, commonly white and black.");
		System.out
				.println("White moves first, after which the players alternate turns in accordance with fixed rules,");
		System.out.println(
				"each player attempting to force the opponent’s principal piece, the King, into checkmate—a position where it is unable to avoid capture.");
		System.out.println("pieces of chess");
		System.out.println("king, rook, bishop, queen, knight, and pawn.");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("equipments of chess");
		System.out.println("Chess box");
		System.out.println("Chess clock");
		System.out.println("Chess table");
		System.out.println("Chess board");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");
	}

	public void swimming() {
		System.out.println("-------------------------swimming-------------------------");
		System.out.println();
		System.out.println("INTRODUCTION");
		System.out.println();
		System.out.println("History of swimming");
		System.out.println();
		System.out.println(
				"Evidence of recreational swimming in prehistoric times has been found, with the earliest evidence dating to");
		System.out.println(
				"paintings from around 10,000 years ago. Written references date from 2000 BC, with some of the earliest references to swimming including the Iliad, the Odyssey, the Bible, Beowulf, the Quran and others");
		System.out.println(
				" In 1538, Nikolaus Wynmann, a Swiss–German professor of languages, wrote the earliest known complete book about swimming, ");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("SWIMWEAR AND EQUIPMENTS");
		System.out.println();
		System.out.println("Swimsuit");
		System.out.println("Goggles");
		System.out.println("Swim Fins");
		System.out.println("Drag suit");
		System.out.println("Hand paddles");
		System.out.println("Kickboard");
		System.out.println("Pull buoy");
		System.out.println("Snorkel");
		System.out.println();
		System.out.println("officials");
		System.out.println("Refree," + "Starter," + "clerk of course," + "Time keepers," + "Inspectors of turns,"
				+ "Finish Judges");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");
	}

	public void Archery() {
		System.out.println("----------------------------------------ARCHERY---------------------------------------");
		System.out.println("");
		System.out.println("INTRODUCTION");
		System.out.println();
		System.out.println(
				"Archery is the sport, practice, or skill of using a bow to shoot arrows.[1] The word comes from the Latin arcus, meaning bow.[");
		System.out.println(
				"Historically, archery has been used for hunting and combat. In modern times, it is mainly a competitive sport and recreational activity. A person who practices archery is typically called an archer, bowman, or toxophilite.");
		System.out.println();
		System.out.println("History of Archery");
		System.out.println();
		System.out.println(
				"The oldest known evidence of the bow and arrow comes from South African sites such as Sibudu Cave, where the remains of bone and stone arrowheads have been found dating approximately 72,000 to 60,000 years ago");
		System.out.println(
				"Based on indirect evidence, the bow also seems to have appeared or reappeared later in Eurasia, near the transition from the Upper Paleolithic to the Mesolithic.");
		System.out.println(
				"Archery was highly developed in Asia. The Sanskrit term for archery, dhanurvidya, came to refer to martial arts in general. In East Asia, Goguryeo, one of the Three Kingdoms of Korea was well known for its regiments of exceptionally skilled archer");
		System.out.println("");
		System.out.println("Equipments of Archery");
		System.out.println("");
		System.out.println("ARROW");
		System.out.println("Bowstring");
		System.out.println("Protective equipment(bracer,finger tab)");
		System.out.println("Release aids");
		System.out.println("Stabilizers");
		System.out.println("");
		System.out.println("");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");
	}

	public void judo() {
		System.out.println(
				"--------------------------------------judo--------------------------------------------------");
		System.out.println("");
		System.out.println("INTRODUCTION");
		System.out.println();
		System.out.println(
				"Judo is a martial art that was born in Japan, and it is now known around the world as an Olympic sport. Judo was created in 1882 by combining jujutsu, a form of close combat, with elements of mental discipline");
		System.out.println(
				"The roots of jujutsu lie in sumo. Sumo has a very long history and is even mentioned in the Kojiki (Records of Ancient Matters) from the year 712, which describes the history of Japan from the mythical age of the gods to the reign of Empress Suiko (554–628) and the Nihon Shoki (Chronicle of Japan),");
		System.out.println(
				"a document from 720 that describes the history of Japan from the age of the gods until the time of Empress Jito, who reigned from 690 to 697");
		System.out.println("");
		System.out.println("Equipments of judo                  ");
		System.out.println("");
		System.out.println("BAGS");
		System.out.println("BELTS");
		System.out.println("ELBOW PADS");
		System.out.println("GRAPLING DUMMIES");
		System.out.println("TAPE");
		System.out.println("TRAINNIG SHOES");
		System.out.println("ZORI SANDALS");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");
	}

}

public class Driver {
	static {
		System.out.println(
				"-------------------//----------------------------------------WELLCOME TO SPORTS WORLD-----------------------------//-------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		individualSports n = new moj();
		n.singleplayergames();

	}
}

@FunctionalInterface /* ABSTRACTION */
interface LOG {
	public void logindetails();
}

class admin_login implements LOG {
	static {
		System.out.println("--------------------------------//----LOGIN----//----------------------------------------");
	}

	public void logindetails() {
		Scanner m = new Scanner(System.in);

		System.out.println("ENTER THE USERNAME-");
		String user = m.nextLine();
		if (user.equals("MOMIN")) // equals method
		{
			Password();
		} else {
			System.out.println("---------------------------------//----INVALID USERNAME----//----------------------------------------");
			logindetails();
		}
	}

	public static void Password() {
		Scanner pas = new Scanner(System.in);
		System.out.println("ENTER THE PASSWORD-");
		String pass = pas.next();
		if (pass.equals("pass@11")) {
			System.out.println("------------       //         LOGIN SUCCESFULL        //          -----------");
		} else {
			System.out.println("---------------------------------//----INVALID PASSWORD----//----------------------------------------");
			LOG r = new admin_login();
			Password();

		}
	}

}

class invalidNumberException extends RuntimeException {
	public invalidNumberException() {
		System.out.println("-----------------        //          ERROR           //             ---------------------");

	}
}

class register {
	static ArrayList user = new ArrayList();

	public static void user_input() {
		System.out.println(
				"-------------------------------//     NEW ACCOUNT DETAILS    //------------------------------------------");
		Scanner reg = new Scanner(System.in);
		System.out.println("ENTER FIRST NAME-");
		String first = reg.next();
		user.add(first);
		System.out.println("ENTER LAST NAME-");
		String last = reg.next();
		user.add(last);
		System.out.println("ENTER YOUR AGE");
		try {
			int age = reg.nextInt();
			user.add(age);
		} catch (InputMismatchException e) {
			System.out.println("PLEASE ENTER CORRECT AGE");
			user_input();
		}
		System.out.println("PRESS THE NUMBER-"+ "");
		System.out.println("1-MALE");
		System.out.println("2-FEMALE");
		System.out.println("3-OTHER");
		int gender = reg.nextInt();
		if (gender == 1) {
			System.out.println("MALE");
		} else if (gender == 2) {
			System.out.println("FEMALE");
		} else if (gender == 3) {
			System.out.println("OTHER");
		} else {
			System.out.println("INVALID NUMBER");
			user_input();
		}
		System.out.println("ENTER MOBILE NUMBER-");

		try {
			long num = reg.nextLong();
			register n = new register();
			n.number(num, 10);
		} catch (RuntimeException e) {
			System.out.println("PLEASE ENTER THE CORRECT NUMBER-");
			user_input();
		}

		System.out.println("ENTER THE USERNAME- ");
		String usname = reg.next();
		user.add(usname);
		System.out.println("ENTER THE PASSWORD");
		String pass = reg.next();
		user.add(pass);

		System.out.println(
				"--------------------          //       REGISTRATION COMPLETED           //               ---------------------------");
		System.out.println("");
		System.out.println("");
		System.out.println(
				"--------------------          //       LOGIN           //               ---------------------------");
		userlogin();
	}

	public void number(long num, int size) /* CHECKED EXCEPTION */
	{
		int count = 0;
		while (num != 0) {
			long i = num % 10;
			count++;
			num = num / 10;
		}

		if (count == size) {
			user.add(num);
		} else {
			throw new invalidNumberException();
		}
	}

	public static void userlogin() {
		Scanner uslogin = new Scanner(System.in);
		boolean flag = false;
		System.out.println("ENTER USERNAME-");
		String username = uslogin.next();
		for (Object obj : user) {
			if (username.equals(obj)) {
				password();
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("PLEASE ENTER VALID USERNAME");
			userlogin();
		}
	}

	public static void password() {
		boolean flag = false;
		Scanner uslogin = new Scanner(System.in);
		System.out.println("ENTER PASSWORD");
		String password = uslogin.next();
		for (Object ref : user) {

			if (password.equals(ref)) {
				System.out.println("");
				System.out.println("------------       //         LOGIN SUCCESFULL        //          -----------");
				System.out.println("");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("PLEASE ENTER VALID PASSWORD");
			password();
		}

	}

}

class buy {
	private static int sum = 0; /* ENCAPSULATION */
	static int no_of_prod = 0;
   static int  count=19927;
   

@Override
   public int hashCode() {
	 System.out.println("BILL No:"+" "+ ++count);
	return 0;
   }



	public static int getSum() {
		return sum;
	}

	public void buy_chess() {
		Scanner buy = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("PRESS THE RESPECTED NUMBER  OF PRODUCT WHICH YOU WANT TO BUY-");
		int n = buy.nextInt();
		switch (n) {
		case 1:
			no_of_prod++;
			sum = sum + 20;
			System.out.println("WANT MORE PRESS X ELSE PRESS E");
			String in = buy.next();
			if (in.equals("X") || in.equals("x"))
				buy_chess();
		
			break;
		case 2:
			no_of_prod++;
			sum = sum + 22;
			System.out.println("WANT MORE PRESS X ELSE PRESS E");
			String sn = buy.next();
			if (sn.equals("X") || sn.equals("x"))
				buy_chess();
		
			break;
		case 3:
			no_of_prod++;
			sum = sum + 23;
			System.out.println("WANT MORE PRESS X ELSE PRESS E");
			String mn = buy.next();
			if (mn.equals("X") || mn.equals("x"))
				buy_chess();
			break;
		default:
			System.out.println("PLEASE PRESS THE RESPECTED NUMBER");
			buy_chess();
		}
	}

	public void buy_swimming() {
		Scanner buy = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("PRESS THE RESPECTED NUMBER  OF PRODUCT WHICH YOU WANT TO BUY-");
		int n = buy.nextInt();
		switch (n) {
		case 1:
			no_of_prod++;
			sum = sum + 10;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String in = buy.next();
			if (in.equals("X") || in.equals("x"))
				buy_swimming();
			break;
		case 2:
			no_of_prod++;
			sum = sum + 7;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String sn = buy.next();
			if (sn.equals("X") || sn.equals("x"))
				buy_swimming();
			break;
		case 3:
			no_of_prod++;
			sum = sum + 6;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String mn = buy.next();
			if (mn.equals("X") || mn.equals("x"))
				buy_swimming();
			break;
		case 4:
			no_of_prod++;
			sum = sum + 24;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String qn = buy.next();
			if (qn.equals("X") || qn.equals("x"))
				buy_swimming();
			break;
		default:
			System.out.println("PLEASE PRESS THE RESPECTED NUMBER");
			buy_swimming();
		}
	}

	public void buy_archery() {
		Scanner buy = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("PRESS THE RESPECTED NUMBER  OF PRODUCT WHICH YOU WANT TO BUY-");
		int n = buy.nextInt();
		switch (n) {
		case 1:
			no_of_prod++;
			sum = sum + 72;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String in = buy.next();
			if (in.equals("X") || in.equals("x"))
				buy_archery();
			break;
		case 2:
			no_of_prod++;
			sum = sum + 15;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String sn = buy.next();
			if (sn.equals("X") || sn.equals("x"))
				buy_archery();
			break;
		case 3:
			no_of_prod++;
			sum = sum + 24;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String mn = buy.next();
			if (mn.equals("X") || mn.equals("x"))
				buy_archery();
			break;
		case 4:
			no_of_prod++;
			sum = sum + 10;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String qn = buy.next();
			if (qn.equals("X") || qn.equals("x"))
				buy_archery();
			break;
		default:
			System.out.println("PLEASE PRESS THE RESPECTED NUMBER");
			buy_archery();
		}
	}

	public void buy_judo() {
		Scanner buy = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("PRESS THE RESPECTED NUMBER  OF PRODUCT WHICH YOU WANT TO BUY-");
		int n = buy.nextInt();
		switch (n) {
		case 1:
			no_of_prod++;
			sum = sum + 5;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String in = buy.next();
			if (in.equals("X") || in.equals("x"))
				buy_judo();
			break;
		case 2:
			no_of_prod++;
			sum = sum + 5;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String sn = buy.next();
			if (sn.equals("X") || sn.equals("x"))
				buy_judo();
			break;
		case 3:
			no_of_prod++;
			sum = sum + 20;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String mn = buy.next();
			if (mn.equals("X") || mn.equals("x"))
				buy_judo();
			break;
		case 4:
			no_of_prod++;
			sum = sum + 10;
			System.out.println("WANT MORE PRESS X ELSE PRESS 0");
			String qn = buy.next();
			if (qn.equals("X") || qn.equals("x"))
				buy_judo();
			break;
		default:
			System.out.println("PLEASE PRESS THE RESPECTED NUMBER");
			buy_judo();
		}
	}
}

class Equipments extends buy {

	public void chess_Equipments() {
		System.out.println(
				"---------------------//        EQUIPMENTS OF CHESS        //-----------------------------------");
		System.out.println("  ");
		System.out.println("1)**CHESS BOARD**");
		System.out.println("  ");
		System.out.println("BRAND    :  BCBESTCHESS");
		System.out.println("MATERIAL :  Wood");
		System.out.println("THEME    :  Sport");
		System.out.println("SIZE     :  12*12 inches");
		System.out.println("COLOR    :  BROWN");
		System.out.println("DETAILS  :  WOODEN STRONG MAGNETIC CHESS, FOLDABLE BOARD, ANTI-SCRATCHING");
		System.out.println("PRICE    :  20$ ONLY");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("2)**CHESS BOX**");
		System.out.println("");
		System.out.println("BRAND             : Nivia");
		System.out.println("COLOR             : black");
		System.out.println("COUNTRY OF ORIGIN : INDIA");
		System.out.println("ITEM WEIGHT       : 320g");
		System.out.println("PRICE             : 22$  ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("3)**CHESS TABLE**");
		System.out.println("");
		System.out.println("BRAND	                :Generic");
		System.out.println("MATERIAL	            :Wood");
		System.out.println("COLOR                   :brown");
		System.out.println("COUNTRY OF ORIGIN       :INDIA");
		System.out.println("ITEM DIMENSION LxWxH	:31 x 31 x 31 Centimeters");
		System.out.println("PRICE                   :23$");

	}

	public void swimming_Equipments() {
		System.out.println(
				"---------------------//        EQUIPMENTS OF SWIMMING        //-----------------------------------");
		System.out.println("  ");
		System.out.println("1)**SWIM SUIT**");
		System.out.println("");
		System.out.println("COLOR        :Multicolor");
		System.out.println("FABRIC       :Lycra");
		System.out.println("PATTERN      :Solid");
		System.out.println("SIZE         :S,M,XL");
		System.out.println("BRAND        :aqua holic");
		System.out.println("PRICE        :10$");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("2)**SWIM GOOGLES**");
		System.out.println("BRAND	        :Prime Deals");
		System.out.println("COLOR   	    :Multicolour");
		System.out.println("MATERIAL	    :Silicone, Polycarbonate");
		System.out.println("FRAME TYPE	    :Full Rim");
		System.out.println("FRAME MATERIAL	:Nylon");
		System.out.println("PRICE           :7$");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("3)**SWIM FINS**");
		System.out.println("COLOR 	    :Yellow");
		System.out.println("BRAND	    :Nivia");
		System.out.println("SPORT	    :Swimming");
		System.out.println("FIT TYPE	:Regular");
		System.out.println("PRICE       :6$");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("4)**HAND PADDLES**");
		System.out.println("BRAND	    :Speedo");
		System.out.println("MATERIAL	:Polypropylene (PP)");
		System.out.println("SPORT	    :Swimming");
		System.out.println("FIT TYPE	:Regular");
		System.out.println("PRICE       :24$");

	}

	public void archery_Equipments() {
		System.out.println(
				"---------------------//        EQUIPMENTS OF ARCHERY        //-----------------------------------");
		System.out.println("");
		System.out.println("1)**ARROW**");
		System.out.println("BRAND   	:Armor");
		System.out.println("COLOUR      :Silver");
		System.out.println("MATERIAL	:Plastic");
		System.out.println("Item Weight	:15.42 Kilograms");
		System.out.println("PRICE       :72$");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("2)**BOW STRING**");
		System.out.println("BRAND   	       ‎    :Generic");
		System.out.println("COLOR                  :black");
		System.out.println("COUNTRY OF ORIGIN      :Hong Kong");
		System.out.println("ITEM DIMENSION LxWxH   :6 x 6 x 3 Centimeters");
		System.out.println("THICKNESS              :0.4mm");
		System.out.println("PRICE                  :15$");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("3)**PROTECTIVE EQIPMENTS**");
		System.out.println("BRAND                  :Generic");
		System.out.println("COLOR                  :BLACK");
		System.out.println("COUNTRY OF ORIGIN      :INDIA");
		System.out.println("PRICE                  :24$");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("4)**RELEASE AIDS**");
		System.out.println("BRAND                  :Generic");
		System.out.println("COUNTRY OF ORIGIN      :Hong Kong");
		System.out.println("ITEM DIMENSION LxWxH   :9 x 8 x 12 Centimeters");
		System.out.println("PRICE                  :10$");

	}

	public void judo_Equipments() {
		System.out.println(
				"---------------------//        EQUIPMENTS OF JUDO        //-----------------------------------");
		System.out.println("");
		System.out.println("1)**BELTS**");
		System.out.println("PRODUCT NAME     :Taekwondo BelT");
		System.out.println("COLOR            :BLUE");
		System.out.println("MATERIAL         :Cotton and Terylene");
		System.out.println("LENGTH           :260cm");
		System.out.println("WIDTH            :4cm");
		System.out.println("PRICE            :5$");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("2)**ELBO PADS**");
		System.out.println("COLOR     :Black");
		System.out.println("TYPE      :Knee Support");
		System.out.println("SIZE      :XL");
		System.out.println("ORIGIN    :INDIA");
		System.out.println("PRICE     :5$");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("3)**BELTS**");
		System.out.println("SPORT	  :Karate");
		System.out.println("BRAND	  :DAAN");
		System.out.println("COLOR	  :Black / Red");
		System.out.println("SIZE	  :5ft / 59");
		System.out.println("PRICE     :20$");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("4)**TRAINNING SHOES**");
		System.out.println("SOLE        :Rubber");
		System.out.println("FIT TYPE    :Regular");
		System.out.println("LIFESTYLE   :Walking Shoes");
		System.out.println("SHOE WIDTH  :Medium");
		System.out.println("PRICE       :10$");

	}

	public void bill() {

		System.out.println("");
		
		System.out.println(
				"-----------------------------------------------------------BILL---------------------------------------------------------------------");
		
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
		hashCode();
		System.out.println("TOTAL PRODUCTS-"+no_of_prod);
	    System.out.println("DATE:"+sf.format(d));
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("TOTAL BILL:" + buy.getSum() + "$");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("THANK YOU VISIT AGAIN");

	}
	
}


//                                                                CONCEPT USED IN THIS PROJECT

//      1.ENCAPSULATION
//      2.ABSTRACTION
//      3.INHERITANCE
//      4.ALL EXCEPTION HANDLED USING EXCEPTION HANDLING TECHNIQUE   (CUSTOM EXCEPTION)
//      5.SWITCH CASE
//      6.BLOCK
//      7.STATIC AND NON STATIC METHOD
//      8.STATIC AND NON STATIC CONSTRUCTOR
//      9.COLLECTION
//     10.POLYMORPHISM 
//     11.OVERRIDE HASHCODE METHOD 
//     12.OVERRIDE EQUALS METHOD
//

