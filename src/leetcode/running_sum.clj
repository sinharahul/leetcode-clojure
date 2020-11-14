(ns leetcode.running-sum)

;https://leetcode.com/problems/running-sum-of-1d-array/
(defn running-sum-of-1d-array
  "docstring"
  [arr]
  (reductions + arr)
  )

(println (running-sum-of-1d-array [1,2,3]))

; another way
;https://stackoverflow.com/questions/31741252/clojure-map-pass-function-multiple-parameters
(defn plus-x [x i] (+ x i))
(map (partial plus-x 1) [1 2 3])