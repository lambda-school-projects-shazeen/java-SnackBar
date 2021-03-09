package snackbar;

public class Main
{
		public static void main(String[] args)
		{
			System.out.println("fist java homework");

			Customer c1 = new Customer("Shazeen", 100);
			VendingMachine vm1 = new VendingMachine("Vending Machine 1");
			Snack snack1 = new Snack("Soda", 10, 2.50, vm1.getId());

			System.out.println(c1.getName());
		}
}

