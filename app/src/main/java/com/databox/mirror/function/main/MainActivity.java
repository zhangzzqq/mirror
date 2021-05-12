package com.databox.mirror.function.main;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.databox.mirror.R;
import com.databox.mirror.function.main.BlankFragment;
/**
 * @Author steven
 * @Description  MainActivity  用户，商家，骑手的不同
 * 可以选择用mFragmentSparseArray加载不同的fragment
 *
 * @Date  2021/5/12 22:56
 * @Param
 * @return
 **/
public class MainActivity extends AppCompatActivity {

    private RadioGroup mTabRadioGroup;
    private SparseArray<Fragment> mFragmentSparseArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style3);
        initView();


    }

    private void initView() {
        mTabRadioGroup = findViewById(R.id.tabs_rg);
        mFragmentSparseArray = new SparseArray<>();
        mFragmentSparseArray.append(R.id.today_tab, BlankFragment.newInstance("今日"));
        mFragmentSparseArray.append(R.id.record_tab, BlankFragment.newInstance("记录"));
        mFragmentSparseArray.append(R.id.contact_tab, BlankFragment.newInstance("通讯录"));
        mFragmentSparseArray.append(R.id.settings_tab, BlankFragment.newInstance("设置"));
        mTabRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // 具体的fragment切换逻辑可以根据应用调整，例如使用show()/hide()
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        mFragmentSparseArray.get(checkedId)).commit();
            }
        });
        // 默认显示第一个
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,
                mFragmentSparseArray.get(R.id.today_tab)).commit();
    }


    public static void startActivity(Context context) {
//        Intent intent = new Intent(context, LoginNoteActivity.class);
//        context.startActivity(intent);
    }

}
