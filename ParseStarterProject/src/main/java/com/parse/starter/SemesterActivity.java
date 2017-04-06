package com.parse.starter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

public class SemesterActivity extends AppCompatActivity {

    Intent getDataFromDeptActivityIntent;
    String departmentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        getDataFromDeptActivityIntent = getIntent();

       departmentName = getDataFromDeptActivityIntent.getStringExtra("department");
    }

    public void fetchSemesterNumber(View view) {

        String tagId = (String) view.getTag();

        if(tagId.equals("1")) {
            tagId = "semester" + tagId;
        }

        if(tagId.equals("2")) {
            tagId = "semester" + tagId;
        }

        if(tagId.equals("3")) {
            tagId = "semester" + tagId;
        }

        if(tagId.equals("4")) {
            tagId = "semester" + tagId;
        }

        if(tagId.equals("5")) {
            tagId = "semester" + tagId;
        }

        if(tagId.equals("6")) {
            tagId = "semester" + tagId;
        }

        if(tagId.equals("7")) {
            tagId = "semester" + tagId;
        }

        if(tagId.equals("8")) {
            tagId = "semester" + tagId;
        }

        fetchSubjectsName(tagId, departmentName);
    }

    private void fetchSubjectsName(String semester, String department) {

        ArrayList<String> nameOfSubjects = new ArrayList<>();

        /* write the code to connect to db and fetch the subjects of the semester and fill the "nameOfSubjects"
        * with the name of the subjects fetched from the db
         */


        Intent subjectsActivityIntent = new Intent(this, Subject.class);
        subjectsActivityIntent.putStringArrayListExtra("subjectArray", nameOfSubjects);
        startActivity(subjectsActivityIntent);
    }
}
