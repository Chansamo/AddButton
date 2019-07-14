package com.example.relativelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class kds_activity extends Activity {

    LinearLayout IIMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kds);

        IIMenu = findViewById(R.id.IIMenu_2);

        Button btn = new Button(this);
        btn.setText("QUIT");
        IIMenu.addView(btn);

        IIMenu.addView(getButtonItem("AAA"));
        IIMenu.addView(getButtonItem("BBB"));
        IIMenu.addView(getButtonItem("CCC"));


        IIMenu.addView(ButtonHelper.create(this,"DDD"));
        IIMenu.addView(ButtonHelper.create(this,"EEE"));
        IIMenu.addView(ButtonHelper.create(this,"FFF"));


        IIMenu.addView(ButtonHelper.create(this,"GGG"));
        IIMenu.addView(ButtonHelper.create(this,"HHH"));
        IIMenu.addView(ButtonHelper.create(this,"III"));
    }

    private Button getButtonItem(String Text){

        Button result;
        result =new Button(this);
        result.setText(Text);
        return result;
    }

    View.OnClickListener OnClickListener=new View.OnClickListener(){

        @Override
        public void onClick(View view) {

        }
    };

}
