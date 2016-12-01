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
			//ϰ���÷�
			Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
			intent.putExtra("uname", uname.getText());
			intent.putExtra("user", user);
			
			//ʹ��
//			ComponentName componentName=new ComponentName(FirstActivity.this, ComponentNameActivity.class);
//			Intent intent=new Intent();
//			intent.setComponent(componentName);
			
			//action���÷�
//			/*
//			 * һ��action����һ���ַ�����ʲô���ֶ�����ν��
//			     �Զ���action��Ŀ�ģ����ǽ���A����һ������action��Intent������b��Ӧ���action����������������
//			    �����ĺô�����ֻҪ����B��intent���䣬��ʹB�������ı䣬Ҳ����Ҫ����A�Ĵ��룬������A��B��2��Ӧ�ó����ʱ��
//			  <intent-filter>
//			  <action android:name="cn.thcic.intent.MY_ACTION"/><!--���ô��� ֻ�ǲ���һ��action��ת  -->
//			  <category android:name="android.intent.category.DEFAULT"/>------����ָ��
//  		</intent-filter>
//			 * */
//		    //public static final String MY_ACTION="com.litsoft.android1.MY_ACTION"; 
//
			
			
			
//			Intent intent=new Intent();//����ָ��������ת���� new Intent(FirstActivity.this, SecondActivity.class);
//			intent.setAction("cn.thcic.intent.MY_ACTION");//ָ����ǰintent��action�����ȼ�������activity������activity���������仯��
////										//��Ӱ��action����Ӧ�����Ƕ��activity����ͬ��actionʱ��ϵͳ�ᵯ��ѡ��򣬽���ѡ�񣬳��ǣ���action���ò�ͬ��Category��Ҳ����˵
//										//ͬ��action����Ӧ��ο�Category��ֵ
//			
//			intent.addCategory(MY_CATEGORY);//ָ��Ҫ��ת������
			
			
			//ʹ��ϵͳ�鿴��ϵ�˹���
//			Intent intent=new Intent();
//		    intent.setAction(Intent.ACTION_GET_CONTENT);
//		    intent.setType("vnd.android.cursor.item/phone");

			//Data����
//			Uri data=Uri.parse("http://www.163.com");
//			Intent intent=new Intent();
//			intent.setAction(Intent.ACTION_VIEW);
//			intent.setData(data);
			
			//Category����
//			Intent intent=new Intent();
//            intent.setAction(Intent.ACTION_MAIN);
//            intent.addCategory(Intent.CATEGORY_HOME);

			FirstActivity.this.startActivity(intent);
		}
		
	}
}
