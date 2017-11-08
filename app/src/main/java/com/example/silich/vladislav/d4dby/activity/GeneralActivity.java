package com.example.silich.vladislav.d4dby.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.silich.vladislav.d4dby.R;
import com.example.silich.vladislav.d4dby.SearchSpareParts.SearchSparePartsFragment;
import com.example.silich.vladislav.d4dby.auth.AuthFragment;
import com.example.silich.vladislav.d4dby.listResponce.ListSellersFragment;
import com.example.silich.vladislav.d4dby.register.RegistrationFragment;

public class GeneralActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    FragmentManager fragmentManager;
    Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragmentManager = getFragmentManager();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager.beginTransaction().replace(R.id.content_frame,new SearchSparePartsFragment()).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } if(fragment instanceof ListSellersFragment){
            fragmentManager.beginTransaction().replace(R.id.content_frame,new SearchSparePartsFragment()).commit();
        }
            else if (fragment instanceof RegistrationFragment){
                fragmentManager.beginTransaction().replace(R.id.content_frame,new SearchSparePartsFragment()).commit();

            }
            else if (fragment instanceof AuthFragment){
                fragmentManager.beginTransaction().replace(R.id.content_frame,new SearchSparePartsFragment()).commit();
            }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_enter) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new AuthFragment()).commit();

        } else if (id == R.id.nav_registration) {
            fragmentManager.beginTransaction().replace(R.id.content_frame,new RegistrationFragment()).commit();

        } else if (id == R.id.nav_spare_parts) {

        } else if (id == R.id.nav_sto) {

        } else if (id == R.id.nav_tires) {

        } else if (id == R.id.nav_washing) {

        }else if (id == R.id.nav_about_us){

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
