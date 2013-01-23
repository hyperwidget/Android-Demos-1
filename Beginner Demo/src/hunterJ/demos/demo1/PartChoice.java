package hunterJ.demos.demo1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 
 * @author Hunter
 * 
 *         This class pretty much just lets the user pick which part of the demo
 *         they'd like to view.
 * 
 */
public class PartChoice extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.part_main);
	}

	public void partOne(View view) {
		Intent intent = new Intent(PartChoice.this, PartOne.class);
		startActivity(intent);
	}

	public void activityTwo(View view) {
		Intent intent = new Intent(PartChoice.this, PartTwo.class);
		startActivity(intent);
	}

	public void activityThree(View view) {
		Intent intent = new Intent(PartChoice.this, PartThree.class);
		startActivity(intent);
	}

}
