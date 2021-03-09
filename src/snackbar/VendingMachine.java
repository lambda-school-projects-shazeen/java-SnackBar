package snackbar;

public class VendingMachine
{
	/*
Vending machine has fields (so knows)

maxId - keep track of last used vending machine id
id - automatically generated field
name
Vending Machine has methods (so can)

get id
set and get name
	*/

private static int maxId = 0;
private int id;
private String name;

public VendingMachine(String name)
{
	maxId++;
	id = maxId;

	this.id = id;
	this.name = name;
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
}