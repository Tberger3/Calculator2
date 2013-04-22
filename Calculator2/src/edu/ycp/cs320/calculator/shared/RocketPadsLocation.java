package edu.ycp.cs320.calculator.shared;

public class RocketPadsLocation 
{
	// Fields
	private int x, y;
	
	public RocketPadsLocation(int X, int Y)
	{
		x = X;
		y = Y;
	}
	
	public void setX(int X)
	{
		x = X;
	}
	
	public void setY(int Y)
	{
		y = Y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	// Compares this location to the argument location. If they are the same, returns 1. Otherwise, returns -1.
	public int compareLocTo(RocketPadsLocation location)
	{
		if(this.x == location.x && this.y == location.y)
			return 1;
		else
			return -1;
	}
}