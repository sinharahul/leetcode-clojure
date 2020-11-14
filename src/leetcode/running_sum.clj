(ns leetcode.running-sum)

;https://leetcode.com/problems/running-sum-of-1d-array/
(defn running-sum-of-1d-array
  "docstring"
  [arr]
  (reductions + arr)
  )

(println (running-sum-of-1d-array [1,2,3]))
