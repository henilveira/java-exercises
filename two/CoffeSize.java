package two;

public enum CoffeSize {

    PEQUENO("Pequeno", "Café", 2),
    MÉDIO("Médio", "Café", 4),
    GRANDE("Grande", "Café", 7);

    private String name;
    private String type;
    private int price;

    CoffeSize(String type, String name, int price) {
        this.name = name;
        this.price = price;
        this.type = type;

    }

    public int getPrice() { return price; }
    public String getName() { return name; }
    public String getType() { return type; }
}
