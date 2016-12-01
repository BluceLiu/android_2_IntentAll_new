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

public class ActionActivity extends Activity {

	TextView actiontxt;
	Button fanhui4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_action);
		actiontxt=(TextView)findViewById(R.id.actiontxt);
		fanhui4=(Button)findViewById(R.id.btnfanhui4);
		fanhui4.setOnClickListener(new FanHuiOnClick());
		
		Intent intent=this.getIntent();
		String action=intent.getAction();
		
		
		actiontxt.setText(actiontxt.getText()+"\naction="+action);
		
	}

	

	class FanHuiOnClick implements OnClickListener{

		@Override
		public void onClick(View v) {
			ActionActivity.this.finish();
		}
		
	}
}
