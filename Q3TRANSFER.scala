
object Q3TRANSFER{
  def main(args:Array[String])
  {
    class account(id:String,n:Int,b:Double)
    {
      val nic:String=id 
      val acnumber: Int = n 
      var  balance: Double = b
      
 
      override def toString =   "["+nic+":"+acnumber +":"+ balance+"]"
      
     def transfer(a:account,b:Double)=
       {
        this.balance=this.balance-b
        a.balance=a.balance+b
       }
    }
    val A=new account("986789052v",120,10000)
    val B=new account("962233457v",102,60000)
    val C=new account("714567899v",123,5000)
     
    val t=A.transfer(B,6000)
    println("New balance of A :"+A.balance)
    println("New balance of B :"+B.balance)
  }
}