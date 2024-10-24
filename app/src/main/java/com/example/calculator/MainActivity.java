package com.example.calculator;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, negative, five, six, seven, eighit, nine, equle, modules, multiply, clear, delete, add, subtract, zero, dot, diviotion;
    TextView data;
    String expretion;
    int num1, num2;
    float res;
    String operator;

    boolean invaild = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eighit = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        equle = findViewById(R.id.equle);
        diviotion = findViewById(R.id.divider);
        multiply = findViewById(R.id.multiply);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        clear = findViewById(R.id.clearAllbutton);
        delete = findViewById(R.id.delete);
        modules = findViewById(R.id.modules);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        negative = findViewById(R.id.negativebutton);
        data = findViewById(R.id.data);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data.setText(data.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data.setText(data.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data.setText(data.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data.setText(data.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data.setText(data.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data.setText(data.getText().toString() + "7");
            }
        });
        eighit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data.setText(data.getText().toString() + "9");
            }
        });
        equle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (data.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_LONG).show();
                } else {
try{
                   String totalexpretion = data.getText().toString();
                    String[] expretion = totalexpretion.split(" ");
                     float []result1= new float[expretion.length];
                     String[] operators= new String[expretion.length];
                     int j=0;
                   result1[j] = Float.parseFloat(expretion[j]);
                   j++;
                    for (int i = 1; i < expretion.length; i += 2) {
                     String  operator=expretion[i];
                      float num=Float.parseFloat(expretion[i+1]);

                        if(operator.equals("x")||operator.equals("÷")||operator.equals("%")){
                             if (operator.equals("x")) {
                                result1[j-1] *=num;}
                          else if (operator.equals("÷")){

                               if(num==0) {
                                   throw new ArithmeticException("invalid can not divied by zero");
                               }
                               else {
                                   result1[j-1] /= num;

                           }}
                          else if(operator.equals("%")){
                                 result1[j-1] %= num;
                             }
                        }
                               else{
                                   operators[j-1]=operator;
                          result1[j]=num;
                          j++;
                           }


                            }
                float result=result1[0];
                  for (int i = 0; i <j-1; i ++) {
                      String operator=operators[i];
                      Float nextnumb=result1[i + 1];
                      if(operator.equals("+")||operator.equals("-")){
                        if (operator.equals("+")) {
                            result += nextnumb;

                        }
                        if (operator.equals("-")) {
                            result -= nextnumb;

                        } }
                    }
                       // Toast.makeText(MainActivity.this, "invalid can not divied by zero", Toast.LENGTH_LONG).show();

                       // String format = String.format("%.3f", result);
                        data.setText(String.valueOf(result));
                   // Log.d("asdasdasdasd",format);


                }catch (ArithmeticException e){
String mas=e.getMessage();
Toast.makeText(MainActivity.this, mas, Toast.LENGTH_LONG).show();}


                }


            }

        });
        modules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_LONG).show();
                } else {
                    data.setText(data.getText().toString() + " % ");
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_LONG).show();
                } else {
                    data.setText(data.getText().toString() + " + ");

                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_LONG).show();
                } else {
                    data.setText(data.getText().toString() + " x ");

                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_LONG).show();
                } else {
                    data.setText(data.getText().toString() + " - ");

                }
            }
        });
        diviotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_LONG).show();
                } else {

                    data.setText(data.getText().toString() + " ÷ ");
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + ".");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText(data.getText().toString() + "0");
            }
        });
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data.setText(data.getText().toString() + "-");

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText("");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                int length = data.getText().toString().length();
                if (length > 0) {
                    String newdata = data.getText().toString().substring(0, length - 1);
                    data.setText(newdata);
                }
            }
        });

    }

    /*public float calculate(String expretion){
        String [] num=expretion.split(" ");
        int j=0;
        float result=Float.parseFloat(num[j]);

        for(int i=1;i<num.length;i+=2) {
            if (num[i] .equals("+") )
                {
                    result +=Integer.parseInt(num[j+=2]) ;

                }
              else  if(num[i] .equals("x")){
                    result *=Integer.parseInt(num[j+=2]) ;

                }
             else   if(num[i] .equals("-")){
                    result -=Integer.parseInt(num[j+=2]) ;

                }
              else  if(num[i] .equals("%")){
                    result %=Integer.parseInt(num[j+=2]) ;

                }
               else if(num[i] .equals("÷")){
                    if(Integer.parseInt(num[j+=2])==0) {
                        Toast.makeText(MainActivity.this, "invalid can not divied by zero", Toast.LENGTH_LONG).show();
                        result=0;
                    }else {
                        result /= Integer.parseInt(num[j += 2]);
                    }
                }

        }
        return result;
        }*/
}
