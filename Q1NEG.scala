

object Q1NEG
{
	def main(args:Array[String])
	{
				class ratNum(n:Int,d:Int)
			{
				require(d>0,"d must be greater than zero");
				def numer=n/gcd(n,d);
				def denom=d/gcd(n,d);
				def this(n:Int)=this(n,1);
				private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
				def neg=new ratNum(-this.numer,this.denom);
				override def toString= numer+"/"+denom;
			}
	
	
	
	
	
	
	
	
		val rat1=new ratNum(7,11);
		val rat2=rat1.neg
		println("Number-"+rat1);
		println("Negetion-"+rat2);
		println("\n*********");
	}

}
