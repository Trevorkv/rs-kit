


/**
 * Class: Item
 * Description: Models purchase items with properties such as its name, price,
 *          quantity, and type of purchase (I.E. Utilities, groceries, misc,etc)
 * @author Ray, Kim, and Trevor
 * Date Created: Oct. 02, 2016
 * History: 
 */
public class Item {   
    String catagory;
    String itemName;
    float itemPrice;
    short itemUnit;   

    
    /**
     * Method: getCatagory
     * Description: Returns the catagory property of the instance of the class
     * Date Created: Oct. 02, 2016
     * History
     */
    public String getCatagory() {
        return catagory;
    }

    
    /**
     * Method: setCatagory
     * Description: Set the catagory property with the value provided
     *          by the parameter.
     * Date Created: Oct. 02, 2016
     * History:
     */
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    
    /**
     * Method(Constructor): Item
     * Description: A Default Constructor for the class
     * Date Created: Oct. 02, 2016
     * History
     */
    public Item() 
    {
        itemName = " ";
        itemPrice = 0;
        itemUnit = 0;   
    }
    
    
    /**
     * Method(Constructor): Item
     * Description: A Constructor for the class
     * Date Created: Oct. 02, 2016
     * History
     */
    public Item(String itemName, float itemPrice, short itemUnit) 
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemUnit = itemUnit;
        
    }

    
    /**
     * Method: getItemName
     * Description: A Getter method that returns the itemName property
     *          of the object.
     * @return: String
     * Date Created: Oct. 02, 2016
     * History:
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Method: setItemName
     * Description: A setter that sets the itemName property
     *          of the object with the provided parameter.
     * @Param: String - itemName
     * Date Created: Oct. 02, 2016
     * History:
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    
    /**
     * Method:  getItemPrice
     * Description: A getter that returns the itemPrice property
     *          of the object.
     * @return: Double - itemPrice
     * Date Created: Oct. 02, 2016
     * History
     */
    public float getItemPrice() {
        return itemPrice;
    }

    
    
    /**
     * Method: setItemPrice
     * Description: Setter that assigns the value form the parameter to 
     *          the itemPrice property of the object.
     * @Param: FLoat - itemPrice
     * Date Created: Oct. 02, 2016
     * History:
     */
    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    
    
    /**
     * Method: getItemUnit
     * Description: A getter that returns the itemUnit property of the 
     *          object.
     * @return: Int - itemUnits
     * Date Created: Oct, 02. 2016
     * History
     */
    public short getItemUnit() {
        return itemUnit;
    }

    
    
    /**
     * Method: setItemUnit
     * Description: A setter that sets the value of the itemUnit property of
     *          the object equal to the value of the parameter.
     * @Param: Short - itemUnit
     * Date Created: Oct. 02, 2016
     * History:
     */
    public void setItemUnit(short itemUnit) {
        this.itemUnit = itemUnit;
    }

    @Override
    /**
     * Method: toString
     * Description: Returns the instance of the class as a string
     * @return: String
     * Date Created: Oct. 02, 2016
     * History
     */
    public String toString() {
        return "Item{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemUnit=" + itemUnit + '}';
    }
    
    /**
     * Method: 
     * Description:
     * @Param:
     * Date Created:
     * History
     */
    
    
}

