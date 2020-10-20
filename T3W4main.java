import java.util.*;

public class T3W4main
{
	public static void main(String[] args)
	{
		char anws = 'y';
		while (anws == 'y')
		{
			Scanner key = new Scanner(System.in);

			System.out.println("---Menu---");
			System.out.println("1. Vehicle ");
			System.out.println("2. Car");
			System.out.println("3. Bus");
			System.out.print("Insert your choice(1,2,3): ");

			int pilih = key.nextInt();

			switch(pilih)
			{
				case 1:
				System.out.println("-Menu Vehicle-");
				System.out.print("Insert registration No: ");
				String rNo = key.next();
				System.out.print("Insert owner: ");
				String owner = key.next();
				Vehicle kendaraan = new Vehicle(rNo, owner);
				System.out.println(kendaraan.toString());
				break;

				case 2:
				System.out.println("--Menu Car--");
				System.out.print("Insert registration No: ");
				String reNo = key.next();
					System.out.print("Insert owner: ");
				String own = key.next();
				System.out.print("Inser seat capacity: ");
				int seatCapa = key.nextInt();
				Car mobil = new Car(reNo, own, seatCapa);
				System.out.println(mobil.toString());
				break;

			case 3:
				System.out.println("---Menu Bus---");
				System.out.print("Insert registration No: ");
				String rN = key.next();
				System.out.print("Insert owner: ");
				String OWN = key.next();
				System.out.print("Insert sitting capacity: ");
				int sitCapa = key.nextInt();
				System.out.print("Insert standing capacity: ");
				int standCapa = key.nextInt();
				Bus bis = new Bus(rN, OWN, sitCapa, standCapa);
				System.out.println(bis.toString());
				break;

			default:
				System.out.println("Wrong Number");
				break;
			}

			System.out.print("Ingin mengulang??(y/n) ");
			anws = key.next().charAt(0);

			if (anws == 'n')
			{
				System.out.println("Thank you for using this program");
			}
			else
			{
				System.out.println("Wrong input!!!");
			}
		}
	}
}


