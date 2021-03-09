package snackbar;

public class Customer
{
	/*
Customer has fields (so knows)

maxId - keep track of last used customer id
id - automatically generated field
name
cash on hand
Customer has methods (so can)

get id
set and get name
add cash to cash on hand
get cash on hand
buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
	*/

private static int maxId = 0;
private int id;
private String name;
private double cash;

public Customer(String name, double cash)
{
	maxId++;
	id = maxId;
	this.name = name;
	this.cash = cash;
}

public int getId()
{
	return id;
}

public String getName()
{
	return name;
}

public void setName(String name)
{
	this.name = name;
}

public double getCash()
{
	return cash;
}

public double addCash(double cash)
{
	return this.cash = this.cash + cash;
}

public double buySnacks(double cost)
{
	return this.cash = this.cash - cost;
}
}