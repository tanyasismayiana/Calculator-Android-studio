package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNum1:EditText
    lateinit var etNum2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubstact:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNum1=findViewById(R.id.etNum1)
        etNum2=findViewById(R.id.etNum2)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubstact=findViewById(R.id.btnSubcract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnmodulus)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var res1 = etNum1.text.toString().toInt()
            var res2 = etNum1.text.toString().toInt()
            addition(res1,res2)
        }
        btnSubstact.setOnClickListener {
            var res1 = etNum1.text.toString().toInt()
            var res2 = etNum1.text.toString().toInt()
            subtraction(res1,res2)
        }
        btnMultiply.setOnClickListener {
            var res1 = etNum1.text.toString().toInt()
            var res2 = etNum1.text.toString().toInt()
            multiplacation(res1,res2)
        }
        btnModulus.setOnClickListener {
            var res1 = etNum1.text.toString().toInt()
            var res2 = etNum1.text.toString().toInt()
            modulus(res1,res2)
        }

    }


    fun addition(res1:Int ,res2:Int){
        var answer= res1 + res2
        tvResult.text=answer.toString()
    }

    fun subtraction(res1:Int ,res2:Int){
        var answer= res1 + res2
        tvResult.text=answer.toString()
    }


    fun multiplacation(res1:Int ,res2:Int){
        var answer= res1 + res2
        tvResult.text=answer.toString()
    }
    fun modulus(res1:Int ,res2:Int){
        var answer= res1 + res2
        tvResult.text=answer.toString()
    }




}