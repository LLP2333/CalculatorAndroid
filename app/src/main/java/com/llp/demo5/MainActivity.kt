package com.llp.demo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.llp.demo5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var data1=0
        var data2=0
        var s=""
        binding.button1.setOnClickListener {
            s="+"
            if(binding.first.text.toString()!=""&&binding.second.text.toString()!="")
            {
                data1=Integer.parseInt(binding.first.text.toString())
                data2=Integer.parseInt(binding.second.text.toString())
                binding.textView.setText("$data1+$data2")

            }

        }
        binding.button2.setOnClickListener {
            s="-"
            if(binding.first.text.toString()!=""&&binding.second.text.toString()!="")
            {
                data1=Integer.parseInt(binding.first.text.toString())
                data2=Integer.parseInt(binding.second.text.toString())
                binding.textView.setText("$data1-$data2")

            }
        }
        binding.button3.setOnClickListener {
            s="*"
            if(binding.first.text.toString()!=""&&binding.second.text.toString()!="")
            {
                data1=Integer.parseInt(binding.first.text.toString())
                data2=Integer.parseInt(binding.second.text.toString())
                binding.textView.setText("$data1*$data2")

            }
        }
        binding.button4.setOnClickListener {
            s="/"
            if(binding.first.text.toString()!=""&&binding.second.text.toString()!="")
            {
                data1=Integer.parseInt(binding.first.text.toString())
                data2=Integer.parseInt(binding.second.text.toString())
                binding.textView.setText("$data1/$data2")

            }
        }
        binding.button5.setOnClickListener {
          binding.first.setText("")
          binding.second.setText("")
          binding.textView.setText("")
          data1=0
          data2=0
        }
        binding.button.setOnClickListener {
            if(binding.first.text.toString()!=""&&binding.second.text.toString()!="")
            {
                data1=Integer.parseInt(binding.first.text.toString())
                data2=Integer.parseInt(binding.second.text.toString())

            }
            var data=0
            when(s!=null)
            {
                s=="+"->{data=data1+data2}
                s=="-"->{data=data1-data2}
                s=="*"->{data=data1*data2}
                s=="/"->{
                    if(data2==0)
                        Toast.makeText(this,"0不能作为除数",Toast.LENGTH_SHORT).show()
                    else
                        data=data1/data2
                }
               else  ->{Toast.makeText(this,"出错了",Toast.LENGTH_SHORT).show()}
            }
            //Log.d("MainActivity", data.toString())
           // Toast.makeText(this,data,Toast.LENGTH_SHORT).show()
            if(s!="")
            {
                binding.textView.setText("$data1$s$data2=$data")
            }

        }

    }
//
//    override fun onResume() {
//        super.onResume()
//
//    }

}