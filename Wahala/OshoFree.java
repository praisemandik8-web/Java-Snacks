public class OshoFree{
    public static double oshoFreee(double cartTotal, String promoCode){
        double discount1 = 0.1 * cartTotal;
        double discount2 = 0.2 * cartTotal;
        double discount3 = 0.35 * cartTotal;
        if (cartTotal < 5000){
        return cartTotal;
        }
        if(cartTotal >= 5000 && cartTotal <= 14999 && promoCode == "STARTER10"){
            return cartTotal - discount1;
            }
        if(cartTotal >= 15000 && cartTotal<= 29999 && promoCode == "BIGBOY20" ){
            return cartTotal - discount2;
            }
        if (cartTotal >=30000 && promoCode == "OSHOFREE35"){
            return cartTotal - discount3;
            }
        else{
            System.out.println("Invalid ");
            return cartTotal;
            }
        
      
           }
        public static void main(String[]args){
    System.out.println(oshoFreee(5000, "STARTER10"));
    }
  
} 
    
