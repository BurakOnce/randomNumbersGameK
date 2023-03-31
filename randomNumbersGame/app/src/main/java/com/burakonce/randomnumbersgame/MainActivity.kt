package com.burakonce.randomnumbersgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


var cash: Int=5

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2.text = "your cash is ${cash}"

        val intent=intent
        val isim = intent.getStringExtra("isimGirdisi")
        textView3.text=isim
    }

    fun bet(view: View)
    {

        var howMany: Int=0

            var numbers = List(50) { Random.nextInt(0, 50) }



            if(bet.text.toString().toInt() > cash) { textView.text="You don't have that cash " }
            else
            {
                for (i in numbers) //search for guess from array
                {
                    if(numbers[i] == editTextNumber2.text.toString().toInt())
                        howMany++
                }


                if (howMany == 0)
                {
                    textView.text="Your guess is not in our numbers"
                    cash = cash - bet.text.toString().toInt();
                    textView2.text="New cash ${cash} $"
                }

                else if (howMany == 1)
                {
                    textView.text="Your guess is in our numbers for 1 time"
                    textView2.text="Cash not change ${cash} $"
                }

                else if (howMany > 1)
                {
                    textView.text="Your guess is in our numbers for ${howMany} time"
                    cash = cash + 3*(bet.text.toString().toInt())
                    textView2.text="New cash ${cash} $"
                }

                if (cash <= 0)
                {
                    textView2.text="You have no cash  byeee"

                }

            }


    }

}