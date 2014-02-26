
package co.sdslabs.mdg.sankalp_14;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class CreateEvent extends Activity {
	EditText title, description, time , date, tags;
	Button submit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_event);
		title=(EditText)findViewById(R.id.etTitle);
		description=(EditText)findViewById(R.id.etDescription);
		time=(EditText)findViewById(R.id.etTime);
		date=(EditText)findViewById(R.id.etDate);
		tags=(EditText)findViewById(R.id.etTags);
		submit=(Button)findViewById(R.id.bSubmit);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
