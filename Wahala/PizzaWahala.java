public class PizzaWahala{
    public static void calculateOrder(int numberOfPeople, String pizzaType){

        int slicesPerBox = 0;
        int pricePerBox = 0;

    switch (pizzaType) {
    case "sapa size":
    slicesPerBox = 2500;
    break;

    case "small money":
        slicesPerBox = 6;
        pricePerBox = 2900;
        break;

    case "big boys":
        slicesPerBox = 8;
        pricePerBox = 5200;
        break;

    case "odogwu":
        slicesPerBox = 12;
        pricePerBox = 5200;
        break;

    default:
        System.out.println("Invalid pizza type");
        return;

}

    int boxes = (numberOfPeople + slicesPerBox -1)/slicesPerBox;

    int totalSlices = boxes * slicesPerBox;    
    int leftoverSlices = totalSlices - numberOfPeople;
    int totalPrice = boxes * pricePerBox;

    System.out.println("Number of boxes to buy " + boxes);
    System.out.println("Leftover slices " + leftoverSlices);
    System.out.println("Total price: " + totalPrice);

}
        public static void main(String[] args){
        calculateOrder(45, "odogwu");

}















}
