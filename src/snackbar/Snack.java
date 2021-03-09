package snackbar;

public class Snack 
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendMachId;

    public Snack(String name, int quantity, double cost, int vendMachId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendMachId = vendMachId;
    }
    //name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    //quantity
    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    //cost
    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }
    //vendMachId
    public int getVendMachId()
    {
        return vendMachId;
    }

    public void setVendMachId(int vendMachId)
    {
        this.vendMachId = vendMachId;
    }
}
