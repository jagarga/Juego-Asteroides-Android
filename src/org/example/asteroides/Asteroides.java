package org.example.asteroides;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Asteroides extends Activity {

	
	private Button bAcercaDe;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
	/*	//Escuchador de evento por codigo
	 * 
       bAcercaDe =(Button) findViewById(R.id.Button03);

       bAcercaDe.setOnClickListener(new OnClickListener() {

                  public void onClick(View view) {

                       lanzarAcercaDe(null);

                 }

           });  */
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	
    @Override 
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

        case R.id.acercaDe:

               lanzarAcercaDe(null);

               break;
               
        
        case R.id.config:

            lanzarPreferencias(null);

            break;

        }

        return true; /** true -> consumimos el item, no se propaga*/

}
    
    
public static AlmacenPuntuaciones almacen = new AlmacenPuntuacionesArray();   
	
	
    public void lanzarAcercaDe(View view){

        Intent i = new Intent(this, AcercaDe.class);

              startActivity(i);

      }  
    
    
    public void lanzarPreferencias(View view){

        Intent i = new Intent(this, Preferencias.class);

              startActivity(i);

      }
    
    
    public void lanzarPuntuaciones(View view) {

    	Intent i = new Intent(this, Puntuaciones.class);

    	startActivity(i);

      }

    public void Salir(View view) {

        finish();

      }

}
