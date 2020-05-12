package jp.techacademy.satoshi.animaltest

import android.util.Log

open class Dog: Animal {
    //引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    //Animalクラスのメソッドをオーバーライド
    override open fun say() {
            Log.d("kotlintest",this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

}