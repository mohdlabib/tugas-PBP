package id.ac.unri.ft.informatika.pbpmodul3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactUsActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView location, phone, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        location = findViewById(R.id.location);
        phone = findViewById(R.id.phone);
        email= findViewById(R.id.email);

        location.setOnClickListener(this);
        phone.setOnClickListener(this);
        email.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.location) {
            Intent loc = new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("google.navigation:q="+location.getText().toString()));
            startActivity(loc);
        } else if (v.getId() == R.id.email) {
            Intent mail = new Intent(Intent.ACTION_SENDTO,
                    Uri.fromParts("mailto", email.getText().toString(), null));
            mail.putExtra(Intent.EXTRA_SUBJECT, "Greating..");
            mail.putExtra(Intent.EXTRA_TEXT, "Ini messagenya :)");
            startActivity(mail);
        } else if (v.getId() == R.id.phone) {
            Intent call = new Intent(Intent.ACTION_DIAL);
            call.setData(Uri.parse("tel:"+phone.getText().toString()));
            startActivity(call);
        }
    }

}
