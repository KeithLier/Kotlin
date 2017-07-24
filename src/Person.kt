/**
 * Created by keith on 2017/7/12.
 */
class Person {

    var lastName : String = "zhang"
        get() = field.toUpperCase()
        set

    var no : Int = 100
        get() = field
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }

    var height : Float = 176.5f
        private set
}