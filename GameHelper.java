package chap05;

import java.io.*;

public class GameHelper
{
	public String getUserInput(String prompt)
	{
		String inputLine = null;
		System.out.ptint(prompt + " ");
		try
		{
			BufferedReader is = new bufferedreader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0)
				retrun null;
		}
		catch (IOException e)
		{
			system.out.println("IOException: " + e);
		}
		
		return inputLine;
	}
}
