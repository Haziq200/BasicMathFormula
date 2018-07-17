package sg.edu.rp.dmsd.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFormula;
    ArrayList<MathFormula> alFormula;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewFormula);

        alFormula = new ArrayList<>();

        MathFormula formula1 = new MathFormula("Area of rectangle","Length x Length","Formula type is: Area");
        MathFormula formula2 = new MathFormula("Area of triangle","(Length of base x Length)/2","Formula type is: Area");
        MathFormula formula3 = new MathFormula("Volume of cube","Length x Length x Length","Formula type is: Volume");
        alFormula.add(formula1);
        alFormula.add(formula2);
        alFormula.add(formula3);

        caFormula = new CustomAdapter(this,R.layout.math_formula,alFormula);

        lvFormula.setAdapter(caFormula);
    }
}
