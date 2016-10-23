package com.example.ghisa.practiceadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.example.ghisa.practiceadapter.R;
import com.example.ghisa.practiceadapter.user.Student;

import java.util.ArrayList;

/**
 * Created by ghisa on 10/21/2016.
 */

public class StudentAdapterAddForm extends ArrayAdapter<Student> {

    public StudentAdapterAddForm(Context context, ArrayList<Student> students) {
        super(context, 0, students);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Student students = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.form_add_student, parent, false);
        }
        // Lookup view for data population
        EditText id = (EditText) convertView.findViewById(R.id.edit_id);
        EditText no_reg = (EditText) convertView.findViewById(R.id.edit_no_reg);
        EditText name = (EditText) convertView.findViewById(R.id.edit_name);
        EditText email = (EditText) convertView.findViewById(R.id.edit_email);
        EditText phone = (EditText) convertView.findViewById(R.id.edit_phone);
        // Populate the data into the template view using the data object
        id.setText(students.getId()+"");
        no_reg.setText(students.getNo_reg());
        name.setText(students.getName());
        email.setText(students.getEmail());
        phone.setText((students.getPhone()));
        // Return the completed view to render on screen
        return convertView;
    }

}

