package com.yzz.adventure.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import com.yzz.adventure.R;
import com.yzz.adventure.service.MainService;
import com.yzz.adventure.tools.L;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CreatPlayerActivity extends AppCompatActivity {

    @BindView(R.id.et_inputname)
    EditText etInputname;
    @BindView(R.id.btn_create)
    Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creat_player);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_create)
    public void onClick() {
        if (!TextUtils.isEmpty(etInputname.getText())){
            L.v(String.valueOf(MainService.CreatePlayer(etInputname.getText().toString())));
            MainService.CreateContext();
        }else {
            etInputname.setHint(getResources().getString(R.string.UI_EDIT_INPUTNAME));
        }
    }
}
