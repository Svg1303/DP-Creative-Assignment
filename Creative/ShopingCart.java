class ShopingCart extends GiftShop
{
 
    public void doSelect()
    {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address.");
    }
 

    public void doPayment()
    {
        System.out.println
                   ("Online Payment through Netbanking, card or Paytm");
    }
 
    
    public void doDelivery()
    {
        System.out.println
                    ("Ship the item through post to delivery address");
    }
 
}
