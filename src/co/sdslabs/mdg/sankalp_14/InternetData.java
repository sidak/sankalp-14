package co.sdslabs.mdg.sankalp_14;

import java.util.List;
import java.io.*;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

public class InternetData {
	
	public String postData(String url, List<NameValuePair> nameValuePairs){
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httppost = new HttpPost(url);
		try{
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			// execute http post request
			HttpResponse response= httpclient.execute(httppost);
			BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer sb= new StringBuffer("");
			String l="";
			String nl =System.getProperty("line.separator");
			while((l=in.readLine())!=null){
				sb.append(l+nl);
			}
			in.close();
			String data=sb.toString();
			Log.i("InternetData:postData()",data);
			return data;
		}
		catch(ClientProtocolException e){
			
		}
		catch(IOException  e){
			
		}
		return null;
		
	}
}
