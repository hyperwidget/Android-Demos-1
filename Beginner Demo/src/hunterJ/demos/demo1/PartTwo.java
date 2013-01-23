package hunterJ.demos.demo1;

import java.util.Random;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * 
 * @author Hunter
 * 
 *         Part two gets a string array (the same one from part 3), generates a
 *         random number to pick a random number from the array. The user is to
 *         press a button to go to another activity, and the same string will be
 *         displayed when they return
 */
public class PartTwo extends Demo1BaseClass {

	// Holds the chosen string
	private String randomString;

	// Holder for the String array that's defined in the strings resources file
	private String stringArray[];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.part_two);

		stringArray = getResources().getStringArray(R.array.listValues);
		// Initialize java random
		Random random = new Random();

		// Use the random to pick a random string from the string array and
		// store that string in a variable
		randomString = stringArray[random.nextInt(stringArray.length)];

		// get textview
		TextView showString = (TextView) findViewById(R.id.textViewRandom);
		// Set textview to the random string
		showString.setText(randomString);
	}

	// This part isn't necessary for our implementation, however if you had a
	// more complicated procedure and still wanted to save the variable to be
	// shown upon return,you could store it in the outState to be accessed from
	// the savedInstanceState in onRestoreInstanceState
	protected void onSaveInstanceState(Bundle outState) {
		outState.putString("value", randomString);
	}

	// Again, not needed - just here as an example. onRestoreInstanceState and
	// onCreate are both called with the app returns to this activity. By
	// setting this up, we ensure that randomString will continue to show the
	// same value as when we started the other activity
	protected void onRestoreInstanceState(Bundle savedInstanceState) {

		// get String from saved state
		randomString = savedInstanceState.getString("value");

		// Show string in TextView
		TextView showString = (TextView) findViewById(R.id.textViewRandom);
		showString.setText(randomString);
	}

	public void nextActivity(View view) {
		// Initialize new intent, and add the randomstring as an extra into it
		Intent intent = new Intent(PartTwo.this, PartTwoSecond.class);
		intent.putExtra("randomString", randomString);

		// Start the intent
		startActivity(intent);
	}

}
