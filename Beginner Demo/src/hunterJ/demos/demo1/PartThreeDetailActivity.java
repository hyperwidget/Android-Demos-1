package hunterJ.demos.demo1;

import android.os.Bundle;
import android.webkit.WebView;

/**
 * 
 * @author Hunter
 * 
 *         This activity is used in the portrait version of the detail webview.
 *         It retrieves the value passed in through the bundle (the index of the
 *         selected listItem) and displays a page based on the result
 */
public class PartThreeDetailActivity extends Demo1BaseClass {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.part_three_details_fragment);
		// Get Bundle info
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			// Get list Index
			int item = extras.getInt("value");
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
			WebView wv = (WebView) findViewById(R.id.webView);
			// Load URL into WebView
			wv.loadUrl(url);
		}

	}
}
