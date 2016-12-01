package cn.thcic.intent;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class AllActivity extends ListActivity {//�̳еĸ��಻ͬ

	/* (non-Javadoc)
	 * @see android.app.ListActivity#onListItemClick(android.widget.ListView, android.view.View, int, long)
	 */
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		if(position==0){
//			Intent intent=new Intent();
//			Uri uri=Uri.parse("content://contacts/people/2");//����������ʶ���룬Ҳ���Ǳ�ţ���д����ʾ���У����ֱ��벻�����������쳣
//			intent.setData(uri);
//			intent.setAction(Intent.ACTION_VIEW);
//			startActivity(intent);
			
			//Intent intent=new Intent(Intent.ACTION_VIEW,ContactsContract.Contacts.CONTENT_URI);//Ч���ǲ�ѯ����
			Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/2"));//Ч������ʾ���Ϊ2����ϵ��
			startActivity(intent);
			
		}
		
		if(position==1){
			Intent intent=new Intent();
			Uri uri=Uri.parse("content://contacts/people/1");//����������ʶ���룬Ҳ���Ǳ�ţ���д����ʾ���У����ֱ��벻�����������쳣
			intent.setData(uri);
			intent.setAction(Intent.ACTION_EDIT);
			startActivity(intent);
		}
		
		if(position==2){
			Intent intent=new Intent();
			Uri uri=Uri.parse("tel:186");
			intent.setData(uri);
			intent.setAction(Intent.ACTION_DIAL);//��ʾ����绰�Ľ���
			startActivity(intent);
			
		
		}
		if(position==3){
			Intent intent=new Intent();
			Uri uri=Uri.parse("tel:18612078201");//
			intent.setData(uri);
			intent.setAction(Intent.ACTION_CALL);//ֱ�Ӳ���绰����
			startActivity(intent);
		}
		if(position==4){
			Intent intent=new Intent();
			Uri uri=Uri.parse("http://www.baidu.com");//
			intent.setData(uri);
			intent.setAction(Intent.ACTION_VIEW);
			startActivity(intent);
		}
		if(position==5){
//			Intent intent=new Intent();
//			Uri uri=Uri.parse("geo:39.92,116.46");//
//			intent.setData(uri);
//			intent.setAction(Intent.ACTION_VIEW);
//			startActivity(intent);
			
			Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/?saddr=34.052222,-118.243611"));
			startActivity(intent);
			
		}
		if(position==6){
			Intent intent=new Intent();
			Uri uri=Uri.parse("smsto:15032921938");//smsto 
			intent.setData(uri);
			intent.setAction(Intent.ACTION_SENDTO);
			startActivity(intent);
		}
		if(position==7){
//			Intent intent=new Intent();
//			Uri uri=Uri.parse("mailto:289889313@163.com");//smsto 
//			intent.setData(uri);
//			intent.setAction(Intent.ACTION_SENDTO);
//			startActivity(intent);
			Intent data=new Intent(Intent.ACTION_SENDTO);
			
			data.setData(Uri.parse("mailto:289889313@gmail.com"));
			data.putExtra(Intent.EXTRA_SUBJECT, "���Ǳ���");
			data.putExtra(Intent.EXTRA_TEXT, "��������");
			startActivity(data);

//			Intent data=new Intent(Intent.ACTION_SENDTO);
//			data.setData(Uri.parse("mailto:way.ping.li@gmail.com"));
//			data.putExtra(Intent.EXTRA_SUBJECT, "���Ǳ���");
//			data.putExtra(Intent.EXTRA_TEXT, "��������");
//			startActivity(data); 
		}
	
	
		
	}

	TextView actiontxt;
	Button fanhui4;
	ListView l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_all);
		l=(ListView)findViewById(R.id.list);
		String[] menus = { "�鿴�绰��Ϣ", "�༭�绰��Ϣ", "��ʾ����绰����",
				"ֱ�Ӵ�绰","���������","���ʵ�ͼ","���Ͷ���","�����ʼ�289@qq.com"};
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, menus));
		getListView().setTextFilterEnabled(true);
		
	}

	
	

	
}
