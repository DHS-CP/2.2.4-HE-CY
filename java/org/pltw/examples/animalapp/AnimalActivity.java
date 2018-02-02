package org.pltw.examples.animalapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalActivity extends ActionBarActivity {

    public static TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        output = (TextView)findViewById(R.id.output);
        //9
        Duck duck = new Duck();
        Fish fish = new Fish();
        //11 + 12
        Seal seal = new Seal();
        //27
        Fox fox = new Fox();
        //32
        ArrayList<Animal> animals = new ArrayList<>();
        //15
        animals.add(duck);
        animals.add(fish);
        animals.add(seal); //27
        animals.add(fox); //32
        //18 add duck duplicates output of duck
        //10
     /**   this.output.append("\nDuck say " + duck.say());
        this.output.append("\nFish goes " + animals.get(1).say()); //17 output is same bc it pulls out 2nd obj in array
        this.output.append("\n The object at index 1:" + animals.get(1));
        //19 hexadecimal obj stored as @Duck location **/

        for (int i = 0; i < animals.size(); i++){
            if (animals.get(i) instanceof Duck) {
                this.output.append("\nDuck say ");
                this.output.append(animals.get(i).say() + "\n");
            }
            else if (animals.get(i) instanceof Fish){
                this.output.append("Fish goes ");
                this.output.append(animals.get(i).say() + "\n");
            }
            //21 / 22
            else if (animals.get(i) instanceof Seal) {
                this.output.append(((Seal)animals.get(i)).play() + "\n");
                //27
            }
            else if (animals.get(i) instanceof Fox){
                this.output.append("Fox goes ");
                this.output.append(animals.get(i).say() + "\n");
                this.output.append(((Fox)animals.get(i)).play() + "\n");
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_animal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
