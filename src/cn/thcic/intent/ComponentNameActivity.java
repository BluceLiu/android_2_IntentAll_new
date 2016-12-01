package cn.thcic.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComponentNameActivity extends Activity {

	TextView comptxt;
	Button fanhui3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_componentname);
		comptxt=(TextView)findViewById(R.id.comptxt);
		fanhui3=(Button)findViewById(R.id.btnfanhui3);
		fanhui3.setOnClickListener(new FanHuiOnClick());
		
		Intent intent=this.getIntent();
		ComponentName componentName=intent.getComponent();
		String packagename=componentName.getPackageName();
		String classname=componentName.getClassName();
		String shortname=componentName.getShortClassName();
		
		comptxt.setText(comptxt.getText()+"\npackagename="+packagename+"\nclassname="+classname+"\nshortname="+shortname);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first, menu);
		return true;
	}

	class FanHuiOnClick implements OnClickListener{

		@Override
		public void onClick(View v) {
			ComponentNameActivity.this.finish();
		}
		
	}
}
