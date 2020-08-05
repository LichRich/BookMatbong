package com.example.android.bookmatbong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class BookPage extends Activity implements View.OnClickListener {
    EditText book_client_name, book_client_phone;
    RadioGroup group;
    RadioButton radio_hall, radio_pack;
    Button btn_decrease, btn_increase, client_date, client_time, btn_ok;
    TextView book_client_count;
    String name, phone, hall, pack;
    int count;

    public static Activity bookPage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_page);

        book_client_name = (EditText) findViewById(R.id.book_client_name);
        book_client_phone = (EditText) findViewById(R.id.book_client_phone);

        group = (RadioGroup) findViewById(R.id.radio_btns);
        radio_hall = (RadioButton) findViewById(R.id.radio_hall);
        radio_pack = (RadioButton) findViewById(R.id.radio_pack);

        btn_decrease = (Button) findViewById(R.id.btn_decrease);
        btn_decrease.setOnClickListener(this);
        btn_increase = (Button) findViewById(R.id.btn_increase);
        btn_increase.setOnClickListener(this);
        book_client_count = (TextView) findViewById(R.id.client_count);
        count = Integer.parseInt(book_client_count.getText().toString());

        client_date = (Button) findViewById(R.id.client_date);
        client_time = (Button) findViewById(R.id.client_time);
        btn_ok = (Button) findViewById(R.id.btn_ok);

        bookPage = BookPage.this;
    }

    @Override
    public void onClick(View view) {

        if (book_client_name == null || book_client_phone == null){
            Toast.makeText(this, "빈 칸을 채워주세요", Toast.LENGTH_SHORT).show();
            return;
        }

        if (view.equals(btn_decrease)) {
            if (count > 0){ book_client_count.setText(--count);  }
        }
        else if (view.equals(btn_increase)) {   book_client_count.setText(++count); }

        if (view.equals(btn_ok)){
            Intent intent = new Intent(this, MainActivity.class);

            /**
             * 여기에 firebase에 정보 입력하고, 해당 데이터들을 intent에 넘겨주는 코드 작성.
             * */

            startActivity(intent);
        }
    }

    public void showTimePickerDialog(View v){
        DialogFragment timePicker = new TimePickerFragment();
        timePicker.show(timePicker.getFragmentManager(), "TimePicker");
    }

    public void showDatePickerDialog(View v){
        DialogFragment datePicker = new DatePickerFragment();
        datePicker.show(datePicker.getFragmentManager(), "DatePicker");
    }
}
