package hunterJ.demos.demo1;

import android.os.Bundle;

/**
 * 
 * @author Hunter
 * 
 *         Part Three is the most complicated part of the demo. Using fragments
 *         it will show a list view in portrait that will show a webview on
 *         select. In landscape it will show both at the same time.
 */
public class PartThree extends Demo1BaseClass {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.part_three);
	}
}
