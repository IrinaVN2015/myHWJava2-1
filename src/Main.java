public class Main {
    public static void main(String[] args) {

        int ticket = 9999; //стоимость билета
        int bonusesPerMile = 20; //количество рублей для одной бонусной мили

        int x = (ticket / bonusesPerMile); //количество начисленных бонусных миль

        System.out.println((x) + " бонусных миль ");
    }
}