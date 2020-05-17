object findContentChildren_455 {
    def findContentChildren(g: Array[Int], s: Array[Int]): Int = {
        val a = g.sortWith(_<_)
        val b = s.sorted
        var gi = 0
        var si = 0
        while ( si < b.length && gi < a.length ){
            if ( a(gi) <= b(si) ){
                gi=gi+1
            }
            si=1+si
        }
        gi
    }
}