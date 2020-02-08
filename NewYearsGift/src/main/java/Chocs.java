public class Chocs implements Item {
  public String item_name;
  public double item_weight;
  public double item_price;
 
    public void setItemName(String item_name)
    {
        this.item_name=item_name;
    }
   
    public void setItemPrice(double item_price)
    {
        this.item_price=item_price;
    }
   
    public void setItemWeight(double item_weight)
    {
        this.item_weight=item_weight;
    }
   
    public String getItemName()
{
return this.item_name;
}
    public double getItemWeight()
{
return this.item_weight;
}
public double getItemPrice()
{
return this.item_price;
}

}