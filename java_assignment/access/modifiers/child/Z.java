package access.modifiers.child;

	import access.modifiers.M;
	import access.modifiers.N;
	import access.modifiers.P;

	public class Z extends M{

		public static void main(String[] args) {
			
			new N().methodpublic();
			new P().methodpublic();

			System.out.println("Variables of long "+new X().j);
			System.out.println("Variables of float"+new X().f);
			System.out.println("Variables of char "+new X().k);
			
		}
	}


