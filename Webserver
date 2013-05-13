import java.io.*;
import java.net.*;
import java.util.*;


public class Server {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket server = null;
		HashMap<String, String> table = new HashMap<String,String>();
		table.put("opiniatre", "opiniatre.htm");
		
		try
		{
			server = new ServerSocket(12392);
		}
		catch(Exception ex)
		{
			System.out.println("Couldn't start server");
			System.exit(1);
		}
		
		Socket socket = null;
		
		try
		{
			socket = server.accept();
		}
		catch(Exception ex)
		{
			System.out.println("Couldn't connect to server");
			System.exit(1);
		}
		
		try
		{
			String in = null;
			BufferedReader rd = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter wt = new PrintWriter(socket.getOutputStream(), true);
			
			while((in = rd.readLine()) != null)
			{
				//in = rd.readLine();
				String toreturn = table.get(in);
				
				if(toreturn != null)
				{
					StringBuilder strb = new StringBuilder();
					BufferedReader read = new BufferedReader(new FileReader(toreturn));
					String line = null;
					while(true)
					{
						line = read.readLine();
						if(line == null) break;
						strb.append(line+"\n");
						
					}
					wt.println(strb);
					
						read.close();
					
				}
					
				else
					wt.println("no website found!");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
