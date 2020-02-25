package com.norm.mmphonevalidatedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.norm.mmphonevalidate.MmPhoneValidate
import com.norm.mmphonevalidate.operator.DefaultOperator
import com.norm.mmphonevalidate.operator.Operator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val operatorAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            DefaultOperator.getDefaultOperatorNames()
        )
        spDefaultOperator.apply {
            adapter = operatorAdapter
            setSelection(0)
        }

        btnGetOperator.setOnClickListener {
            val phoneNumber = txtPhone.text.toString()
            if (phoneNumber.isNotEmpty()) {
                val operator = MmPhoneValidate.getOperator(phoneNumber)
                val msg = "This number is from ${operator.shortName}"
                tvMessage.text = msg
            }
        }

        btnCheckNumber.setOnClickListener {
            val phoneNumber = txtPhone.text.toString()
            val isValid = when (spDefaultOperator.selectedItem as String) {
                DefaultOperator.MPT.shortName -> MmPhoneValidate.isMpt(phoneNumber)
                DefaultOperator.TELENOR.shortName -> MmPhoneValidate.isTelenor(phoneNumber)
                DefaultOperator.MYTEL.shortName -> MmPhoneValidate.isMytel(phoneNumber)
                DefaultOperator.OOREDOO.shortName -> MmPhoneValidate.isOoredoo(phoneNumber)
                DefaultOperator.MEC.shortName -> MmPhoneValidate.isMec(phoneNumber)
                else -> false
            }

            when (isValid) {
                true -> tvMessage.text = getString(R.string.str_success)
                else -> tvMessage.text = getString(R.string.str_not_success)
            }
        }
    }
}
