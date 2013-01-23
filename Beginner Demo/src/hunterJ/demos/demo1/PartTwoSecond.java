package hunterJ.demos.demo1;

import android.os.Bundle;
import android.widget.TextView;

//Simple class to show that we're in a new activity.
public class PartTwoSecond extends Demo1BaseClass {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.part_two_second);

		// Get string from extras
		String passedIn = getIntent().getExtras().getString("randomString");

		// Set passedIn string to be text value
		TextView tv = (TextView) findViewById(R.id.activitytext);
		tv.setText(passedIn);
	}
}
