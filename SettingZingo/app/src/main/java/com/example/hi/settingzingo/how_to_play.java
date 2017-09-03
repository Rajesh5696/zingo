package com.example.hi.settingzingo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Hi on 18-07-2017.
 */

public class how_to_play extends MainActivity {
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_play);
      /*  tx=(TextView)findViewById(R.id.more);
        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Zingo!"));
                startActivity(i);
            }
        });*/

    }
}
