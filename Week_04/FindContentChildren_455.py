class FindContentChildren_455:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()
        gi = 0
        si = 0
        while gi < len(g) and si < len(s) :
            if  g[gi] <= s[si] :
                gi+=1
            si+=1
        return gi

            
        