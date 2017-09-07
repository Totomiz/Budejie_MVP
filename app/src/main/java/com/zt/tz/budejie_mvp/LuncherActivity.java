package com.zt.tz.budejie_mvp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LuncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luncher);
        View target = findViewById(R.id.iv_bg);
        // 第二个参数－－－propertyName:你要执行什么动画－－－动画的属性名称
        // 缩放动画：scaleX
        // 渐变动画：
        // 第三个参数－－－动画变化范围（例如：缩放动画变化范围0.0-1.0之间）
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(target, "alpha",
                0.0f, 1.0f);
        // 设置动画执行的时间（企业级开发标准：执行时间一般情况2-3秒钟）
        objectAnimator.setDuration(2000);
        // 启动动画
        objectAnimator.start();
        objectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                startActivity(new Intent(LuncherActivity.this,MainActivity.class));
                finish();
            }
        });
    }
}
