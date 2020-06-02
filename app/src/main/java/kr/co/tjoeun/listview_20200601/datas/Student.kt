package kr.co.tjoeun.listview_20200601.datas

class Student(val name: String, val birthYear: Int, val isMale:Boolean) {

    fun getKoreanAge(year: Int) : Int {
//        2020 - 1988 + 1 = 33 : 한국나이
        return year - this.birthYear + 1
    }

}