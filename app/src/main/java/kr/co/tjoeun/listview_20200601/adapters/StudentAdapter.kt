package kr.co.tjoeun.listview_20200601.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.listview_20200601.R
import kr.co.tjoeun.listview_20200601.datas.Student

class StudentAdapter(context: Context, resId: Int, list: List<Student>) : ArrayAdapter<Student>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        val nameAndAgeTxt = row.findViewById<TextView>(R.id.nameAndAgeTxt)
        val genderTxt = row.findViewById<TextView>(R.id.genderTxt)


        val data = mList.get(position)

//        이름과 나이를 실제로 출력
//        조경진, 1988년생 => 조경진(33세)
//        => 1988년생은 2020년 현재 몇살?
//        => 2020 - 1988 + 1
//        nameAndAgeTxt.text = data.name

        nameAndAgeTxt.text = "${data.name}(${data.getKoreanAge(2020)}세)"


        if (data.isMale) {
            genderTxt.text = "남성"
        }
        else {
            genderTxt.text = "여성"
        }

        return row
    }

}