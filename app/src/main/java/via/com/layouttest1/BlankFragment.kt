package via.com.layouttest1


import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.bottom_dialog.*


/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : BottomSheetDialogFragment() {


//    private var mListener: OnFragmentInteractionListener? = null

    lateinit var button:ImageButton
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.bottom_dialog,container,false)
        button = view.findViewById(R.id.buttonSignIn)
        button.setOnClickListener {
            buttonSignIn.visibility=View.INVISIBLE
            Log.e("button:", "clicked!")
        }
//        buttonSignIn.setOnClickListener {
//            buttonSignIn.visibility=View.INVISIBLE
//            Log.e("button:", "clicked!")
//        }
        return view
    }
//    override fun onAttach(context: Context?) {
//        super.onAttach(context)
//        if (context is OnFragmentInteractionListener) {
//            mListener = context
//        } else {
//            throw RuntimeException(context!!.toString() + " must implement OnListFragmentInteractionListener")
//        }
//    }
    override fun onStart() {
        super.onStart()

    }


//    interface OnFragmentInteractionListener {
//        //メインアクティビティーのコールバックメソッドの定義
//        fun onStartMain()
//    }

}// Required empty public constructor
