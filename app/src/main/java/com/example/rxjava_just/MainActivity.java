package com.example.rxjava_just;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mainViewModel.getObservable(preparetoDo());
        makeToast("Observables Are Ready .. .. .. ");
    }

    private List<ToDo> preparetoDo() {
        List<ToDo> toDos = new ArrayList<>();

        toDos.add(new ToDo("Clean the Room" , false));
        toDos.add(new ToDo("Wash the dishes" , true));
        toDos.add(new ToDo("Walk the dog" , false));
        toDos.add(new ToDo("Do exercises" , true));
        toDos.add(new ToDo("Clean the House" , false));
        toDos.add(new ToDo("Talk to the manager" , true));
        toDos.add(new ToDo("Read English" , false));
        toDos.add(new ToDo("Enroll in ur classes" , true));
        toDos.add(new ToDo(".." , false));
        toDos.add(new ToDo("!!" , true));
        toDos.add(new ToDo("Bla Bla Bla " , false));
        toDos.add(new ToDo("lap lap lap" , true));

        return toDos;
    }

    public void makeToast (String message ){

        Toast.makeText(this , message , Toast.LENGTH_SHORT).show();
    }
}