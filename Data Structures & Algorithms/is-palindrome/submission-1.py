import re

class Solution:
    def isPalindrome(self, s: str) -> bool:
        lowS = s.lower()
        cleanS = re.sub(r"[^a-z0-9]", "", lowS)

        left = 0
        right = len(cleanS) - 1

        while left < right:
            if cleanS[left] != cleanS[right]:
                return False

            left += 1
            right -= 1

        return True