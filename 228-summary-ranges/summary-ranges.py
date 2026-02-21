class Solution:
    def summaryRanges(self, nums):
        res = []
        n = len(nums)

        if n == 0:
            return res

        start = nums[0]
        for i in range(1, n):
            if nums[i] != nums[i - 1] + 1:
                end = nums[i - 1]
                if start == end:
                    res.append(str(start))
                else:
                    res.append(str(start) + "->" + str(end))
                start = nums[i]
        end = nums[-1]
        if start == end:
            res.append(str(start))
        else:
            res.append(str(start) + "->" + str(end))

        return res