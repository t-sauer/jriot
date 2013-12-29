package jriot.main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ApiCaller {
	
	
	public String request(String URL) {
		
		try {
			String requestURL = URL;
			
			URL url = new URL(requestURL);
			
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			
			connection.setDoOutput(true);
			connection.setRequestMethod("GET");
			connection.setInstanceFollowRedirects(false); 
			
			if(connection.getResponseCode() == 404) {
				return "[]";
			}

			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer(); 
			
			while((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			
			connection.disconnect();
			
			
			return response.toString();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

}
