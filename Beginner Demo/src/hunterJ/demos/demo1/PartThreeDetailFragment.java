package hunterJ.demos.demo1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * 
 * @author Hunter
 * 
 *         This fragment is for the landscape view of part 3. It displays a
 *         blank window on load, and then after a user passes an index into the
 *         fragment, loads a page in the WebView.
 */
public class PartThreeDetailFragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	// Standard onCreateView for fragment inflation
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.details, container, false);
		return view;
	}

	// Recieves index
	public void setText(int item) {
		String url = "http://www.google.ca";
		// Switch to get URL based on index
		switch (item) {
		case 0:
			url = "https://scs.senecac.on.ca/course/ecl500";
			break;
		case 1:
			url = "https://scs.senecac.on.ca/course/dbj565";
			break;
		case 2:
			url = "https://scs.senecac.on.ca/course/prj566";
			break;
		case 3:
			url = "https://scs.senecac.on.ca/course/pro608";
			break;
		case 4:
			url = "http://www.senecac.on.ca/cgi-bin/subject?s1=ses275";
			break;
		default:
			break;
		}
		// Get WebView
		WebView wv = (WebView) getView().findViewById(R.id.webView);
		// Load Url into webview
		wv.loadUrl(url);
	}

}
