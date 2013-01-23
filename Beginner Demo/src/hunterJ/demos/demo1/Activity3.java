package hunterJ.demos.demo1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/**
 * 
 * @author Hunter
 * 
 *         Simple activity using the activity view, changing the colour and the
 *         text
 */
public class Activity3 extends Demo1BaseClass {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view);
		
		// Find the TextView
		TextView text = (TextView) findViewById(R.id.activitytext);
		text.setText("This is Activity #3 in Part 1, the background should be Orange!!");

		// Find the root view from the textView
		View root = text.getRootView();

		// Set the background colour
		root.setBackgroundColor(getResources().getColor(
				android.R.color.holo_orange_light));
	}
}
