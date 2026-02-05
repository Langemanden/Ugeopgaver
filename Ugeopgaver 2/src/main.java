void main(){

//Opgave 1
    double totalPrice = 1100;
    double finalPrice;

    if(totalPrice > 1000) {
        finalPrice = totalPrice * 0.8;
        System.out.println("Discount applied to your purchase!");
    } else{
        finalPrice = totalPrice;
    }

    System.out.println("Final price: " + finalPrice + " kr");


//Opgave 3
    int timeOfDay = 14;

    if(timeOfDay >= 5 && timeOfDay <= 11) {
        System.out.println("Good morning");
    } else if(timeOfDay >= 12 && timeOfDay <= 17){
        System.out.println("Good afternoon");
    } else if(timeOfDay >= 18 && timeOfDay <= 21) {
        System.out.println("Good evening");
    } else {
        System.out.println("Good night");
    }


//Opgave 5
    double totalPrice2 = 350.0;
    boolean isMember = true;
    double shippingCost;

    if (totalPrice2 > 500 || (isMember && totalPrice2 > 200)) {
        shippingCost = 0.0;
        System.out.println("Free shipping!");
    } else {
        shippingCost = 50.0;
    }

    double finalTotal = totalPrice2 + shippingCost;
    System.out.println("Subtotal: " + totalPrice2 + " kr");
    System.out.println("Shipping: " + shippingCost + " kr");
    System.out.println("Total: " + finalTotal + " kr");


//Opgave 8
    int age = 70;
    boolean hasAccidents = false;
    int accidents = 0;
    boolean riskZone = false;

    int basePremium = 5000;
    int premium;

    if ((age < 25 || age > 70) || (hasAccidents && accidents > 2) || riskZone) {
        premium = basePremium + 2000;
        System.out.println("Higher risk category");
    } else {
        premium = basePremium;
        System.out.println("Standard risk category");
    }

    System.out.println("Annual premium: " + premium + " kr");
}


