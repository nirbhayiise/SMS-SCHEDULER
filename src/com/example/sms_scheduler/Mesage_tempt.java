package com.example.sms_scheduler;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class Mesage_tempt extends Activity  {
  ListView l;
  Intent i;
  ArrayAdapter<Object> aa;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_mesage_tempt);
       l=(ListView)findViewById(R.id.lst);
      i =new Intent(this,Add_sms.class);
       load();
       l.setOnItemClickListener(new OnItemClickListener() {

		public void onItemClick(AdapterView<?> parent, View v, int posn,
				long id) {
			String value=(String) l.getItemAtPosition(posn);
			Toast.makeText(getApplicationContext(), value, 1000).show();
			i.putExtra("templet", value);
			startActivity(i);
			
		}
	});
    }

public void load()
{
	 String[] str={"Hello Good Mrng","Call You Later","How are you","Happy Birthday","Sorry!!","Thank You !"," Love you","How Are You","Call me Now","How are You"};
     ArrayAdapter<Object> aa=new ArrayAdapter<Object>(this, android.R.layout.simple_expandable_list_item_1, str);
     l.setAdapter(aa);
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mesage_tempt, menu);
        return true;
    }

	

	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
