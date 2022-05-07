package com.example.homework4_2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private var text1 = 0
    private var text2 = 0
    private var text11 = ""
    private var text22 = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        savol_view.setOnClickListener {
            savol1()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol1() {
        savol_view.isEnabled = false
        a_var.text = "A:"
        b_var.text = "B:"
        c_var.text = "C:"
        d_var.text = "D:"
        savol_soni1.text = text11
        savol_soni2.text = text22
        savol_soni1.text = "T: 0"
        savol_soni2.text = "F: 0"
        text1 = 0
        text2 = 0
        when (Random().nextInt(3)) {
            0 -> {
                tv_savol.text = "Inheritance so'zining tarjimasi nima ?"
                a_savol.text = "Voris"
                b_savol.text = "Yuklash"
                c_savol.text = "O'chirish"
                d_savol.text = "O'zgaruvchi"
                a_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol2()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol2()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol2()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol2()
                }
            }
            1 -> {
                tv_savol.text = "Mutable so'zining tarjimasi nima ?"
                a_savol.text = "O'zgarmas"
                b_savol.text = "O'zgaruvchi"
                c_savol.text = "O'zgartirish"
                d_savol.text = "Nasil olish"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol2()
                }
                b_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol2()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol2()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol2()
                }
            }
            2 -> {
                tv_savol.text = "Factorial so'zining tarjimasi nima ?"
                a_savol.text = "O'zigacha bo'lgan\nsonlarni yeg'indisi"
                b_savol.text = "O'zigacha bo'lgan\nsonlarni bolinishi"
                c_savol.text = "O'zigacha bo'lgan\nsonlarni kopaytmasi"
                d_savol.text = "A yoki B yoki C"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol2()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol2()
                }
                c_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol2()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol2()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol2() {
        when (Random().nextInt(3)) {
            0 -> {
                tv_savol.text = "Amir Temur qaysi yilda tug'ilgan ?"
                a_savol.text = "1441 yil"
                b_savol.text = "1394 yil"
                c_savol.text = "1400 yil"
                d_savol.text = "1336 yil"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol3()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol3()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol3()
                }
                d_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol3()
                }
            }
            1 -> {
                tv_savol.text = "Alisher Navoi qaysi yilda tug'ilgan ?"
                a_savol.text = "1336 yil"
                b_savol.text = "1421 yil"
                c_savol.text = "1441 yil"
                d_savol.text = "1394 yil"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol3()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol3()
                }
                c_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol3()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol3()
                }
            }
            2 -> {
                tv_savol.text = "Mirzo Uligbek qaysi yilda tug'ilgan ?"
                a_savol.text = "1435 yil"
                b_savol.text = "1394 yil"
                c_savol.text = "1336 yil"
                d_savol.text = "1441 yil"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol3()
                }
                b_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol3()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol3()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol3()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol3() {
        when (Random().nextInt(3)) {
            0 -> {
                tv_savol.text = "OOP ning nechta ustuni bor ?"
                a_savol.text = "3 ta"
                b_savol.text = "4 ta"
                c_savol.text = "5 ta"
                d_savol.text = "6 ta"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol4()
                }
                b_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol4()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol4()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol4()
                }
            }
            1 -> {
                tv_savol.text = "OOP so'zining to'liq yozilishi ?"
                a_savol.text = "Office opened\nprogressing"
                b_savol.text = "Overload"
                c_savol.text = "Object oriented\nprogramming"
                d_savol.text = "Override"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol4()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol4()
                }
                c_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol4()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol4()
                }
            }
            2 -> {
                tv_savol.text = "OOP ning tarjimasi qanday ?"
                a_savol.text = "Obyektdan olingan\ndasturlash"
                b_savol.text = "Obyektlardan iborat\ndasturlash"
                c_savol.text = "A va B togri"
                d_savol.text = "Obyektga yonal -\ntirilgan dasturlash"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol4()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol4()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol4()
                }
                d_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol4()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol4() {
        when (Random().nextInt(3)) {
            0 -> {
                val r1 = Random().nextInt(100)
                val r2 = Random().nextInt(100)
                val r3 = Random().nextInt(100)
                val r4 = Random().nextInt(100)
                tv_savol.text = "$r1 + $r2 = ?\n$r3 + $r4 = ?"
                a_savol.text = "${r1 + r3}\n${r2 + r4}"
                b_savol.text = "${r3 + r2}\n${r1 + r4}"
                c_savol.text = "${r1 + r2}\n${r3 + r4}"
                d_savol.text = "${r4 + r2}\n${r4 + r3}"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol5()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol5()
                }
                c_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol5()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol5()
                }
            }
            1 -> {
                val r1 = Random().nextInt(100)
                val r2 = Random().nextInt(100)
                val r3 = Random().nextInt(100)
                val r4 = Random().nextInt(100)
                tv_savol.text = "$r1 + $r2 = ?\n$r3 + $r4 = ?"
                a_savol.text = "${r1 + r3}\n${r2 + r4}"
                b_savol.text = "${r1 + r2}\n${r3 + r4}"
                c_savol.text = "${r2 + r3}\n${r1 + r4}"
                d_savol.text = "${r1 + r2}\n${r1 + r3}"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol5()
                }
                b_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "F: $text1"
                    Toast.makeText(
                        this,
                        "To'g'ri \uD83D\uDC4D\uD83D\uDC4D\uD83D\uDC4D",
                        Toast.LENGTH_SHORT
                    ).show()
                    savol5()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "T: $text2"
                    Toast.makeText(
                        this,
                        "Noto'g'ri \uD83D\uDC4E\uD83D\uDC4E\uD83D\uDC4E",
                        Toast.LENGTH_SHORT
                    ).show()
                    savol5()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol5()
                }
            }
            2 -> {
                val r1 = Random().nextInt(100)
                val r2 = Random().nextInt(100)
                val r3 = Random().nextInt(100)
                val r4 = Random().nextInt(100)
                tv_savol.text = "$r1 + $r2 = ?\n$r3 + $r4 = ?"
                a_savol.text = "${r1 + r2}\n${r3 + r4}"
                b_savol.text = "${r2 + r4}\n${r1 + r3}"
                c_savol.text = "${r1 + r4}\n${r2 + r3}"
                d_savol.text = "${r1 + r2}\n${r1 + r4}"
                a_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "F: $text1"
                    Toast.makeText(
                        this,
                        "To'g'ri \uD83D\uDC4D\uD83D\uDC4D\uD83D\uDC4D",
                        Toast.LENGTH_SHORT
                    ).show()
                    savol5()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol5()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "T: $text2"
                    Toast.makeText(
                        this,
                        "Noto'g'ri \uD83D\uDC4E\uD83D\uDC4E\uD83D\uDC4E",
                        Toast.LENGTH_SHORT
                    ).show()
                    savol5()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol5()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol5() {
        when (Random().nextInt(3)) {
            0 -> {
                tv_savol.text = "Charlar yeg'indisi nima ?"
                a_savol.text = "Int"
                b_savol.text = "Char"
                c_savol.text = "String"
                d_savol.text = "Long"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol6()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol6()
                }
                c_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol6()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol6()
                }
            }
            1 -> {
                tv_savol.text = "Int qanaqa ma'lumot tipiga kiradi ?"
                a_savol.text = "Matematik"
                b_savol.text = "Simvolli"
                c_savol.text = "So'zli"
                d_savol.text = "Raqamli"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol6()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol6()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol6()
                }
                d_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol6()
                }
            }
            2 -> {
                tv_savol.text = "String qanaqa ma'lumot tipiga kiradi ?"
                a_savol.text = "Hammasi"
                b_savol.text = "Raqamli"
                c_savol.text = "Simvolli"
                d_savol.text = "Bilmayman"
                a_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol6()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol6()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol6()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol6()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol6() {
        when (Random().nextInt(3)) {
            0 -> {
                tv_savol.text = "Random so'zining tarjimasi nima ?"
                a_savol.text = "O'zgarmas"
                b_savol.text = "Tasodifiy"
                c_savol.text = "Raqam"
                d_savol.text = "Ma'lumot"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol7()
                }
                b_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol7()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol7()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol7()
                }
            }
            1 -> {
                tv_savol.text = "Immutable so'zining tarjimasi nima ?"
                a_savol.text = "O'zgarmas"
                b_savol.text = "O'zgaruvchi"
                c_savol.text = "O'zgartirish"
                d_savol.text = "Nasil olish"
                a_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol7()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni1.text = "F: $text2"
                    savol7()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol7()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol7()
                }
            }
            2 -> {
                tv_savol.text = "Throw so'zining tarjimasi nima ?"
                a_savol.text = "Qabul qilmoq"
                b_savol.text = "Olish"
                c_savol.text = "Berish"
                d_savol.text = "Irgitmoq"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol7()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol7()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol7()
                }
                d_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol7()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol7() {
        when (Random().nextInt(3)) {
            0 -> {
                tv_savol.text = "1 - Jahon urushi qaysi yilda boshlandi ?"
                a_savol.text = "1890 yil"
                b_savol.text = "1920 yil"
                c_savol.text = "1918 yil"
                d_savol.text = "1919 yil"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol8()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol8()
                }
                c_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol8()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol8()
                }
            }
            1 -> {
                tv_savol.text = "2 - Jahon urushi qaysi yili boshlandi ?"
                a_savol.text = "1425 yil"
                b_savol.text = "1435 yil"
                c_savol.text = "1445 yil"
                d_savol.text = "1441 yil"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol8()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol8()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol8()
                }
                d_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol8()
                }
            }
            2 -> {
                tv_savol.text = "Covid-19 qaysi yili paydo bo'ldi ?"
                a_savol.text = "2020 yil"
                b_savol.text = "2021 yil"
                c_savol.text = "2019 yil"
                d_savol.text = "2022 yil"
                a_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol8()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol8()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol8()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol8()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol8() {
        when (Random().nextInt(3)) {
            0 -> {
                tv_savol.text = "HashMap qanday list ?"
                a_savol.text = "Immutable"
                b_savol.text = "Mutable"
                c_savol.text = "A va B"
                d_savol.text = "Bilmayman"
                a_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol9()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol9()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol9()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol9()
                }
            }
            1 -> {
                tv_savol.text = "HashSet qanday list ?"
                a_savol.text = "Immutable va Mutable"
                b_savol.text = "Immutable"
                c_savol.text = "Bilmayman"
                d_savol.text = "Mutable"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol9()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol9()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol9()
                }
                d_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol9()
                }
            }
            2 -> {
                tv_savol.text = "ArrayList qanday list ?"
                a_savol.text = "Immutable va Mutable"
                b_savol.text = "Immutable"
                c_savol.text = "Mutable"
                d_savol.text = "Bilmayman"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol9()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol9()
                }
                c_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    savol9()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    savol9()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol9() {
        val r1 = Random().nextInt(100)
        val r2 = Random().nextInt(10)
        val r3 = Random().nextInt(100)
        val r4 = Random().nextInt(10)
        if (r1 == r3 && r2 == r4) {
            savol9()
        } else {
            when (Random().nextInt(3)) {
                0 -> {
                    tv_savol.text = "$r1 * $r2 + $r3 * $r4 = ?"
                    a_savol.text = "${r1 * r3 + r2 * r4}"
                    b_savol.text = "${r2 * r3 + r4 * r1}"
                    c_savol.text = "${r4 + r1 + r3 * r2}"
                    d_savol.text = "${r1 * r2 + r3 * r4}"
                    a_var.setOnClickListener {
                        text2 += 1
                        savol_soni2.text = "F: $text2"
                        Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                        savol10()
                    }
                    b_var.setOnClickListener {
                        text2 += 1
                        savol_soni2.text = "F: $text2"
                        Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                        savol10()
                    }
                    c_var.setOnClickListener {
                        text2 += 1
                        savol_soni2.text = "F: $text2"
                        Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                        savol10()
                    }
                    d_var.setOnClickListener {
                        text1 += 1
                        savol_soni1.text = "T: $text1"
                        Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                        savol10()
                    }
                }
                1 -> {
                    tv_savol.text = "$r1 * $r2 + $r3 * $r4 = ?"
                    a_savol.text = "${r1 * r2 + r3 * r4}"
                    b_savol.text = "${r2 * r3 + r4 * r1}"
                    c_savol.text = "${r4 + r1 + r3 * r2}"
                    d_savol.text = "${r1 * r3 + r2 * r4}"
                    a_var.setOnClickListener {
                        text1 += 1
                        savol_soni1.text = "F: $text1"
                        Toast.makeText(
                            this,
                            "To'g'ri \uD83D\uDC4D\uD83D\uDC4D\uD83D\uDC4D",
                            Toast.LENGTH_SHORT
                        ).show()
                        savol10()
                    }
                    b_var.setOnClickListener {
                        text2 += 1
                        savol_soni2.text = "F: $text2"
                        Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                        savol10()
                    }
                    c_var.setOnClickListener {
                        text2 += 1
                        savol_soni2.text = "F: $text2"
                        Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                        savol10()
                    }
                    d_var.setOnClickListener {
                        text2 += 1
                        savol_soni2.text = "T: $text2"
                        Toast.makeText(
                            this,
                            "Noto'g'ri \uD83D\uDC4E\uD83D\uDC4E\uD83D\uDC4E",
                            Toast.LENGTH_SHORT
                        ).show()
                        savol10()
                    }
                }
                2 -> {
                    tv_savol.text = "$r1 * $r2 + $r3 * $r4 = ?"
                    a_savol.text = "${r1 * r3 + r2 * r4}"
                    b_savol.text = "${r1 * r2 + r3 * r4}"
                    c_savol.text = "${r4 + r1 + r3 * r2}"
                    d_savol.text = "${r2 * r3 + r4 * r1}"
                    a_var.setOnClickListener {
                        text2 += 1
                        savol_soni2.text = "F: $text2"
                        Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                        savol10()
                    }
                    b_var.setOnClickListener {
                        text1 += 1
                        savol_soni1.text = "F: $text1"
                        Toast.makeText(
                            this,
                            "To'g'ri \uD83D\uDC4D\uD83D\uDC4D\uD83D\uDC4D",
                            Toast.LENGTH_SHORT
                        ).show()
                        savol10()
                    }
                    c_var.setOnClickListener {
                        text2 += 1
                        savol_soni2.text = "F: $text2"
                        Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                        savol10()
                    }
                    d_var.setOnClickListener {
                        text2 += 1
                        savol_soni2.text = "T: $text2"
                        Toast.makeText(
                            this,
                            "Noto'g'ri \uD83D\uDC4E\uD83D\uDC4E\uD83D\uDC4E",
                            Toast.LENGTH_SHORT
                        ).show()
                        savol10()
                    }
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun savol10() {
        when (Random().nextInt(3)) {
            0 -> {
                tv_savol.text = "Android Studio vs. Intellej IDEA"
                a_savol.text = "Intellej IDEA"
                b_savol.text = "Android Studio"
                c_savol.text = "A va B"
                d_savol.text = "Bilmayman"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    natija()
                }
                b_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    natija()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    natija()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    natija()
                }
            }
            1 -> {
                tv_savol.text = "Java vs. Kotlin"
                a_savol.text = "Java va Kotlin"
                b_savol.text = "Java"
                c_savol.text = "Kotlin"
                d_savol.text = "Bilmayman"
                a_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    natija()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    natija()
                }
                c_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    natija()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    natija()
                }
            }
            2 -> {
                tv_savol.text = "Windows vs. Macbook"
                a_savol.text = "Windows va Macbook"
                b_savol.text = "Windows"
                c_savol.text = "Macbook"
                d_savol.text = "Bilmayman"
                a_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    natija()
                }
                b_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    natija()
                }
                c_var.setOnClickListener {
                    text1 += 1
                    savol_soni1.text = "T: $text1"
                    Toast.makeText(this, "To'g'ri 👍👍👍", Toast.LENGTH_SHORT).show()
                    natija()
                }
                d_var.setOnClickListener {
                    text2 += 1
                    savol_soni2.text = "F: $text2"
                    Toast.makeText(this, "Noto'g'ri 👎👎👎", Toast.LENGTH_SHORT).show()
                    natija()
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun natija() {
        savol_view.isEnabled = true
        a_var.isEnabled = false
        b_var.isEnabled = false
        c_var.isEnabled = false
        d_var.isEnabled = false
        when {
            text1 > text2 -> {
                tv_savol.text = "Tabriklaymiz, Siz g'olibsiz !!!\nEndi sovg'a tanlang..."
                savol_view.text = "Sovg'a tanlash"
                a_var.text = ""
                b_var.text = ""
                c_var.text = ""
                d_var.text = ""
                a_savol.text = ""
                b_savol.text = ""
                c_savol.text = ""
                d_savol.text = ""
                savol_view.setOnClickListener {
                    savol_view.text = "Tanlang..."
                    a_var.text = "🎁🎁🎁"
                    b_var.text = "🎁🎁🎁"
                    c_var.text = "🎁🎁🎁"
                    d_var.text = "🎁🎁🎁"
                    a_savol.text = "??????????"
                    b_savol.text = "??????????"
                    c_savol.text = "??????????"
                    d_savol.text = "??????????"

                    a_var.isEnabled = true
                    b_var.isEnabled = true
                    c_var.isEnabled = true
                    d_var.isEnabled = true
                    a_var.setOnClickListener {
                        a_savol.text = "MACBOOK m1 Pro"
                        savol_view.text = "Start Test"
                        a_var.text = "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89"
                        b_var.text = ""
                        c_var.text = ""
                        d_var.text = ""
                        b_savol.text = ""
                        c_savol.text = ""
                        d_savol.text = ""
                        b_var.isEnabled = false
                        c_var.isEnabled = false
                        d_var.isEnabled = false
                        savol_view.setOnClickListener {
                            b_var.isEnabled = true
                            c_var.isEnabled = true
                            d_var.isEnabled = true
                            savol1()
                        }
                    }
                    b_var.setOnClickListener {
                        b_savol.text = "3 xonali uy"
                        savol_view.text = "Start Test"
                        a_var.text = ""
                        b_var.text = "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89"
                        c_var.text = ""
                        d_var.text = ""
                        a_savol.text = ""
                        c_savol.text = ""
                        d_savol.text = ""
                        a_var.isEnabled = false
                        c_var.isEnabled = false
                        d_var.isEnabled = false
                        savol_view.setOnClickListener {
                            a_var.isEnabled = true
                            c_var.isEnabled = true
                            d_var.isEnabled = true
                            savol1()
                        }
                    }
                    c_var.setOnClickListener {
                        c_savol.text = "Electro TESLA"
                        savol_view.text = "Start Test"
                        a_var.text = ""
                        b_var.text = ""
                        c_var.text = "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89"
                        d_var.text = ""
                        a_savol.text = ""
                        b_savol.text = ""
                        d_savol.text = ""
                        a_var.isEnabled = false
                        b_var.isEnabled = false
                        d_var.isEnabled = false

                        savol_view.setOnClickListener {
                            a_var.isEnabled = true
                            b_var.isEnabled = true
                            d_var.isEnabled = true
                            savol1()
                        }
                    }
                    d_var.setOnClickListener {
                        d_savol.text = "iPhone 13 Pro Max"
                        savol_view.text = "Start Test"
                        a_var.text = ""
                        b_var.text = ""
                        c_var.text = ""
                        d_var.text = "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89"
                        a_savol.text = ""
                        b_savol.text = ""
                        c_savol.text = ""
                        a_var.isEnabled = false
                        b_var.isEnabled = false
                        c_var.isEnabled = false
                        savol_view.setOnClickListener {
                            a_var.isEnabled = true
                            b_var.isEnabled = true
                            c_var.isEnabled = true
                            savol1()
                        }
                    }
                }
            }
            text1 == text2 -> {
                a_var.isEnabled = false
                b_var.isEnabled = false
                c_var.isEnabled = false
                d_var.isEnabled = false
                tv_savol.text = "Natija Durang !!!\nEndi sovg'a tanlang..."
                savol_view.text = "Sovga tanlash..."
                a_var.text = ""
                b_var.text = ""
                c_var.text = ""
                d_var.text = ""
                a_savol.text = ""
                b_savol.text = ""
                c_savol.text = ""
                d_savol.text = ""
                savol_view.setOnClickListener {
                    savol_view.text = "Tanlang..."
                    a_var.text = "🎁🎁🎁"
                    b_var.text = "🎁🎁🎁"
                    c_var.text = "🎁🎁🎁"
                    d_var.text = "🎁🎁🎁"
                    a_savol.text = "??????????"
                    b_savol.text = "??????????"
                    c_savol.text = "??????????"
                    d_savol.text = "??????????"

                    a_var.isEnabled = true
                    b_var.isEnabled = true
                    c_var.isEnabled = true
                    d_var.isEnabled = true
                    a_var.setOnClickListener {
                        a_savol.text = "Muzlatgich"
                        savol_view.text = "Start Test"
                        a_var.text = "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89"
                        b_var.text = ""
                        c_var.text = ""
                        d_var.text = ""
                        b_savol.text = ""
                        c_savol.text = ""
                        d_savol.text = ""
                        b_var.isEnabled = false
                        c_var.isEnabled = false
                        d_var.isEnabled = false
                        savol_view.setOnClickListener {
                            b_var.isEnabled = true
                            c_var.isEnabled = true
                            d_var.isEnabled = true
                            savol1()
                        }
                    }
                    b_var.setOnClickListener {
                        b_savol.text = "1 xonali uycha"
                        savol_view.text = "Start Test"
                        a_var.text = ""
                        b_var.text = "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89"
                        c_var.text = ""
                        d_var.text = ""
                        a_savol.text = ""
                        c_savol.text = ""
                        d_savol.text = ""
                        a_var.isEnabled = false
                        c_var.isEnabled = false
                        d_var.isEnabled = false
                        savol_view.setOnClickListener {
                            a_var.isEnabled = true
                            c_var.isEnabled = true
                            d_var.isEnabled = true
                            savol1()
                        }
                    }
                    c_var.setOnClickListener {
                        c_savol.text = "Nexia 3"
                        savol_view.text = "Start Test"
                        a_var.text = ""
                        b_var.text = ""
                        c_var.text = "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89"
                        d_var.text = ""
                        a_savol.text = ""
                        b_savol.text = ""
                        d_savol.text = ""
                        a_var.isEnabled = false
                        b_var.isEnabled = false
                        d_var.isEnabled = false
                        savol_view.setOnClickListener {
                            a_var.isEnabled = true
                            b_var.isEnabled = true
                            d_var.isEnabled = true
                            savol1()
                        }
                    }
                    d_var.setOnClickListener {
                        d_savol.text = "Samsung s10"
                        savol_view.text = "Start Test"
                        a_var.text = ""
                        b_var.text = ""
                        c_var.text = ""
                        d_var.text = "\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89"
                        a_savol.text = ""
                        b_savol.text = ""
                        c_savol.text = ""
                        a_var.isEnabled = false
                        b_var.isEnabled = false
                        c_var.isEnabled = false
                        savol_view.setOnClickListener {
                            a_var.isEnabled = true
                            b_var.isEnabled = true
                            c_var.isEnabled = true
                            savol1()
                        }
                    }
                }
            }
            else -> {
                a_var.isEnabled = false
                b_var.isEnabled = false
                c_var.isEnabled = false
                d_var.isEnabled = false
                tv_savol.text = "Afsuski siz mag'lub bo'ldingiz !!!"
                savol_view.text = "Testni boshlash"
                a_var.text = "\uD83D\uDC4E\uD83D\uDC4E"
                b_var.text = "\uD83D\uDC4E\uD83D\uDC4E"
                c_var.text = "\uD83D\uDC4E\uD83D\uDC4E"
                d_var.text = "\uD83D\uDC4E\uD83D\uDC4E"
                a_savol.text = "Siz mag'lub bo'ldingiz"
                b_savol.text = "Siz mag'lub bo'ldingiz"
                c_savol.text = "Siz mag'lub bo'ldingiz"
                d_savol.text = "Siz mag'lub bo'ldingiz"

                savol_view.setOnClickListener {
                    a_var.isEnabled = true
                    b_var.isEnabled = true
                    c_var.isEnabled = true
                    d_var.isEnabled = true
                    savol1()
                }
            }
        }
    }
}