import java.util.Arrays;
import java.util.Comparator;

public class Bruch implements Comparable{
	public static final Bruch ONE = new Bruch(1,1);
	public static final Bruch ZERO = new Bruch(0,1);
	
	public static final Comparator NENNER_COMP = new NennerComparator();
	//z.B. Arrays.sort( x, Bruch.NENNER_COMP);
	
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + n;
		result = prime * result + z;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Bruch other = (Bruch) obj;
		
		return this.z==other.z && this.n==other.n;
	}
	private int z;
	private int n;
	public Bruch(int z, int n){
		if( n==0 ) throw new IllegalArgumentException("Nenner null");
		int ggt = ggT(z, n);
		z = z/ggt; n = n/ggt;
		if( n<0 ){ 
			z=-z; 
			n=-n; 
		}
		this.z=z; this.n=n;
	}
	public Bruch add( Bruch b ){
		int zneu = this.z*b.n + b.z*this.n;
		int nneu = this.n*b.n;
		return new Bruch( zneu, nneu);
	}
	public Bruch negate(){
		return new Bruch(-z, n);
	}
	public Bruch subtract( Bruch b ){
		return add( b.negate() );
	}	
	public Bruch mult( Bruch b ){
		return new Bruch( z*b.z, n*b.n );
	}
	public Bruch invert(){
		return new Bruch( n, z );
	}
	public Bruch divide( Bruch b ){
		return mult( b.invert() );
	}
	public String toString(){
		return z + (n==1?"":"/"+n);
	}
	public boolean equals2( Object o ){
		Bruch b = (Bruch)o;
		return this.z==b.z && this.n==b.n;
	}
	



	static int 	ggT	(int a, int b){
	   if(a<0) a = -a;
	   if(b<0) b = -b;
	   while( b!=0 ){
	      int r=a;
	      a = b;
	      b = r%b;
	   }
	   return a;
	}
	@Override
	public int compareTo(Object o) {
		Bruch that = (Bruch)o;
		//Vergleiche Br�che this und that: 
		//    negativ, wenn this<that
		//    positiv, wenn this>that
		//    0, wenn this=that
		return this.z*that.n - that.z*this.n;
		
		//return this.n - that.n;
	}
	static class ZaehlerComparator implements Comparator{
		public int compare(Object o1, Object o2) {
			Bruch b1 = (Bruch)o1;
			Bruch b2 = (Bruch)o2;
			return b1.z - b2.z;
		}	
	}
	static class NennerComparator implements Comparator{
		public int compare(Object o1, Object o2) {
			Bruch b1 = (Bruch)o1;
			Bruch b2 = (Bruch)o2;
			return b1.n - b2.n;
		}	
	}
	public static void main(String[] args) {
		Bruch[] b = new Bruch[4];
		b[0] = new Bruch(2,5);
		b[1] = new Bruch(-2,7);
		b[2] = new Bruch(3,4);
		b[3] = new Bruch(13,25);
		Arrays.sort( b );
		System.out.println( Arrays.toString( b ));
		Arrays.sort( b, new ZaehlerComparator() );
		System.out.println( Arrays.toString( b ));
		Arrays.sort( b, new NennerComparator() );
		System.out.println( Arrays.toString( b ));
	}
}
