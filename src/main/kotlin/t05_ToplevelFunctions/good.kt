package t05_ToplevelFunctions.good

fun isPhoneNumber(s: String) =
    s.length == 7 && s.all { it.isDigit() }
