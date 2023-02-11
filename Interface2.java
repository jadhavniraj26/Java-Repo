interface Taxable{
  public int cost();
  public int percentGST();
 }
 
 class price implements Taxable{
 public int cost(){
 return (3000);
   } 

 public int percentGST(){
 return (28);
   }
 }
 class Interface2{
 public static void main(String[] args){
 Taxable T = new price();
 System.out.println("Cost Of Product: "+T.cost() + " Gst on Product: "+ T.percentGST());
 }
}