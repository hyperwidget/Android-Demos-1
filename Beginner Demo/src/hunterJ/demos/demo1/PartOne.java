package hunterJ.demos.demo1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 
 * @author Hunter
 * 
 *         Similar to the Part Choice activity, this activity just lets the user
 *         navigate through three different activities
 * 
 */
public class PartOne extends Demo1BaseClass {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void activityOne(View view) {
		Intent intent = new Intent(PartOne.this, Activity1.class);
		startActivity(intent);
	}

	public void activityTwo(View view) {
		Intent intent = new Intent(PartOne.this, Activity2.class);
		startActivity(intent);
	}

	public void activityThree(View view) {
		Intent intent = new Intent(PartOne.this, Activity3.class);
		startActivity(intent);
	}

}
