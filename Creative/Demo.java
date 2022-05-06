class Demo
{
    public static void main(String[] args)
    {
        GiftShop shopingcart = new ShopingCart();
        shopingcart.processOrder(true);
        System.out.println();
        GiftShop buygifts = new BuyGifts();
        buygifts.processOrder(true);
    }
}
