package com.yzz.adventure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.yzz.adventure.adapter.RecyclerHAdapter;
import com.yzz.adventure.model.GameContext;
import com.yzz.adventure.model.Monster;
import com.yzz.adventure.service.MainService;
import com.yzz.adventure.service.TestService;
import com.yzz.adventure.tools.L;
import com.yzz.adventure.tools.Random;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.title)
    LinearLayout title;
    @BindView(R.id.player_head)
    ImageView playerHead;
    @BindView(R.id.player_name)
    TextView playerName;
    @BindView(R.id.progressBar_HP)
    ProgressBar progressBarHP;
    @BindView(R.id.textView12)
    TextView textView12;
    @BindView(R.id.progressBar_MP)
    ProgressBar progressBarMP;
    @BindView(R.id.textView11)
    TextView textView11;
    @BindView(R.id.player_info)
    RelativeLayout playerInfo;
    @BindView(R.id.btn_1)
    Button btn1;
    @BindView(R.id.btn_2)
    Button btn2;
    @BindView(R.id.btn_3)
    Button btn3;
    @BindView(R.id.btn_4)
    Button btn4;
    @BindView(R.id.btn_5)
    Button btn5;
    @BindView(R.id.btn_6)
    Button btn6;
    @BindView(R.id.btn_7)
    Button btn7;
    @BindView(R.id.btn_8)
    Button btn8;
    @BindView(R.id.bottom)
    LinearLayout bottom;
    @BindView(R.id.listview)
    ListView listview;
    @BindView(R.id.gv_monster)
    RecyclerView gvMonster;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;


    protected final static int STATE_CITY = 0;
    protected final static int STATE_WILD = 1;
    protected final static int STATE_FIGHT = 2;

    protected GameContext gameContext;
    protected List<Monster> listMonster;
    protected RecyclerHAdapter recyclerHAdapter;
    protected int monster_num = 8; //monster数量
    protected int[] monster_checked = new int[monster_num];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        startActivity(new Intent(this, TestActivity.class));


        Init();
    }

    private void Init() {
//        gameContext = MainService.GetPosition();
//        Position();
        mGridView();
        ChangeState(STATE_CITY);
    }

    private void mGridView() {

        //设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        gvMonster.setLayoutManager(linearLayoutManager);
        initAdapter();

    }

    private void initAdapter() {
        setMonsterChecked(0);
        recyclerHAdapter = new RecyclerHAdapter(R.layout.grid_item,listMonster =MainService.GetMonster(monster_num),monster_checked);

        gvMonster.addOnItemTouchListener(new OnItemClickListener() {
            @Override
            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
//                Toast.makeText(MainActivity.this, "123"+position, Toast.LENGTH_SHORT).show();
                setMonsterChecked(position);
                recyclerHAdapter.notifyDataSetChanged();
            }
        });

        gvMonster.setAdapter(recyclerHAdapter);
    }

    private void setMonsterChecked(int checked) {
        for (int i=0;i<monster_num;i++){
            if (i==checked){
                monster_checked[i]=1;
            }else {
                monster_checked[i]=0;
            }
        }
    }


    private void Position() {
        switch (gameContext.getPosition()){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;

        }
    }

    @OnClick({R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4, R.id.btn_5,R.id.btn_6, R.id.btn_7, R.id.btn_8})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                break;
            case R.id.btn_2:
                break;
            case R.id.btn_3:
                break;
            case R.id.btn_4:
                break;
            case R.id.btn_5:
                break;
            case R.id.btn_6:
                L.v(String.valueOf(Random.GetRandom(5)));
                break;
            case R.id.btn_7:
                TestService.CreateMonster();
                break;
            case R.id.btn_8:
                ChangeState(STATE_CITY);
                break;
        }
    }


    private void ChangeState(int state){

        switch (state){
            case STATE_CITY:
                break;
            case STATE_WILD:
                break;
            case STATE_FIGHT:
                break;
        }
    }

}
