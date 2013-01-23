package hunterJ.demos.demo1;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * 
 * @author Hunter
 * 
 *         This class initializes the list view based on the array defined in
 *         the strings resource and sets the on click for the List
 */
public class PartThreeListFragment extends ListFragment {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		// Standard array adapter with predefined google standard list view,
		// places in this activity using the listvalues array
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, this.getResources()
						.getStringArray(R.array.listValues));
		// Set the arrayadapter we just set up to the current listfragment
		setListAdapter(adapter);
	}

	// OnListClickListener for ListFragment, will check if details fragment is
	// in the current layout and that it isn't null, and call it's set text
	// method (for landscape), or if it's in portrait it will start a new intent
	// just like a normal activity(because it is)
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// Use fragment manager to get detailFragment
		PartThreeDetailFragment fragment = (PartThreeDetailFragment) getFragmentManager()
				.findFragmentById(R.id.detailFragment);
		// Check if it exists and that it's in the current layout
		if (fragment != null && fragment.isInLayout()) {
			// If so, call it's setText method with the current item's position
			fragment.setText(position);
		} else {
			// Otherwise start a new intent with the DetailActivity class
			Intent intent = new Intent(getActivity().getApplicationContext(),
					PartThreeDetailActivity.class);
			// Put the position value as an extra int in the bundle
			intent.putExtra("value", position);
			// Start the DetailActivity
			startActivity(intent);
		}
	}
}
