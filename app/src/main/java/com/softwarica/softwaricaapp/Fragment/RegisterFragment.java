package com.softwarica.softwaricaapp.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.softwarica.softwaricaapp.Model.Student;
import com.softwarica.softwaricaapp.R;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;


public class RegisterFragment extends Fragment {

    EditText name,age,address;
    RadioGroup rdoGender;
    Button btnSubmit;
    RadioButton btnGender;
    public RegisterFragment() {

        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_register, container, false);
        name=view.findViewById(R.id.etName);
        age=view.findViewById(R.id.etAge);
        rdoGender = view.findViewById(R.id.grpGender);
        address=view.findViewById(R.id.etAddress);
        btnSubmit=view.findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectGender=rdoGender.getCheckedRadioButtonId();
                btnGender=view.findViewById(selectGender);
//                MainActivity.students.add(new Student(name.getText().toString(),Integer.parseInt(age.getText().toString()),btnGender.getText().toString(),address.getText().toString()));
                Toast toast=Toast.makeText(getContext(),"Student created",Toast.LENGTH_LONG);
                toast.show();
//                List<Student> list=MainActivity.students;
//                for(int i=0; i<list.size(); i++) {
//                    Student currentx = list.get(i);
//                    Toast.makeText(getContext(), (CharSequence) currentx,Toast.LENGTH_LONG);
//                    // Do something with the value
//                }
            }
        });


        return view;
    }

}
