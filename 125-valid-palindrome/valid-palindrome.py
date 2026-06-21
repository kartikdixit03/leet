class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=''.join(ch.lower() for ch in s if ch.isalnum())
        if len(s) == 0:
            return True
        i = 0
        j = len(s)-1
        res = True
        while(i<=j):
            if s[i]!= s[j]:
                return False
            else :
                i+=1
                j-=1
        return res

        