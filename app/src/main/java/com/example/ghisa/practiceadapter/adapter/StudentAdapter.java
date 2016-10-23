package com.example.ghisa.practiceadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ghisa.practiceadapter.R;
import com.example.ghisa.practiceadapter.user.Student;

import java.util.ArrayList;

/**
 * Created by ghisa on 10/7/2016.
 */

public class StudentAdapter extends ArrayAdapter<Student>{
    public StudentAdapter(Context context, ArrayList<Student> students) {
        super(context, 0, students);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Student students = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_instance, parent, false);
        }
        // Lookup view for data population
        TextView id = (TextView) convertView.findViewById(R.id.id);
        TextView no_reg = (TextView) convertView.findViewById(R.id.no_reg);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView email = (TextView) convertView.findViewById(R.id.email);
        TextView phone = (TextView) convertView.findViewById(R.id.phone);
        // Populate the data into the template view using the data object
        id.setText(students.getId() +"");
        no_reg.setText(students.getNo_reg());
        name.setText(students.getName());
        email.setText(students.getEmail());
        phone.setText((students.getPhone()));
        // Return the completed view to render on screen
        return convertView;
    }




}
