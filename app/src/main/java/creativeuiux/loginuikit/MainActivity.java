package creativeuiux.loginuikit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);


        View button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,
                        forgot_password.class);
                startActivity(intent); // startActivity allow you to move
            }
        });

        final View Signup = findViewById(R.id.signupBut);

        Signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,
                        Signup.class);
                startActivity(intent); // startActivity allow you to move
            }
        });

    }
}
