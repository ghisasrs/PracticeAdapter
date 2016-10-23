package com.example.ghisa.practiceadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by ghisa on 10/21/2016.
 */

public class FormAddStudent extends AppCompatActivity {

    private EditText idEdit, noregEdit, nameEdit, mailEdit, phoneEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_add_student);

        idEdit = (EditText) findViewById(R.id.edit_id);
        noregEdit = (EditText) findViewById(R.id.edit_no_reg);
        nameEdit = (EditText) findViewById(R.id.edit_name);
        mailEdit = (EditText) findViewById(R.id.edit_email);
        phoneEdit = (EditText) findViewById(R.id.edit_phone);
    }
}
