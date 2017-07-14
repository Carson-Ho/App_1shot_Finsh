package scut.carson_ho.app_1shot_finsh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Carson_Ho on 17/7/12.
 */

public class Activity2 extends AppCompatActivity {
    private Button button;
    private Carson_BaseApplicaiton app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);


        button  = (Button) findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Activity2.this, Activity3.class));

//                // 当需要退出时，启动入口Activity
//                Intent intent = new Intent();
//                intent.setClass(Activity2.this, MainActivity.class);
//
//                // 设置标记位
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                // 步骤1：该标记位作用：销毁目标Activity和它之上的所有Activity，重新创建目标Activity
//
//                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//                // 步骤2：若启动的Activity位于任务栈栈顶，那么此Activity的实例就不会重建，而是重用栈顶的实例( 调用实例的 onNewIntent() )
//
//                // 在步骤1中：MainActivity的上层的Activity2会被销毁，此时MainActivity位于栈顶；由于步骤2的设置，所以不会新建MainActivity而是重用栈顶的实例&调用实onNewIntent()
//
//                // 传入自己设置的退出App标识
//                intent.putExtra("exit", true);
//
//                startActivity(intent);

            }

        });
    }
}

