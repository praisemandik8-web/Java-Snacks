public class BackToSender{
    public int calculateDailyPay(int successfulDeliveries){
    
    int basePay = 5000;
    int rate;

    if(successfulDeliveries < 50){
        rate = 160;
}   else if (successfulDeliveries <= 59){
        rate = 200;

}   else if (successfulDeliveries <= 69){
        rate = 250;

}   else{
        rate = 500;
}
    public static main{
    return (successfulDeliveries * rate) + basePay;

    }

}
