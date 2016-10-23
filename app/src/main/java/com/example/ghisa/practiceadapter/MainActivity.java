package com.example.ghisa.practiceadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ghisa.practiceadapter.adapter.StudentAdapter;
import com.example.ghisa.practiceadapter.user.Student;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TextView studentView, teacherView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentView  = (TextView) findViewById(R.id.student_list);
        teacherView = (TextView) findViewById(R.id.teacher_list);
        studentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,StudentActivity.class);
                startActivity(intent);
            }
        });

        teacherView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TeacherActivity.class);
                startActivity(intent);
            }
        });
    }




}
