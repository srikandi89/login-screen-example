package com.srikandi.screen.login

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.login_screen_layout.view.*

class LoginScreen(context: Context?, attrs: AttributeSet?) : ConstraintLayout(context, attrs) {
    init {
        init(context, attrs)
    }

    private fun init(context: Context?, attrs: AttributeSet?) {
        inflate(context, R.layout.login_screen_layout, this)

        initComponents(context, attrs)
    }

    private fun initComponents(context: Context?, attrs: AttributeSet?) {
        val typedArray = context?.obtainStyledAttributes(attrs, R.styleable.LoginScreen)
        val count = typedArray?.indexCount ?: 0

        for (i in 0 until count) {
            when(val attr = typedArray?.getIndex(i)) {
                R.styleable.LoginScreen_loginscreen_textview_username_label -> {
                    loginscreen_textview_username.text = typedArray.getString(attr)
                }

                R.styleable.LoginScreen_loginscreen_edittext_username_hint -> {
                    loginscreen_edittext_username.hint = typedArray.getString(attr)
                }

                R.styleable.LoginScreen_loginscreen_textview_password_label -> {
                    loginscreen_textview_password.text = typedArray.getString(attr)
                }
            }
        }

        typedArray?.recycle()
    }
}