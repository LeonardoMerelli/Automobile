package automobili;
import java.util.*;

public class Targa {

	private int[] targa = new int[7];
	
	public Targa() {
		Random g = new Random(); 
		for(int i = 0; i < 7; i++) {
			if((i >= 0 && i <= 1) || (i >= 5 && i <= 6))
				this.targa[i] = g.nextInt(26) + 65;
			else
				this.targa[i] = g.nextInt(10);
		}
	}
	
	public int[] getTarga() {
		return this.targa;
	}
	
	public String toString() {
		return "[targa= " + (char)this.targa[0] + "" + (char)this.targa[1] + " " + this.targa[2] + "" + this.targa[3] + "" + this.targa[4] + " "
				+ (char)this.targa[5] + "" + (char)this.targa[6] + "]";
	}
}
