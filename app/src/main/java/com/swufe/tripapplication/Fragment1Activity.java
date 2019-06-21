package com.swufe.tripapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Fragment1Activity extends FragmentActivity {

    private Fragment mFragments[];
    private RadioGroup radioGroup;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private RadioButton rbtHome,rbtService,rbtHelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);

        mFragments = new Fragment[3];       //创建3个元素
        fragmentManager = getSupportFragmentManager();     //获取getSupportFragmentManager()方法，直接调用就可以
        mFragments[0] = fragmentManager.findFragmentById(R.id.fragment_home);    //由fragmentManager通过id查找Fragment，第一个元素转换为0号元素
        mFragments[1] = fragmentManager.findFragmentById(R.id.fragment_service);    //由fragmentManager通过id查找Fragment，第二个元素转换为1号元素
        mFragments[2] = fragmentManager.findFragmentById(R.id.fragment_help); ////由fragmentManager通过id查找Fragment，第三个元素转换为2号元素
        fragmentTransaction =
                fragmentManager.beginTransaction().hide(mFragments[0]).hide(mFragments[1]).hide(mFragments[2]);   //当前3个元素处于隐藏状态，对Manager进行管理，需要一个Transaction，3个事务要么一起执行，要么都不执行
        fragmentTransaction.show(mFragments[0]).commit();   //事务提交

        rbtHome = (RadioButton)findViewById(R.id.radioHome);
        rbtService = (RadioButton)findViewById(R.id.radioService);
        rbtHelp = (RadioButton)findViewById(R.id.radioHelp);
        rbtHome.setBackgroundResource(R.drawable.shape3);
        radioGroup = (RadioGroup)findViewById(R.id.bottomGroup);    //通过此方法获取radioGroup

        //按钮添加一个事件监听，在事件监听里，RadioGroup.OnCheckedChangeListener(){是监听器
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            //当按钮有变化的时候，就可以把参数传过来，并通过按钮控制显示方式
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.i("radiogroup","checkId=" + checkedId);
                fragmentTransaction =
                        fragmentManager.beginTransaction().hide(mFragments[0]).hide(mFragments[1]).hide(mFragments[2]);

                rbtHome.setBackgroundResource(R.drawable.shape3);
                rbtService.setBackgroundResource(R.drawable.shape3);
                rbtHelp.setBackgroundResource(R.drawable.shape3);

                switch(checkedId){
                    case R.id.radioHome:
                        fragmentTransaction.show(mFragments[0]).commit();
                        rbtHome.setBackgroundResource(R.drawable.shape3);
                        break;
                    case R.id.radioService:
                        fragmentTransaction.show(mFragments[1]).commit();
                        rbtService.setBackgroundResource(R.drawable.shape3);
                        break;
                    case R.id.radioHelp:
                        fragmentTransaction.show(mFragments[2]).commit();
                        rbtHelp.setBackgroundResource(R.drawable.shape3);
                        break;
                    default:
                        break;

                }
            }
        });
    }
    }

