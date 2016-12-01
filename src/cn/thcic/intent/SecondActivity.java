package cn.thcic.intent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

	EditText uname2;
	EditText upwd2;
	Button tijiao2;
	Button quexiao2;
	Button fanhui2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		uname2=(EditText)findViewById(R.id.uname2);
		upwd2=(EditText)findViewById(R.id.upwd2);
		tijiao2=(Button)findViewById(R.id.btntijiao2);
		quexiao2=(Button)findViewById(R.id.btnquexiao2);
		fanhui2=(Button)findViewById(R.id.btnfanhui2);
		fanhui2.setOnClickListener(new FanHuiOnClick());
		
		this.getIntent().getStringExtra("uname");
		User user=(User)this.getIntent().getExtras().get("user");//接收对象
		uname2.setText(user.getUname());
		upwd2.setText(user.getUpwd());
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
			SecondActivity.this.finish();
		}
		
	}
}
