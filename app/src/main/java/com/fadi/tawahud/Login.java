package com.fadi.tawahud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {
    EditText e1,e2;
    String url="http://klearn1.000webhostapp.com/aya/api/login.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        e1=findViewById(R.id.un);
        e2=findViewById(R.id.pa);

    }

    public void login(View v)
    {
        String uname=e1.getText().toString();
        String pass=e2.getText().toString();
        StringRequest r=new StringRequest(Request.Method.POST, url,new Response.Listener<String>(){
            @Override
            public void onResponse(String o) {
                try {
                    JSONObject js=new JSONObject(o);
                    boolean res=js.getBoolean("f");
                    if(res==true) {
                        Toast.makeText(Login.this, "Welcome..", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(Login.this,Homescreen.class));


                    }

                    else
                        Toast.makeText(Login.this, "Login  Failed please try agin later", Toast.LENGTH_SHORT).show();


                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        } )
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username",uname);
                params.put("password", pass);

                return params;



            }
        }
                ;
        Volley.newRequestQueue(this).add(r);
    }
}