package arrays_and_hashing

/**
 *
 * Given a string [s],
 * return the first longest unique sub string.
 *
 **/





fun getSubString(s: String): String {
    val subStringList = Array<MutableList<String>?>(size = s.length + 1) {
        null
    }

    var sub = ""
    s.forEach {
        if (!sub.contains(it)) {
            sub += it
        } else {
            subStringList[sub.length]?.add(sub) ?: run { subStringList[sub.length] = mutableListOf(sub) }
            sub = it.toString()
        }
    }

    if (sub.length == s.length) {
        subStringList[sub.length] = mutableListOf(sub)
    }

    for (i in subStringList.size - 1 downTo 0) {
        val data = subStringList[i]?.first()
        if (data != null) {
            return data
        }
    }
    return ""
}