package com.example.petshop;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Cat cat= new Cat("Toto");
        Dog dog = new Dog("Tommy");
        Scorpian scorpian= new Scorpian("scory");

        ArrayList<Pet_Java> petList= new ArrayList<>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpian);

        ArrayList<Pettable> pettablePets = new ArrayList<>();
        pettablePets.add(cat);
        pettablePets.add(dog);

        Mood m1 = new HappyMood();
        Mood m2 = new SadMood(new Date());

        Log.d("PetShop", "Mood1: " + m1.describe() + " at " + m1.getDate());
        Log.d("PetShop", "Mood2: " + m2.describe() + " at " + m2.getDate());



    }
}