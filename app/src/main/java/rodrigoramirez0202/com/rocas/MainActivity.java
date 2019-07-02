package rodrigoramirez0202.com.rocas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.tool_bar);

        setSupportActionBar(toolbar);
    }

    public void informacion(View vista){

        Intent intent=new Intent(this, InfoClase.class);
        startActivity(intent);
    }

    public void salirApp (View vista){

        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu_en_activity, mimenu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem miitem){

        int id=miitem.getItemId();

        if(id==R.id.info){

            informacion(null);
            return true;
        }else if(id==R.id.configuracion){

            return true;
        }

        return super.onOptionsItemSelected(miitem);
    }
}














