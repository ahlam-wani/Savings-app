package com.example.savings

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.properties.Delegates

class PageFragment : Fragment() {
    var position: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        position = arguments?.getInt("POSITION")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
           var layoutId = if (position == 1) {
                R.layout.firstpagelayout
            } else if (position == 2) {
                R.layout.secondpagelayout
            } else if (position == 3) {
                R.layout.thirdpage
            } else R.layout.firstpagelayout


        return layoutInflater.inflate(layoutId, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var textView = view.findViewById<TextView>(R.id.btn_next)
        textView.setOnClickListener {
           // AppPreferences.instance.setAppSummary(activity!!,true)
            //startActivity(Intent(context, LandingScreenActivity::class.java))
           // requireActivity().finish()
        }
        when (position) {
            1 -> return
            2 -> return
            3 -> return
            else -> view.setBackgroundColor(
                Color.rgb(
                    (Math.random() * 255).toInt(),
                    (Math.random() * 255).toInt(),
                    (Math.random() * 255).toInt()
                )
            )
        }

    }
}