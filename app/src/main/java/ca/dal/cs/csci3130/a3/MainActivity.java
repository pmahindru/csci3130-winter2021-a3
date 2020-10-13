package ca.dal.cs.csci3130.a3;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.addDogList();
        this.addVehicleList();
    }


    protected void addDogList() {
        Spinner dogList = (Spinner) findViewById(R.id.dogList);
        List<String> dogs = new ArrayList<String>();
        dogs.add("HUSKY");
        dogs.add("DALMATIAN");
        dogs.add("BULLDOG");
        @SuppressLint("ResourceType") ArrayAdapter<String> dogListAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, dogs);
        dogListAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        dogList.setAdapter(dogListAdapter);
    }

    protected void addVehicleList() {
        Spinner vehicleList = (Spinner) findViewById(R.id.vehicleList);
        List<String> vehicles = new ArrayList<String>();
        vehicles.add("BUS");
        vehicles.add("TRUCK");
        @SuppressLint("ResourceType") ArrayAdapter<String> vehicleListAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, vehicles);
        vehicleListAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        vehicleList.setAdapter(vehicleListAdapter);
    }
}