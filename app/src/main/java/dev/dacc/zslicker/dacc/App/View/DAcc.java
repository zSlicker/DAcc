package dev.dacc.zslicker.dacc.App.View;

import dev.dacc.zslicker.dacc.App.Controller.Controller;
import dev.dacc.zslicker.dacc.App.Model.MainModel;
import dev.dacc.zslicker.dacc.R;
import dev.dacc.zslicker.dacc.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class DAcc extends Activity implements View.OnClickListener  {
    private Dialog dlg;

    public Button incomeBtn, outlayBtn, dialogBtn;

 //   public ListView list;

    public MainModel model;

    public Controller controller;
    public MainView mainView;

    //TODO: onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ativity);

      //  list = (ListView) findViewById(R.id.MainListView);
        incomeBtn = (Button) findViewById(R.id.IncomeButton);
        incomeBtn.setOnClickListener(this);
        outlayBtn = (Button) findViewById(R.id.OutlayButton);
        outlayBtn.setOnClickListener(this);
        dialogBtn = (Button) findViewById(R.id.DialogBtn);
        dialogBtn.setOnClickListener(this);

        mainView = new MainView(this);
        controller = new Controller();

        dlg = new Dialog(this);
        dlg.setContentView(R.layout.dialog);
        dlg.setTitle("Test Dialog");
        TextView text = (TextView) dlg.findViewById(R.id.textView);
        text.setText("Test Text");
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_ativity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/
    /**
     * @param v view witch was clicked
     * method where controller gets actions
     */
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.IncomeButton:
                controller.Income();
                break;

            case R.id.OutlayButton:
                controller.Outlay();
                break;

            case R.id.DialogBtn:
                dlg.show();
                break;
        }
    }
}
