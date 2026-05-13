public class OshoFree{
    public static void oshoFree(int cartTotal, String promoCode){
        int discount1 = 0.1 * cartTotal;
        int discount2 = 0.2 * cartTotal;
        int discount3 = 3.5 * cartTotal;
        if (cartTotal < 5000){
        System.out.println("STARTER10(not applicable below N5k)")
        else if(cartTotal >= 5000 && cartTotal <= 14999 && promoCode == "STARTER10"){System.out.println(cartTotal - discout1);
            }
        else if(cartTotal >= 15000 && cartTotal<= 29999 && promoCode == "BIGBOY20" ){System.out.println(cartTotal - discount2)};
        else if (cartTotal >=30000)(System.out.println(cartTotal - discount3));
        else{System.out.println("Invalid ")}
        return;
        }
    } 
    public static void main(String[]args){
    System.out.println(oshoFree(8000, STARTER10);)
    }
}
