void main(){

        // Opgave 1
        double priceOfMilk = 20.00;
        double priceOfSoda = 25.00;
        double priceOfBeef = 60.00;

        double totalPrice = priceOfMilk + priceOfSoda + priceOfBeef;
        double VAT = 0.25;
        double priceWithVAT = totalPrice + totalPrice * VAT;
        System.out.println(priceWithVAT);

        // Opgave 2
        double food = 450.0;
        double drinks = 120.0;
        double tips = 50.0;
        int numberOfPersons = 4;

        double totalBill = food + drinks + tips;
        double pricePerPerson = totalBill / numberOfPersons;
        System.out.println(pricePerPerson);

        // Opgave 3
        double originalPrice = 300.0;
        double discountPercent = 20.0;
        double discountAmount = originalPrice * discountPercent / 100;
        double priceAfterDiscount = originalPrice - discountAmount;
        double vatPercent = 25.0;
        double vatAmount = priceAfterDiscount * vatPercent / 100;
        double finalPrice = priceAfterDiscount + vatAmount;

        System.out.println(originalPrice);
        System.out.println(priceAfterDiscount);
        System.out.println(finalPrice);

        // Opgave 4
        int numberOfGuests = 15;
        int numberOfCupcakes = 40;

        int cupcakesPerGuest = numberOfCupcakes / numberOfGuests;
        int remainingCupcakes = numberOfCupcakes % numberOfGuests;

        System.out.println(cupcakesPerGuest);
        System.out.println(remainingCupcakes);

        // Opgave 5
        StringBuilder greeting = new StringBuilder();
        String name = "Anna";
        int age = 25;

        greeting.append("Hello, ");
        greeting.append(name);
        greeting.append("! ");
        greeting.append("You are ");
        greeting.append(age);
        greeting.append(" years old.");

        System.out.println(greeting);

        // Opgave 6
        int score = 100;
        System.out.println(score);

        score += 50;
        System.out.println(score);

        score += 25;
        System.out.println(score);

        // Opgave 7
        int health = 100;

        health -= 15;
        System.out.println(health);

        health -= 20;
        System.out.println(health);

        // Opgave 8
        double price = 50.0;
        System.out.println(price);

        price *= 2;
        System.out.println(price);

        // Opgave 9
        int counter = 10;
        System.out.println(counter);

        counter++;
        System.out.println(counter);

        counter--;
        System.out.println(counter);

        // Opgave 10
        int number = 10;

        number += 5;
        System.out.println(number);

        number -= 3;
        System.out.println(number);

        number++;
        System.out.println(number);

        number--;
        System.out.println(number);
    }


