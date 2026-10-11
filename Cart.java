class Cart {
    private int[] prices;
    private int count;
    private final String id;

    Cart(String id, int size) {
        this.id = id;
        prices = new int[size];
    }

    void addItem(int price) {
        if (count < prices.length)
            prices[count++] = price;
    }

    int getTotal() {
        int total = 0;
        for (int i = 0; i < count; i++)
            total += prices[i];
        return total;
    }

    int getItemCount() {
        return count;
    }

    public static void main(String[] args) {
        Cart c = new Cart("CART-5", 20);
        c.addItem(250);
        c.addItem(99);
        c.addItem(151);

        System.out.println(c.getTotal());
        System.out.println(c.getItemCount());
    }
}
