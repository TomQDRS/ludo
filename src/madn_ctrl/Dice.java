/*
 * @author Jaqueline Timmermann 
 * @version 1.0
 */
package madn_ctrl;

public class Dice 
{
	private static int numberRolled;
	private static boolean diceRolled;
	
	public static int getNumberRolled() 
	{
		return numberRolled;
	}

	public static void setNumberRolled(int n) 
	{
		numberRolled = n;
	}

	public static boolean isDiceRolled() 
	{
		return diceRolled;
	}

	public static void setDiceRolled(boolean d) 
	{
		diceRolled = d;
	}
}
