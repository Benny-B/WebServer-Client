import java.io.*;
import java.net.*;


public class WebClient {

  /**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Socket echoSocket = null;
		PrintWriter wt = null;
		BufferedReader rd = null;
		
		
		
		try
		{
			echoSocket = new Socket("127.0.0.1", 12391);
			wt = new PrintWriter(echoSocket.getOutputStream(),true);
			rd = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.exit(1);
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while((input = in.readLine()) != null)
		{
			
			wt.println(input);
			String line = null;
			while(true)
			{
				line = rd.readLine();
				if(line == null ) break;
				System.out.println(line);
			}
			
			
		}
		
		echoSocket.close();
		wt.close();
		rd.close();
		in.close();
		
	}
	

}
