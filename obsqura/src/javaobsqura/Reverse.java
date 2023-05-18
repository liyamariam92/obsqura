package javaobsqura;



public class Reverse {
	 int num;
		int r;
		int rev=0;

		public Reverse(int num) {

			this.num = num;
			while(num!=0)
			{
				r=num%10;
				rev=rev*10+r;
				num=num/10;
			}
		}
		
	public Reverse() {
			this(245);
			System.out.println("finding reverse:"+rev);
			System.out.println("result obtained");
		}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	Reverse obj1=new Reverse();
		
	}

	}


