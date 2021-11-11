import motori.*;
import java.util.Scanner;
import automobili.*;

public class MainAutomobili {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci la marca e il modello dell'automobile");
		Automobile a = new Automobile(in.next(), in.next());
		System.out.println(a);
	}
}