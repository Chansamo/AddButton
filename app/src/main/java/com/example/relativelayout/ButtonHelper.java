package com.example.relativelayout;

import android.content.Context;
import android.view.View;
import android.widget.Button;

public class ButtonHelper {

    public static Button create(Context contrext , String Text){

        Button result;
        result =new Button(contrext);

        result.setText(Text);
        return result;
    }

    public static Button create(Context contrext , String Text, View.OnClickListener callback){

        Button result;
        result =new Button(contrext);

        result.setText(Text);
        return result;
    }
}
