package hunterJ.demos.demo1;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

/**
 * 
 * @author Hunter
 * 
 *         This class is a Base Class for all other activities in this Demo I do
 *         this to minimize repeating code that I would otherwise do in every
 *         activity.
 * 
 */
public class Demo1BaseClass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Enable the up icon in the action bar
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
	}

	// This is overridden to ensure that no matter what direction you come at
	// the activity from, the up action is enabled
	protected void onRestart() {
		super.onRestart();
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
	}

	// This just sets the up action to finish the current activity
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
		case android.R.id.home:
			this.finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
