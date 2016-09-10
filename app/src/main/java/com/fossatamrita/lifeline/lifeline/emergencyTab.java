package com.fossatamrita.lifeline.lifeline;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class DataObject {
    private String name;
    private String dob;
    private String age;
    private String sex;
    private String emailId;
    private String bloodGroup;
    private String sugarLevel;
    private String medicalIllness;
    private String aaddharId;
    private String allergies;
    private String presciptions;
    private String phoneNo;
    private String bloodPresure;


    DataObject (String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8, String text9, String text10, String text11, String text12, String text13){
        name = text1;
        dob = text2;
        age = text3;
        sex = text4;
        emailId = text5;
        bloodGroup = text6;
        sugarLevel = text7;
        medicalIllness = text8;
        aaddharId = text9;
        allergies = text10;
        presciptions = text11;
        phoneNo = text12;
        bloodPresure = text13;
    }

    public String getName() {
        return name;
    }

    public void setName(String mText1) {
        this.name = mText1;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String mText1) {
        this.dob = mText1;
    }
}

public class emergencyTab extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_tab);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        layout1 l1 = new layout1();
        fragmentManager.beginTransaction().replace(R.id.main_frame, l1, l1.getTag()).commit();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.emergency_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(view.getContext());
                alertDialogBuilder.setMessage("Are you sure,You want to alert for emergencies?");

                alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(emergencyTab.this,"Alert sent to Emergency contacts",Toast.LENGTH_LONG).show();
                    }
                });

                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.emergency_tab, menu);
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



        if (id == R.id.nav_layout1) {
              layout1 l1 = new layout1();
              fragmentManager.beginTransaction().replace(R.id.main_frame, l1, l1.getTag()).commit();
              Toast.makeText(this, "Layout1", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_layout2) {
            layout2 l2 = new layout2();
            fragmentManager.beginTransaction().replace(R.id.main_frame, l2, l2.getTag()).commit();
            Toast.makeText(this, "Layout2", Toast.LENGTH_SHORT).show();


        } else if (id == R.id.nav_layout3) {
            layout3 l3 = new layout3();
            fragmentManager.beginTransaction().replace(R.id.main_frame, l3, l3.getTag()).commit();
            Toast.makeText(this, "Layout3", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_share) {


        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        assert drawer != null;
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
