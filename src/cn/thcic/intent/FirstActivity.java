package cn.thcic.intent;

import java.net.URI;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends Activity {

	EditText uname;
	EditText upwd;
	Button tijiao;
	Button quexiao;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		uname=(EditText)findViewById(R.id.uname);
		upwd=(EditText)findViewById(R.id.upwd);
		tijiao=(Button)findViewById(R.id.btntijiao);
		quexiao=(Button)findViewById(R.id.btnquexiao);
		
		tijiao.setOnClickListener(new TiJiaoOnClick());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first, menu);
		return true;
	}

	public static final String MY_ACTION="cn.thcic.intent.MY_ACTION"; 
	public static final String MY_CATEGORY="cn.thcic.intent.MY_CATEGORY"; 
	class TiJiaoOnClick implements OnClickListener{

		@Override
		public void onClick(View v) {
			User user=new User(uname.getText().toString(),upwd.getText().toString());
			//习惯用法
			Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
			intent.putExtra("uname", uname.getText());
			intent.putExtra("user", user);
			
			//使用
//			ComponentName componentName=new ComponentName(FirstActivity.this, ComponentNameActivity.class);
//			Intent intent=new Intent();
//			intent.setComponent(componentName);
			
			//action的用法
//			/*
//			 * 一个action就是一个字符串，什么名字都无所谓。
//			     自定义action的目的，就是界面A发起一个包含action的Intent，界面b响应这个action，进而启动起来。
//			    这样的好处就是只要保持B的intent不变，即使B的类名改变，也不需要更改A的代码，尤其是A、B是2个应用程序的时候。
//			  <intent-filter>
//			  <action android:name="cn.thcic.intent.MY_ACTION"/><!--不用存在 只是测试一下action跳转  -->
//			  <category android:name="android.intent.category.DEFAULT"/>------必须指定
//  		</intent-filter>
//			 * */
//		    //public static final String MY_ACTION="com.litsoft.android1.MY_ACTION"; 
//
			
			
			
//			Intent intent=new Intent();//不能指定具体跳转内容 new Intent(FirstActivity.this, SecondActivity.class);
//			intent.setAction("cn.thcic.intent.MY_ACTION");//指定当前intent的action，优先级，大于activity，当你activity类名发生变化，
////										//不影响action的响应；但是多个activity引用同名action时，系统会弹出选择框，进行选择，除非，给action配置不同的Category，也就是说
//										//同名action的响应会参考Category的值
//			
//			intent.addCategory(MY_CATEGORY);//指定要跳转到类型
			
			
			//使用系统查看联系人功能
//			Intent intent=new Intent();
//		    intent.setAction(Intent.ACTION_GET_CONTENT);
//		    intent.setType("vnd.android.cursor.item/phone");

			//Data属性
//			Uri data=Uri.parse("http://www.163.com");
//			Intent intent=new Intent();
//			intent.setAction(Intent.ACTION_VIEW);
//			intent.setData(data);
			
			//Category属性
//			Intent intent=new Intent();
//            intent.setAction(Intent.ACTION_MAIN);
//            intent.addCategory(Intent.CATEGORY_HOME);

			FirstActivity.this.startActivity(intent);
		}
		
	}
}
