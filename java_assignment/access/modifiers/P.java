package access.modifiers;

public class P {
		
		public void methodpublic() 
		{
			System.out.println("class P:methodpublic");
		}
		protected void methodprotected()
		{
			System.out.println("class P:methodprotected");
		}
		private void methodprivate()
		{
			System.out.println(" class P: methodprivate");
		}
		void methoddefault()
		{
			System.out.println("class M:methoddefault\n");
		}
		
		public static void main(String[] args) 
		{
			new M().methodpublic();
			new M().methodprotected();
			new M().methoddefault();
			
			new N().methodpublic();
			new N().methodprotected();
			new N().methoddefault();
			
			System.out.println("Value of  M long  "+ new M().B);
			System.out.println("Value of  M float  "+ new M().C);
			System.out.println("Value of  N long "+ new N().b);
			System.out.println("Value of  N double  "+ new N().c);

		}

	}


