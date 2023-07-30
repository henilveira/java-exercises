package two;

public class Main {

    public static void main(String[] args) {
        CoffeSize ordered = CoffeSize.PEQUENO;
        System.out.println("Um cliente acaba de pedir um " +ordered.getName()+" " +ordered.getType()+ " " + "por R$:"+ ordered.getPrice()+"!");
    }
}
