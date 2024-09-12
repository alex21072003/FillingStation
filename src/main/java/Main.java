public class Main {
    public static void main(String[] args) {
        int fuelType = 95;
        int amount = 50;
        double fuel192price = 60.2;
        double fuel195price = 67.33;
        double fuelPrise = 0;
        if(fuelType == 92){
            fuelPrise = fuel192price;
        }
        if(fuelType == 95){
         fuelPrise = fuel195price;
        }
        System.out.println("цена выводимого топлива " + fuelPrise + "руб.");
        double totalPrice = fuelPrise * amount;
        System.out.println("общая стоимость заправки " + totalPrice + " руб ");
        System.out.println("Система расчёта стоимости топлива");
        System.out.println(fuelType);
    }
}
